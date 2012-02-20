!SLIDE
# sequences #
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# first / rest / cons #

        (first [1 2 3])
        => 1

        (rest [1 2 3])
        => (2 3)

        (cons "hello" [1 2 3])
        => ("hello" 1 2 3)

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# take / drop #

        (take 2 [1 2 3 4 5])
        => (1 2)

        (drop 2 [1 2 3 4 5])
        => (3 4 5)

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# map / filter / reduce #

        (range 10)
        => (0 1 2 3 4 5 6 7 8 9)

        (filter odd? (range 10))
        => (1 3 5 7 9)

        (map odd? (range 10))
        => (false true false true false
        true false true false true)

        (reduce + (range 10))
        => 45

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# sort #

        (sort [1 56 2 23 45 34 6 43])
        => (1 2 6 23 34 43 45 46)

        (sort > [1 56 2 23 45 34 6 43])
        => (56 45 43 34 23 6 2 1)

        (sort-by #(.length %) ["the" "quick" "brown" "fox"])
        => ("the" "fox" "quick" "brown")

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# conj / into #

        (conj '(1 2 3) :a)
        => (:a 1 2 3)

        (into '(1 2 3) '(:a :b :c))
        => (:c :b :a 1 2 3)

        (conj [1 2 3] :a)
        => [1 2 3 :a]

        (into [1 2 3] [:a :b :c])
        => [1 2 3 :a :b :c]

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# lazy, infinite sequences #

        (set! *print-length* 5)
        => 5

        (iterate inc 0)
        => (0 1 2 3 4 ...)

        (cycle [1 2])
        => (1 2 1 2 1 ...)

        (repeat :d)
        => (:d :d :d :d :d ...)

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# interpose #

        (interpose \, ["list" "of" "words"])
        => ("list" \, "of" \, "words")

        (apply str (interpose \, ["list" "of" "words"]))
        => "list,of,words"

        (use 'clojure.contrib.str-utils)
        (str-join \, ["list" "of" "words"])
        => "list,of,words"

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# interleave / partition #

       (interleave [:a :b :c] [1 2 3])
       => (:a 1 :b 2 :c 3)

       (partition 3 [1 2 3 4 5 6 7 8 9])
       => ((1 2 3) (4 5 6) (7 8 9))

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# predicates #

        (every? odd? [1 3 5])
        => true

        (not-every? even? [2 3 4])
        => true

        (not-any? zero? [1 2 3])
        => true

        (some nil? [1 nil 2])
        => true

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# nested ops #


        (def john {:name "John Doe"
                   :address {:zip 74175, ...}})
        => #'user/john

        (get-in john [:address :zip])
        => 74175

        (assoc-in john [:address :zip] 74116)
        => {:name "John Doe", :address
        {:zip 74116}}

        (update-in john [:address :zip] inc)
        => {:name "John Doe", :address
        {:zip 74176}}

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

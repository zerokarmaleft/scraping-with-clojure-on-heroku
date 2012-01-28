!SLIDE
# syntax #
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# atomic data types #
* arbitrary precision integers - `1234567897654`
* doubles - `1.234`
* arbitrary precision doubles - `1.234M`
* ratios - `22/7`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# atomic data types, cont'd #
* strings - `"fred"`
* characters - `\a \b \c`
* symbols - `guy lewis steele`
* keywords - `:guy :lewis :steele`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# atomic data types, cont'd #
* booleans - `true false`
* null - `nil`
* regex patterns `#"a*b"`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# data literals #

## lists ##
* linked-list
* insertion at the beginning
* `'(1 2 3)`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# data literals #

## vectors ##
* indexed
* insertion at the end
* `[1 2 3]`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# data literals #

## maps ##
* key/value
* `{:a 100 :b 90}`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# data literals #

## sets ##
* keys
* `#{:a :b}`
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# homoiconicity #
## code as data ##
## data as code ##
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# homoiconicity #
## everything is an expression ##

        (<operator> <x1> <x2> ... <xn>)

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# function calls #

        (concat [1 2] [3 4])
        => [1 2 3 4]

        (concat [1 2] [3 4] [5 6])
        => [1 2 3 4 5 6]
        
        (+ 1 2)
        => 3
        
        (+ 1 2 3)
        => 6

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# function definitions #

       (def square (fn [x] (* x x)))
       => #'user/square

       (square 5)
       => 25

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# function definitions, cont'd #

        (defn
         hello
         "Returns greeting that includes name"
         [name]
         (str "Hello, " name))
         => #'user/hello

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# control flow #

        (if hell-froze-over?
            (skate!)
            (roast!))
<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# java interop #

        (.toUpperCase "it's educational!")
        => "IT'S EDUCATIONAL!"

        "it's educational!".toUpperCase();

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# java interop, cont'd #

       (.. "it's educational!"
           (substring 5 7)
           (toUpperCase))
       => "ED"

       "it's educational!".substring(5, 7)
                          .toUpperCase();

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# error handling #

        (try
          (/ 1 0)
          (catch ArithmeticException e
            "should have expected that"))

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# syntax summary #
## Java ##

       int i = 5;

       if(x == 0)
         return y;
       else
         return z;

       x * y * z;

       foo(x, y, z);

       foo.bar(x);

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

!SLIDE
# syntax summary, cont'd #
## Clojure ##

       (def i 5)

       (if (zero? x)
         y
         z)

       (* x y z)

       (foo x y z)

       (. foo bar x)

<div class="watermark">
     <img src="Clojure-glyph.svg"/>
</div>

(use 'clojure.pprint)
(use 'net.cgrand.enlive-html)

(pprint (html-resource (java.net.URL. "http://news.ycombinator.com")))

(def hn-resource (html-resource (java.net.URL. "http://news.ycombinator.com")))
(def ex-resource (html-resource "scraping/example.html"))

;; headlines
(pprint (map :content (select hn-resource [:td.title :a])))

;; scores
(pprint (map :content (select hn-resource [:td.subtext :span])))

;; attributes
(pprint (select hn-resource [(attr? :rel)]))
(pprint (select hn-resource [(attr? :rel :type)]))
(pprint (select hn-resource [(attr= :rel "stylesheet")]))
(pprint (select hn-resource [(attr-starts :rel "style")]))
(pprint (select hn-resource [(attr-ends :rel "sheet")]))
(pprint (select hn-resource [(attr-contains :href "ycomb")]))
(pprint (select hn-resource [(attr-contains :id "score_")]))

;; composition
(pprint (select ex-resource [[:option (attr= :selected "selected")]]))
(pprint (select ex-resource [#{:select (attr= :selected "selected")}]))

;; children
(pprint (select hn-resource [:span.yclinks first-child]))
(pprint (select hn-resource [:span.yclinks last-child]))
(pprint (select hn-resource [:span.yclinks (nth-child 3)]))

;; predicates
(select hn-resource [(pred #(= (:tag %) :form))])
(select hn-resource [:form])
(use 'clojure.contrib.str-utils)
(select hn-resource [(text-pred #(re-matches #"m\S*" %))])

;; examples
(def headlines (->> (map :content (select hn-resource [:td.title :a]))
                    (map first)))

(def scores (->> (map :content (select hn-resource [(attr-contains :id "score_")]))
                 (map first)
                 (map #(re-seq #"\d+" %))
                 (map first)
                 (map #(Integer/parseInt %))))

(filter #(> (:score %) 100) (map #(assoc {} :score % :headline %2) scores headlines))
(pprint (sort-by :score > (map #(assoc {} :score % :headline %2) scores headlines)))





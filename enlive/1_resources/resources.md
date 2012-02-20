!SLIDE
# Resources #
* Paths/URLs/URIs
* Files
* Streams

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Resources, cont'd #
## Creating an HTML resource ##

        (pprint (html-resource
                  (java.net.URL. "http://news.ycombinator.com")))
        => ({:tag :html,
             :attrs nil,
             :content
             ({:tag :head,
               :attrs nil,
               :content
               ...

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Resources, cont'd #
## Creating an HTML resource ##
* Enlive nodes are maps
  * with keys :tag, :attrs, and :content
* attributes are maps
* contents are lists
  * Strings and Enlive nodes

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# CSS Selectors #
## HTML #

        <p>
          <!-- content -->
        </p>
        <p>
          <!-- content -->
        </p>
        <p>
          <!-- content -->
        </p>

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# CSS Selectors, cont'd #
## CSS ##

        p {
          /* style declarations here */
        }

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# CSS Selectors, cont'd #
## styled HTML ##

        <p>
          <!-- style applied here -->
        </p>
        <p>
          <!-- style also applied here -->
        </p>
        <p>
          <!-- and here -->
        </p>

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# CSS Selectors, cont'd #
## HTML #

        <p>
          <!-- content -->
        </p>
        <p id="secret">
          <!-- secret content -->
        </p>
        <p class="notification">
          <!-- notification content -->
        </p>

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# CSS Selectors, cont'd #
## CSS ##

        p {
          /* style declarations */
        }
        p#secret {
          /* style declarations */
        }
        p.notifications {
          /* style declarations */
        }

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors #
## HTML snippet from HN ##

        ...
        <td class="title">
          <a href="http://www.clojure.org">Java.next - Clojure</a>
          ...
        </td>
        ...
        <td class="subtext">
          <span id="score_XXXXXXX">100 points</span>
          ...
        </td>
        ...

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## basic selector steps ##
* id
  * `(select <html-resource> [:div#unique])`
  * `(select <html-resource> [:#unique])`
* class
  * `(select <html-resource> [:div.category])`

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## basic selector steps ##
* nested
  * `(select <html-resource> [:tr.customer_row :td]`

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## attributes ##
* node has this attribute?
  * `(select <html-resource> [(attr? :rel)])`
  * `(select <html-resource> [(attr? :rel :type)])`
* value of attribute is equal to some text
  * `(select <html-resource> [(attr= :rel "stylesheet")])`
<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## more attributes ##
* attribute starts with some text
  * `(select <html-resource> [(attr-starts :rel "style")])`
* attribute ends with some text
  * `(select <html-resource> [(attr-ends :rel "sheet")])`
<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## more attributes ##
* attribute contains some text
  * `(select <html-resource> [(attr-contains :href "ycomb")]`
  * `(select <html-resource> [(attr-contains :id "score_")]`
<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## composing selectors ##
* intersection
  * `(select <html-resource> [[:option (attr= :selected "selected")]]))`
* union
  * `(select <html-resource> [#{:select (attr= :selected "selected")}])`

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## children ##
* first child
  * `(select <html-resource> [:span.yclinks first-child]))`
* last child
  * `(select <html-resource> [:span.yclinks last-child])`
* nth child
  * `(select <html-resource> [:span.yclinks nth-child])`

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

!SLIDE
# Enlive Selectors, cont'd #
## predicates ##
* predicates on elements
  * `(select <html-resource> [(pred #(= (:tag %) :form))])`
* predicates on text nodes
  * `(select <html-resource> [(text-pred #(re-matches #"m\S+" %))])`

<div class="watermark">
  <img src="Clojure-glyph.svg"/>
  <div class="watermark-badge">Enlive</div>
</div>

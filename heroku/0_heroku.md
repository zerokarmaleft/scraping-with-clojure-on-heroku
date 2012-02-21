!SLIDE
# heroku #
![Heroku Logo](heroku-logo-light-234x60.png)

!SLIDE
# prereqs #
## http://devcenter.heroku.com/articles/clojure ##
* heroku
* git
* leiningen
<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Leiningen #
## creating a new project ##

        $ lein new scraper
        Created new project in: /Users/zerokarmaleft/scraper
        Look over project.clj and start coding in scraper/core.clj

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Leiningen #
## edit project.clj ##

        (defproject scraping "0.0.1-SNAPSHOT"
          :dependencies [[org.clojure/clojure "1.3.0"]
                         [enlive "1.0.0"]])
          :main scraper.core

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Leiningen #
## fetch dependencies ##

        $ lein deps
        ...

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Leiningen #
## edit scraper/core.clj ##

        (ns scraper.core
          (:gen-class))

        (defn -main [& args]
          (println ("FREE ALL THE DATAS!")))

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Leiningen #
## running locally ##

        $ lein run -m scraper.core
        FREE ALL THE DATAS!

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Git #
## initialize a new repo ##

        $ git init
        $ git add .
        $ git commit -m "init"

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

!SLIDE
# Heroku #
## deploy to cedar ##

        $ heroku login
        $ heroku create --stack cedar
        $ git push heroku master
        $ heroku run lein run -m scraper.core
        FREE ALL THE DATAS!

<div class="watermark">
  <img src="heroku-logo-light-234x60.png"/>
</div>

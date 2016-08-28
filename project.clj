(defproject lein-pinkeys "0.1.0-SNAPSHOT"
  :description "A Leiningen plugin for pinning the PGP keys for your dependencies."
  :url "https://github.com/miikka/lein-pinkeys"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[mvxcvi/clj-pgp "0.8.3" :exclusions [org.clojure/clojure]]]
  :eval-in-leiningen true)

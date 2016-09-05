(def +version+ "0.1.0-SNAPSHOT")

(set-env!
 :resource-paths #{"src" "boot-pinkeys/src"}
 :dependencies '[[com.cemerick/pomegranate "0.3.1"]
                 [mvxcvi/clj-pgp "0.8.3" :exclusions [org.clojure/clojure]]])

(require '[miikka.boot-pinkeys :refer [pinkeys]])

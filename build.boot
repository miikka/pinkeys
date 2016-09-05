(def +version+ "0.1.0-SNAPSHOT")

(set-env!
 :resource-paths #{"src" "boot-pinkeys/src"}
 :dependencies '[[com.cemerick/pomegranate "0.3.1"]
                 [mvxcvi/clj-pgp "0.8.3" :exclusions [org.clojure/clojure]]])

(require '[miikka.boot-pinkeys :refer [pinkeys]])

(task-options!
 pom {:version +version+
      :url "https://github.com/miikka/lein-pinkeys"
      :scm {:url "https://github.com/miikka/lein-pinkeys"}
      :license {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask build []
  (comp (pom :project 'miikka/boot-pinkeys)
        (jar)
        (install)))

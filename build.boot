(def +version+ "0.1.1-SNAPSHOT")

(set-env!
 :resource-paths #{"src" "boot-pinkeys/src" "lein-pinkeys/src"}
 :dependencies '[[com.cemerick/pomegranate "0.3.1"]
                 [mvxcvi/clj-pgp "0.8.3" :exclusions [org.clojure/clojure]]])

(require '[miikka.boot-pinkeys :refer [pinkeys]])

(task-options!
 pom {:version +version+
      :description  "Leiningen/Boot plugin for pinning the PGP keys for your dependencies."
      :url "https://github.com/miikka/pinkeys"
      :scm {:url "https://github.com/miikka/pinkeys"}
      :license {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask build []
  (comp (pom :project 'miikka/pinkeys)
        (jar)
        (install)))

(deftask deploy []
  (comp
   (build)
   (push :repo "clojars" :gpg-sign (not (.endsWith +version+ "-SNAPSHOT")))))

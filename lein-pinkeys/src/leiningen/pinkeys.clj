(ns leiningen.pinkeys
  (:require
   [pinkeys.core :as pinkeys]
   [leiningen.core.main :as main])
  (:import (org.sonatype.aether.resolution DependencyResolutionException)))

(defn pinkeys
  "Pin dependency GPG keys."
  [project]
  (pinkeys/pinkeys project))

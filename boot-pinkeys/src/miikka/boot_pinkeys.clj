(ns miikka.boot-pinkeys
  {:boot/export-tasks true}
  (:require [boot.core :as boot]
            [pinkeys.core :as pinkeys]))

(boot/deftask pinkeys
  "Pin GPG keys for your dependencies"
  []
  (fn [next-task]
    (fn [fileset]
      (pinkeys/pinkeys (boot/get-env))
      (next-task fileset))))

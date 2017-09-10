# pinkeys

Leiningen/Boot plugin for pinning the PGP keys for your dependencies. **Unsecure, abandoned.**

## What's this?

When you develop a Clojure or ClojureScript application, how do you know if the
dependencies you use came from trustworthy sources? You don't know, really. The
library authors can sign the JARs and Leiningen and Boot both have commands to
check the signatures, but it's hardly useful. All you learn is that somebody has
signed the JAR with a key that has been published on a keyserver.

Pinkeys is an attempt to go a step further by implementing a trust-on-first-use
(TOFU) policy for the dependency signging keys. When you add a new dependency,
Pinkeys stores the fingerprint of the signing key of that dependency. Then, when
you update the dependency, if the new JAR is not signed by the same key, Pinkeys
will warn you.

If you want to go further, check out
the [Clojars JAR signing discussion][clojars-562].

[clojars-562]: https://github.com/clojars/clojars-web/issues/562

## Known problems

* Boot will add the dependencies to classpath before Pinkeys can check them. I
  haven't thought this through, but it seems like a bad idea.

## Usage

**Leiningen:** Put `[[miikka/pinkeys "0.1.1"]]` into the `:plugins` vector of your project.clj.

    $ lein pinkeys

**Boot:** Put `[[miikka/pinkeys "0.1.1" :scope "test"]]` into the
`:dependencies` :vector of your build.boot. Then require the task:

    (require '[miikka.boot-pinkeys :refer [pinkeys]])

Run it:

    $ boot pinkeys

Re-run pinkeys when you upgrade your dependencies.

## Ideas and todos

* Somehow hook into the dependency downloading to automatically verify the downloads.
* Pin down the checksums of the dependencies like [gradle-witness](https://github.com/whispersystems/gradle-witness) does.

## License

Copyright © 2016-2017 Miikka Koskinen.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

# lein-pinkeys

Leiningen/Boot plugin for pinning the PGP keys for your dependencies. **Very experimental, likely unsecure.**

## Usage

**Leiningen:** Put `[[miikka/pinkeys "0.1.0"]]` into the `:plugins` vector of your project.clj.

    $ lein pinkeys

**Boot:** Put `[[miikka/pinkeys "0.1.0" :scope "test"]]` into the
`:dependencies` :vector of your build.boot. Then require the task:

    (require '[miikka.boot-pinkeys :refer [pinkeys]])

Run it:

    $ boot pinkeys

Re-run pinkeys when you upgrade your dependencies.

## Ideas and todos

* Somehow hook into the dependency downloading to automatically verify the downloads.
* Pin down the checksums of the dependencies like [gradle-witness](https://github.com/whispersystems/gradle-witness) does.

## License

Copyright © 2016 Miikka Koskinen.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

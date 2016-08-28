# lein-pinkeys

A Leiningen plugin for pinning the PGP keys for your dependencies. **Very experimental, likely unsecure.**

## Usage

Put `[[miikka/lein-pinkeys "0.1.0-SNAPSHOT"]]` into the `:plugins` vector of your project.clj.

    $ lein pinkeys

Re-run it when you upgrade your dependencies.

## License

Copyright © 2016 Miikka Koskinen.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

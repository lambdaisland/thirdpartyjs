# thirdpartyjs

A demonstration of the various ways to consume a third party library from
ClojureScript.

For the full background on these approaches, watch out for the upcoming Lambda
Island episode, "Using JavaScript libraries from ClojureScript".

## Usage

Check out the relevant branch, then build the project

```
lein cljsbuild once dev
```

and open `resources/public/index.html` in your browser.

You can also try advanced compilation, which works for some setups, but not for others.

```
lein clean
lein cljsbuild once prod
```

## Branches

- [cljsjs-d3](https://github.com/lambdaisland/thirdpartyjs/tree/cljsjs-d3)

Use D3 from http://cljsjs.github.io . Works for both dev and prod builds

- [script-d3](https://github.com/lambdaisland/thirdpartyjs/tree/script-d3)

Use D3 from by loading it from a CDN. Works only for the dev build.

- [script-d3-externs](https://github.com/lambdaisland/thirdpartyjs/tree/script-d3-externs)

Liks `script-d3`, but add externs for the features we're using. Advanced compilation works again.

- [script-d3-generated-externs](https://github.com/lambdaisland/thirdpartyjs/tree/script-d3-generated-externs)

Like `script-d3-externs`, but with auto-generated externs.

- [closure-leftpad](https://github.com/lambdaisland/thirdpartyjs/tree/closure-leftpad)

Implements leftPad as a Google Closure module, loads it by putting it on the classpath.

- [es6-d3](https://github.com/lambdaisland/thirdpartyjs/tree/es6-d3)

Compile D3 to a single ES6 file with Rollup, then use that directly with `:module-type :es6`. Broken for advanced compilation, probably because D3 violates some of the Closure assumptions. (Lots of warnings on advanced compilation).

- [foreign-libs-d3](https://github.com/lambdaisland/thirdpartyjs/tree/foreign-libs-d3)

Include D3 with `:foreign-libs` and `:externs`. This is what CLJSJS currently does. Works for advanced compilation.



## License

Copyright © 2016 Arne Brasseur

Distributed under the Mozilla Public License 2.0

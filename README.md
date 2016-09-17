# thirdpartyjs

A demonstration of the various ways to consume a third party library from
ClojureScript.

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

- [closure-leftpad](https://github.com/lambdaisland/thirdpartyjs/tree/closure-leftpad)

Implements leftPad as a Google Closure module, loads it by putting it on the classpath.

- [script-d3-externs](https://github.com/lambdaisland/thirdpartyjs/tree/script-d3-externs)

Load D3 from a CDN, but add externs for the features we're using. Advanced compilation works again.

- [script-d3-generated-externs](https://github.com/lambdaisland/thirdpartyjs/tree/script-d3-generated-externs)

Generate the externs automatically instead of hand-crafting.

## License

Copyright © 2016 Arne Brasseur

Distributed under the Mozilla Public License 2.0

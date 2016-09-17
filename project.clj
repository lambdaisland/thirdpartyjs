(defproject thirdpartyjs "0.1.0-SNAPSHOT"
  :license {:name "Mozilla Public License 2.0" :url "https://www.mozilla.org/en-US/MPL/2.0/"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [cljsjs/d3 "4.2.2-0"]]

  :source-paths ["src/clj"]

  :plugins [[lein-cljsbuild "1.1.4"]]

  :clean-targets ^{:protect false} [:target-path :compile-path "resources/public/js/compiled"]

  :cljsbuild {:builds
              {:dev {:source-paths ["src/cljs"]
                     :compiler {:main thirdpartyjs.core
                                :optimizations :none
                                :output-to "resources/public/js/compiled/thirdpartyjs.js"
                                :output-dir "resources/public/js/compiled/dev"
                                :asset-path "js/compiled/dev"
                                :source-map-timestamp true}}

               :prod {:source-paths ["src/cljs"]
                      :jar true
                      :compiler {:main thirdpartyjs.core
                                 :optimizations :advanced
                                 :output-to "resources/public/js/compiled/thirdpartyjs.js"
                                 :source-map "resources/public/js/compiled/thirdpartyjs.js.map"
                                 :output-dir "resources/public/js/compiled/prod"
                                 :source-map-timestamp true
                                 :pretty-print false}}}})

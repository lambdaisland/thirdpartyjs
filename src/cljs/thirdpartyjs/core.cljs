(ns thirdpartyjs.core
  (:require [cljsjs.d3]))

(enable-console-print!)

(set! (.-innerHTML (.getElementById js/document "app")) "<h1>Let's do this</h1>")

(def values #js [0 3 2 5 4 7 8 6 2 6 5 1 0])

(def width 960)
(def height 500)

(let [svg (.. js/d3
              (select "#app")
              (append "svg")
              (attr "width" width)
              (attr "height" height))
      x-scale (.. js/d3
                  scaleLinear
                  (range #js [0 width])
                  (domain #js [0 12]))
      y-scale (.. js/d3
                  scaleLinear
                  (range #js [height 0])
                  (domain #js [0 10]))
      line (.. js/d3
               line
               (x #(x-scale %2))
               (y y-scale))]

  (.. svg
      (append "path")
      (datum (clj->js values))
      (attr "fill" "none")
      (attr "stroke" "#3355ee")
      (attr "stroke-width" "5px")
      (attr "d" line)))

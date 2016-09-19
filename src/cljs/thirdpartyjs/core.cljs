(ns thirdpartyjs.core
  (:require [js.d3 :refer [select scaleLinear line]]))

(enable-console-print!)

(def values #js [0 3 2 5 4 7 8 6 2 6 5 1 0])

(def width 960)
(def height 500)

(let [svg (.. (select "#app")
              (append "svg")
              (attr "width" width)
              (attr "height" height))
      x-scale (.. (scaleLinear)
                  (range #js [0 width])
                  (domain #js [0 12]))
      y-scale (.. (scaleLinear)
                  (range #js [height 0])
                  (domain #js [0 10]))
      line (.. (line)
               (x #(x-scale %2))
               (y y-scale))]

  (.. svg
      (append "path")
      (datum (clj->js values))
      (attr "fill" "none")
      (attr "stroke" "#3355ee")
      (attr "stroke-width" "5px")
      (attr "d" line)))

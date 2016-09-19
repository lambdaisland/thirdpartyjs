(ns thirdpartyjs.core
  (:require [thirdpartyjs.padding :as padding]))

(enable-console-print!)

(prn (padding/leftPad "Hello!" 10))

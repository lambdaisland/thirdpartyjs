(ns thirdpartyjs.util)

(defn makePadding [s len]
  (let [pad (- len (count s))]
    (if (<= pad 0)
      s
      (apply str (take pad (repeat " "))))))

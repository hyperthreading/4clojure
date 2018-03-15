(ns hyperthreading.fourclojure.pronounciation)

(defn pronounce
  [coll]
  (rest (iterate (fn [nums]
                   (->> nums
                        (partition-by identity)
                        (mapcat (juxt count first))))
                 coll)))


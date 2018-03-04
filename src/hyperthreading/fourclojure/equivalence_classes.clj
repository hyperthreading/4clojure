(ns hyperthreading.fourclojure.equivalence-classes)

(defn eq-class
  [f domain]
  (->> domain
       (group-by f)
       vals
       (map set)
       set))


(ns hyperthreading.fourclojure.identify-keys-and-values)

(defn idf
  [kv]
  (->> (partition-by keyword? kv)
       (partition-all 2)
       (mapcat #(let [keywords (first %)
                      values (second %)
                      no-vals (drop-last keywords)]
                  (if (seq values)
                    (apply vector
                           (last keywords)
                           (vec values)
                           (interleave no-vals (repeat [])))
                    (apply vector
                           (interleave keywords (repeat []))))))
       (apply hash-map)))

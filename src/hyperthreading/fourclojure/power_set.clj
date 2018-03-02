(ns hyperthreading.fourclojure.power-set)

(defn power-set
  [s]
  (if (seq s)
     (let [n (first s)
           rest-sets (power-set (rest s))]
       (set (concat rest-sets
                    (map #(conj % n) rest-sets))))
     #{#{}}))


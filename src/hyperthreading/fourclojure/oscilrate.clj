(ns hyperthreading.fourclojure.oscilrate)

(defn oscilrate
  [x & fs]
  (letfn [(osc [n fs]
            (lazy-seq (cons n
                            (osc ((first fs) n)
                                 (rest fs)))))]
    (osc x (cycle fs))))

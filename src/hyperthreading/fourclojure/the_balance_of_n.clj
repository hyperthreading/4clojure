(ns hyperthreading.fourclojure.the-balance-of-n)

(defn bal?
  [n]
  (let [digits (map #(Character/getNumericValue %) (str n))
        half-count (quot (count digits) 2)]
    (= (apply + (take half-count digits))
       (apply + (take-last half-count digits)))))

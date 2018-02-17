(ns hyperthreading.fourclojure.eulers-totient-function
  (:require [clojure.test :refer [with-test is run-tests]]))


(with-test
  (defn totient [x]
    (if (= x 1)
      1
      (letfn [(divisors [x]
                (filter #(zero? (rem x %)) (range 1 x)))
              (multiples [n]
                (take-while #(<= % x)
                            (map (partial * n) (drop 1 (range)))))]
        (count (reduce #(remove (set (multiples %2)) %1)
                       (range 1 x)
                       (drop 1 (divisors x)))))))
  (is (= (totient 1) 1))
  (is (= (totient 10) 4))
  (is (= (totient 40) 16))
  (is (= (totient 99) 60)))

(defn totient2 [a]
  (count
    (for [b (range a)
          :when (not-any? #(= 0 (rem a %) (rem b %)) (range 2 a))]
      b)))

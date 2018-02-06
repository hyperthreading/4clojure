(ns fourclojure.perfect-numbers
  (:require [clojure.test :refer [with-test run-tests is]]))

(with-test
  (defn perfect-numbers
    [n]
    (->> (range 1 n)
         (filter (comp zero? (partial rem n)))
         (reduce +)
         (= n)))
  (is (= (perfect-numbers 6) true))
  (is (= (perfect-numbers 496) true))
  (is (= (perfect-numbers 8128) true)))
      

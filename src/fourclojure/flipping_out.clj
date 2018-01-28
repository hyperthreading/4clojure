(ns fourclojure.flipping-out
  (:require [clojure.test :refer [with-test is run-tests]]))

(with-test
  (defn flip
    [f]
    #(apply f (reverse %&)))
  (is (= 3 ((flip nth) 2 [1 2 3 4 5])))
  (is (= true ((flip >) 7 8))))

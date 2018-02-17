(ns hyperthreading.fourclojure.duplicate-a-sequence
  (:require [clojure.test :refer [with-test is run-tests]]))

(with-test
  (defn dupe [s]
    (interleave s s))
  (is (= (dupe [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (dupe [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))

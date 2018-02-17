(ns hyperthreading.fourclojure.sequence-reductions
  (:require [clojure.test :refer [with-test run-tests is]]))

(with-test
  (defn seq-red
    ([f coll]
     (drop 1 (seq-red f (f) coll)))
    ([f default coll]
     (lazy-seq (cons default
                     (if coll
                        (seq-red f
                                 (f default
                                    (first coll))
                                 (next coll)))))))

  (is (= (take 5 (seq-red + (range)))
         [0 1 3 6 10])))

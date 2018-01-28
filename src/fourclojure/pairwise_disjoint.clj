(ns fourclojure.pairwise-disjoint
  (:require [clojure.test :refer [with-test is run-tests]]))

(with-test
  (defn pairwise-disjoint?
    [s]
    (apply distinct? (reduce concat s)))
  (is (= (pairwise-disjoint? #{#{[1 2 3] [4 5]}
                               #{[1 2] [3 4 5]}
                               #{[1] [2] 3 4 5}
                               #{1 2 [3 4] [5]}}))
      true))

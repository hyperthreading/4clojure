(ns fourclojure.merge-with-a-function
  (:require [clojure.test :refer [run-tests with-test is]]))


(with-test
  (defn mw
    [f & maps]
    (if maps
      (reduce #(merge
                %1 (apply hash-map
                          (mapcat
                           (fn [kv]
                             (let [k (first kv)
                                   v (second kv)]
                               (if (contains? %1 k)
                                 [k (f (get %1 k) v)]
                                 [k v])))
                           %2)))
              maps)))
  (is (= (mw - {1 10, 2 20} {1 3, 2 10, 3 15})
         {1 7, 2 10, 3 15})))

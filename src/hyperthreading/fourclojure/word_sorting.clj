(ns hyperthreading.fourclojure.word-sorting
  (:require [clojure.test :refer [run-tests with-test is]]))

(with-test
  (defn wsort [s]
    (vals (into {} (sort (map #(vector (.toLowerCase %) %) (re-seq #"\b\w+" s))))))
  (is (= (wsort "Fools fall for foolish follies.")
         ["fall" "follies" "foolish" "Fools" "for"])))
x

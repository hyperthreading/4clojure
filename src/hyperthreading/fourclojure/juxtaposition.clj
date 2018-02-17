(ns hyperthreading.fourclojure.juxtaposition
  (:require [clojure.test :refer [run-tests with-test is]]))


(with-test
  (defn juxta [& fns]
    (fn [& args]
      (vec (map #(apply % args) fns))))
  (is (= [21 6 1] ((juxta + max min) 2 3 5 1 6 4)))
  (is (= ["HELLO" 5] ((juxta #(.toUpperCase %) count) "hello")))
  (is (= [2 6 4] ((juxta :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))))

(ns fourclojure.palindrome
  (:require [clojure.test :as test]))

(defn palindrome?
  [s]
  (= (seq s) (reverse s)))

(defn run-test []
  (test/is (true? (palindrome? "racecar")))
  (test/is ))






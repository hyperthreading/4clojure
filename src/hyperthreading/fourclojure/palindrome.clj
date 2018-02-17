(ns hyperthreading.fourclojure.palindrome
  (:require [clojure.test :as ctest]))

(ctest/with-test
  (defn palindrome?
    [s]
    (= (seq s) (reverse s)))
  (ctest/is (true? (palindrome? "racecar"))))








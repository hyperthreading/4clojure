(ns hyperthreading.fourclojure.anagram-finder
  (:require [clojure.test :refer [with-test is run-tests]]))

(with-test
  (defn anagrams
    [v]
    (->> v
         (group-by sort)
         vals
         (filter next)
         (map set)
         set))
  (is (= (anagrams ["meat" "mat" "team" "mate" "eat"])
         #{#{"meat" "team" "mate"}})))





(ns partition-a-sequence
  (:require [clojure.test :refer :all]))

(with-test
  (defn part [n s]
    (loop [parted '()
           rest-s s]
      (if (and (seq rest-s)
               (<= n (count rest-s)))
        (recur (conj parted (take n rest-s))
               (drop n rest-s))
        (reverse parted))))
  (is (= (part 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))))



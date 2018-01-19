(ns fourclojure.get-the-caps
  (:require [clojure.test :as ctest]))

(ctest/with-test
  (defn get-the-caps [s]
    (clojure.string/join (filter #(Character/isUpperCase %) s)))
  (ctest/is (= (get-the-caps "$#A(*&987Zf") "AZ")))

(ns hyperthreading.fourclojure.happy-number)

(defn happy-number?
  ([n]
   (happy-number? n #{n}))
  ([n hist]
   (let [digits (map #(Integer/parseInt (str %)) (str n))
         num (apply + (map * digits digits))]
     (cond
       (= num 1) true
       (hist num) false
       :else (recur num (conj hist num))))))
     
        

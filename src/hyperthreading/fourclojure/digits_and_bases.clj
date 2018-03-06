(ns hyperthreading.fourclojure.digits-and-bases)


(defn to-base
  [i n]
  (loop [digits '()
         num    i]
    (if (zero? num)
      (vec (or (seq digits)
               '(0)))
      (recur (cons (mod num n) digits)
             (quot num n)))))


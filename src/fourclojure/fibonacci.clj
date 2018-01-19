;; This buffer is for Clojure experiments and evaluation.
;; Press C-j to evaluate the last expression.

(ns fourclojure.fibonacci)

(defn p1 [ans] (= (ans 3) '(1 1 2)))

(defn p2 [ans] (= (ans 6) '(1 1 2 3 5 8)))

(defn p3 [ans] (= (ans 8) '(1 1 2 3 5 8 13 21)))



(defn answer
  "Get n-th fibonacci number"
  [n]
  (let [base '(1 1)]
    (if (> 3 n)
      (take n base)
      (reverse (loop [i (- n 2)
                      fib base]
                 (if-not (zero? i)
                   (recur (dec i)
                          (->> (take 2 fib)
                               (apply +)
                               (conj fib)))
                   fib))))))


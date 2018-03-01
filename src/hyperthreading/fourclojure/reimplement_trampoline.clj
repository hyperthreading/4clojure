(ns hyperthreading.fourclojure.reimplement-trampoline)

(defn tr
  ([f]
   (let [ret (f)]
     (if (fn? ret)
       (recur ret)
       ret)))
  ([f & args]
   (tr (apply partial f args))))

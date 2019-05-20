(ns learnclojure)

(def x (list 1 2 3))
(def y (vector 1 2 3))
(println (cons 0 x))
(println x)

(println (first x))
(println (last x))
(println (nth x 1))

(println (cons 4 x))
(println (cons 4 y)) ;will transform vector y into a list
(println (conj x 4))
(println (conj y 4))

(println (type (concat x y)));creates a lazy sequence
(println (concat x y))

(println (assoc {:a 1} :b 2))
(println (assoc-in {:settings {:a 1 :b 2}} [:settings :a] 3))
(println (update-in {:settings {:a 1 :b 2}} [:settings :a] inc))

(def m {:a 1 :b 2})

(println (get m :a))
(println (:a m))

(def s #{1 2 3})

(println (conj s 4))
(println (disj s 3))
(println (contains? s 3))
(println (get s 3))
(println (get s 4))
(ns learnclojure)

;JAVA types ----------------

(println (type 1)) ;long
(println (type 1.1)) ;double
(println (type true)) ;boolean
(println (type "Hello")) ;string

;CLOJURE types -------------

(println (type :a)) ;keyword
(println (type (keyword "a"))) ;keyword

(println (type (quote a))) ;symbol
(println (type 'a)) ;symbol

(println (type (list 1 2 3))) ;persistent list ----- like linked-lists
(println (type '(1 2 3))) ;persistent list

(println (type (vector 1 2 3))) ;vector ----- like arrays
(println (type [1 2 3])) ;vector

(println (nth (vector 1 2 3) 2)) ;faster in vector than would be in list

(println (type (hash-map :a 1 :b 2))) ;persistent hash map
(println (type {:a 1})) ;persistent array map
(println (:a {:a 1, :b 2, :c 3})) ;can use keyword to access a map

(println (type (hash-set 1 2 3))) ;persistent hash set
(println (type #{1 2 3})) ;persistent hash set
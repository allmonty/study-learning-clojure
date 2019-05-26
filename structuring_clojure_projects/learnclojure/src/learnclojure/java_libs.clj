(ns learnclojure.java_libs
  (:import [java.util Date Calendar]))

(defn -main []
; call function from java system
  (println (System/currentTimeMillis))
; instantiate a Date object
  (def date (Date. (System/currentTimeMillis)))
; call static functions from class Date
  (println (. (Date.) getTime))
  (println (.getTime (Date.)))
; get calendar instance and modifies it with functions calls
  (println (doto (Calendar/getInstance)
             (.set Calendar/YEAR 1992)
             (.set Calendar/MONTH 10)
             (.set Calendar/DATE 6)))
; creates array, access it then modifies it
  (def myarray (into-array String ["this" "is" "an" "array"]))
  (println (aget myarray 1))
  (println (aset myarray 1 "was"))
; iterates through array and reverse each word
  (def newarray (amap myarray idx ret (aset ret idx (apply str (reverse (aget myarray idx))))))
  (println (aget newarray 0) (aget newarray 1) (aget newarray 2) (aget newarray 3))
; count the number of characters in all words
  (println (areduce myarray idx ret (long 0) (+ ret (count (aget myarray idx)))))
;  Type hinting, passing "^String" as a type for s in function, you optimize performance
  (defn strlen [^String s] (.length s))
  (println (strlen "allan")))
(ns learnclojure)

(def x "Hello Clojure") ;assign to a symbol a value

(let [x "Allan"] ;assign to a symbol a value inside a context
  (println "Hello," x))

(if (= x "Hello Clojure")
  (println "x is Hello Clojure")
  (println "x is not Hello Clojure"))

(if nil
  (println "nil is like true")
  (println "nil is like false"))

(if-not (empty? x)
  (do
    (println "action 1")
    (println "action 2")
    :ok))

(when-not (empty? x)
  (println "action 1")
  (println "action 2")
  :ok)

(when true (println "action 1") (println "action 2") :ok)

(case x
  "hi" (println "match hi")
  "hello" (println "match hello")
  (println "match if others don't"))

(cond
  (= x "hello") (println :hi)
  (= x "Hello Clojure") (println :match)
  :otherwise (println :haha))
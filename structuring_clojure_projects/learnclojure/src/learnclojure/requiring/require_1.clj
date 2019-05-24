(ns learnclojure.requiring.require_1)

(require 'clojure.string)

(defn do_it []
  (let [x (clojure.string/split "a,b,c" #",")]
    (println x)))
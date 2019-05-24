(ns learnclojure.requiring.require_3)

(require '[clojure.string :refer [split]])

(defn do_it []
  (let [x (split "a,b,c" #",")]
    (println x)))
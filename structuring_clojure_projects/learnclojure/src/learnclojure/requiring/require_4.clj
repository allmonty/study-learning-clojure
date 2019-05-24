(ns learnclojure.requiring.require_4
  (:require [clojure.string :as st]))

(defn do_it []
  (let [x (st/split "a,b,c" #",")]
    (println x)))
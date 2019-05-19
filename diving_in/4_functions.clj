(ns learnclojure)

(println ((fn [] "Hello")))

(def hello (fn [] "Hello"))
(println (hello))

(println (#(str "Hello")))

(defn hi [name] (str "Hi, " name))
(println (hi "Allan"))

(defn hello [& args]
  (str "Hello " (apply str args)))
(println (hello "Allan " "Jo " "Loma"))

(defn yo
  ([] (yo "everyone")) ;recursive declaration!
  ([name] (str "Hello, " name)))
(println (yo))
(println (yo "Allan"))

(defn hello [config]
  (str "Hello, " (:name config)))
(println (hello {:name "Allan"}))

(defn hello [{name :name}]
  (str "Hello, " name))
(println (hello {:name "Allan"}))

(defn hello [[name title]]
  (str "Hello, " title " " name))
(println (hello ["Allan" "lord"]))
(ns learnclojure)

(defn my-sum [total vals]
  (if (empty? vals)
    total
    (my-sum (+ (first vals) total) (rest vals))))

(println (my-sum 0 [1 2 3 4 5]))

;--- Another way with no total being passed

(defn my-sum
  ([vals] (my-sum 0 vals))
  ([total vals]
   (if (empty? vals)
     total
     (my-sum (+ (first vals) total) (rest vals)))))

(println (my-sum [1 2 3 4 5]))

;--- Better using `recur` to have tail-call optimization

(defn my-sum
  ([vals] (my-sum 0 vals))
  ([total vals]
   (if (empty? vals)
     total
     (recur (+ (first vals) total) (rest vals)))))

(println (my-sum [1 2 3 4 5]))

;--- Using `loop`

(defn my-sum [vals]
  (loop [total 0 vals vals]
    (if (empty? vals)
      total
      (recur (+ (first vals) total) (rest vals)))))

(println (my-sum [1 2 3 4 5]))

;--- Even better with `reduce`

(println
 (reduce (fn [total val] (+ total val)) 0 [1 2 3 4 5]))

;---

(defn summer [total val] (+ total val))

(println (reduce summer 0 [1 2 3 4 5]))

;---

(println (reduce + 0 [1 2 3 4 5]))

(println (reduce + [1 2 3 4 5]))

;---

(defn filter-even [acc next-val]
  (if (even? next-val)
    (conj acc next-val)
    acc))

(println (reduce filter-even [] [1 2 3 4 5]))

(println (filter even? [1 2 3 4 5]))

;---

(defn map-inc [acc next-val]
  (conj acc (inc next-val)))
(println
 (reduce map-inc [] [1 2 3 4 5]))

(println
 (map inc [1 2 3 4 5]))

;---

(defn group [acc next-val]
  (let [key (if (even? next-val) :even :odd)]
    (update-in acc [key] #(conj % next-val))))

(println
 (reduce group {} [1 2 3 4 5]))


(println
 (group-by #(if (even? %) :even :odd) [1 2 3 4 5]))










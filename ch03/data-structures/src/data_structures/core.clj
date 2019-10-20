(ns data-structures.core)

(require '[clojure.string :as str])

;; Maps and ways to retrieve values from them
(hash-map :a 1 :b 2 :c 3)
(def clojure-is-awesome (str/split "Clojure is really awesome!" #" "))
(apply hash-map clojure-is-awesome)


(get {:a 1 :b 2 :c 3} :c)
({:a 1 :b 2 :c 3} :c)
(:c {:a 1 :b 2 :c 3})
(:d {:a 1 :b 2 :c 3} "Valor default!")
(get-in {:a 1 :b 2 :c {:d 3}} [:c :d])
(get-in {:a 1 :b 2 :c {:d {:e 3}}} [:c :d :e])
(get-in {:a 1 :b 2 :c {:d 3}} [:c :d :e])
(get-in {:a 1 :b 2 :c {:d 3}} [])

;; Arrays and ways to retrieve values from them
(conj [1 2 3] 4)
([1 2 3] 2)
(get [1 2 3] 2)
(get [1 2 3] 3 "Valor default!")
(get-in [[1 2 3] [4 5 6] [7 8 9]] [1 2])

;; Lists and how to retrieve elements from them
(list 1 "two" :c)
(nth '(1 2 3) 0)
(conj '(1 2 3) 4)

;; Sets and how they're used
(hash-set 1 1 2 2 3 3)
(apply hash-set [1 1 2 2 3 3 4 4])
(set [1 1 2 2 3 3 4 4])
(conj #{:a :b :c} :d)
(conj #{:a :b :c} :c)
(#{1 2 3} 2)
(#{1 2 3 :a :b :c} :b)
(#{1 2 3 :a :b :c} :d)
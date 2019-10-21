(ns ex06.core)

(defn matching-part
  [part new-part-number]
  {:name (clojure.string/replace (:name  part) #"^1-" (str new-part-number "-"))
   :size (:size part)})

(defn matching-parts
  [part number-of-parts]
  (reduce #(conj %1 (matching-part part %2))
          []
          (range 1 (inc number-of-parts))))

(def asym-body-parts [{:name "head" :size 3}
                      {:name "1-eye" :size 1}
                      {:name "1-ear" :size 1}
                      {:name "mouth" :size 1}
                      {:name "nose" :size 1}
                      {:name "neck" :size 2}
                      {:name "1-shoulder" :size 3}
                      {:name "1-upper-arm" :size 3}
                      {:name "chest" :size 10}
                      {:name "back" :size 10}
                      {:name "1-forearm" :size 3}
                      {:name "1-kidney" :size 1}
                      {:name "1-hand" :size 2}
                      {:name "1-knee" :size 2}])

(matching-parts {:name "head" :size 2} 10)
(set (matching-parts {:name "head" :size 2} 10))

(defn generic-symmetrizer
  [asym-parts number-of-parts]
  (reduce #(into %1 (set (matching-parts %2 number-of-parts)))
          []
          asym-parts))

(generic-symmetrizer asym-body-parts 10)
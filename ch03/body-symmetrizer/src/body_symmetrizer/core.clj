(ns body-symmetrizer.core)

(def asym-body-parts [{:name "head" :size 3}
                      {:name "left-eye" :size 1}
                      {:name "left-ear" :size 1}
                      {:name "mouth" :size 1}
                      {:name "nose" :size 1}
                      {:name "neck" :size 2}
                      {:name "left-shoulder" :size 3}
                      {:name "left-upper-arm" :size 3}
                      {:name "chest" :size 10}
                      {:name "back" :size 10}
                      {:name "left-forearm" :size 3}
                      {:name "left-kidney" :size 1}
                      {:name "left-hand" :size 2}
                      {:name "left-knee" :size 2}])

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  [asym-parts]
  (reduce #(into %1 (set [%2 (matching-part %2)]))
          []
          asym-parts))

(def test-part {:name "head" :size 3})
(set [test-part (matching-part test-part)])

(symmetrize-body-parts asym-body-parts)
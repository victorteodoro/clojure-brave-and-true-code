(ns threading-macros.core)

(def person {:age 15 :height 1.65})

(defn transform*
  [person]
  (-> person
      (assoc :hair :black)
      (update :age inc)))

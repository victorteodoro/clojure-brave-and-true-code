(ns transducers.core
  (:gen-class))

(def xf (comp (filter odd?) (map inc) (map #(* % %))))

(transduce xf + (range 5))
(into [] xf (range 100))

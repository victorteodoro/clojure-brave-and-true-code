(ns functions.core)

;; How to define functions with multiple arity
(defn martial-art
  ([name]
   (martial-art name "jiu-jitsu"))
  ([name art]
   (str "I'm gonna " art " " name ".")))

(martial-art "caio" "karate")
(martial-art "caio")

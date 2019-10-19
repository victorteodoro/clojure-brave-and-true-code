(if false
  (do (println "Show!")
      "Daorinha")
  (do (println "Deu ruim!")
      "Aí não é legal"))

(if nil "nil is truthy" "nil is falsy")

(println (= true true))

(println (= true "truthy"))

;; or returns the first truthy value or the last value otherwise
(str "or function: " (or nil false "hey, cheguei primeiro" (= 1 1) (= 1 1)))
(str "or function: " (or nil (= 1 2) (= "yes" "no") (= true false)))

;; and returns the first falsy value or the last one otherwise
(and true (= 1 1) (= "truthy" false) (= 2 2))
(and true (= 1 1) (= 2 2) "Eu sou o último valor truthy")

(ns ex04.core)

(defn mapset
  [function collection]
  (set (map function collection)))

(mapset inc [1 1 2 2 3 3 4 4 5 5])

(ns clojure-for-brave-and-true.core
  (:gen-class))

(defn -main
  "Exercises from Clojure for the Brave and True"
  [& args]
  ; Chapter 1, ex. 1: Use the str, vector, list, hash-map, and hash-set functions.

  (defn add-100
    "Adds 100 to a number"
    [x]
    (+ x 100))

  (defn dec-maker
    "Create a custom decrementor"
    [dec-by]
    #(- % dec-by))

  (defn mapset
    "Like map but returning a set"
    [f list]
    (set (map f list)))

  (def dec3 (dec-maker 3))
  (def dec9 (dec-maker 9))
  (println "Ch. 1 Ex.1 str: " (str "This is was not a string -> " 1))
  (println "Ch. 1 Ex.1 vector: " ( vector  "This" "was" "not" "a" "vector"))
  (println "Ch. 1 Ex.1 list: " ( list  "This" "was" "not" "a" "list"))
  (println "Ch. 1 Ex.1 hash-map: " ( hash-map :goodfood "ravioli" :badfood "lettuce" ))
  (println "Ch. 1 Ex.1 hash-set: " ( hash-set 1 2 3 3 3 3 3 3 3 4 5 ))
  (println "Ch. 1 Ex.1 add-100: " ( add-100 50 ))
  (println "Ch. 1 Ex.1 dec-maker 3: " ( dec3 10 ))
  (println "Ch. 1 Ex.1 dec-maker 9: " ( dec9 10 ))
  (println "Ch. 1 Ex.1 mapset: " (mapset inc [1 1 2 2]))
  
  )

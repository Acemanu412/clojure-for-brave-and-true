(ns clojure-for-brave-and-true.core
  (:gen-class))

(defn -main
  "Exercises from Clojure for the Brave and True"
  [& args]
  ; Chapter 1, ex. 1: Use the str, vector, list, hash-map, and hash-set functions.

  (println "Ch. 1 Ex.1 str: " (str "This is was not a string -> " 1))
  (println "Ch. 1 Ex.1 vector: " ( vector  "This" "was" "not" "a" "vector"))
  (println "Ch. 1 Ex.1 list: " ( list  "This" "was" "not" "a" "list"))
  (println "Ch. 1 Ex.1 hashmap: " ( hash-map :goodfood "ravioli" :badfood "lettuce" ))
 )

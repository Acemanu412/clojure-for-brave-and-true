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

  (def asym-alien-body-parts [{:name "head" :size 3}
                              {:name "first-eye" :size 1}
                              {:name "first-ear" :size 1}
                              {:name "mouth" :size 1}
                              {:name "nose" :size 1}
                              {:name "neck" :size 2}
                              {:name "t-shoulder" :size 3}
                              {:name "first-upper-arm" :size 3}
                              {:name "chest" :size 10}
                              {:name "back" :size 10}
                              {:name "first-forearm" :size 3}
                              {:name "abdomen" :size 6}
                              {:name "first-kidney" :size 1}
                              {:name "first-hand" :size 2}
                              {:name "first-knee" :size 2}
                              {:name "first-thigh" :size 4}
                              {:name "first-lower-leg" :size 3}
                              {:name "left-achilles" :size 1}
                              {:name "left-foot" :size 2}])
  (defn matching-parts
    [part]
     [{:name (clojure.string/replace (:name part) #"^first-" "second-")
           :size (:size part)}  {:name (clojure.string/replace (:name part) #"^first-" "third-")
                                 :size (:size part)}  {:name (clojure.string/replace (:name part) #"^first-" "fourth-")
                                                       :size (:size part)}  {:name (clojure.string/replace (:name part) #"^first-" "fifth-")
                                                                             :size (:size part)} ]) 

  (defn symmetrize-body-parts
    "Expects a seq of maps that have a :name and :size"
    [asym-body-parts]
    (reduce (fn [final-body-parts part]
              (into final-body-parts (set (flatten [part (matching-parts part)]))))
                     []
                     asym-body-parts))

    (defn general-matching-parts
    [part n]
      (reduce (fn [matched-body-parts i]
                (into matched-body-parts [{:name (clojure.string/replace (:name part) #"^first-" (str (+ i 1) "-")) :size (:size part)}]))
                      []
                      (range n)))
  
  (defn general-symmetrize-body-parts
    "Expects a seq of maps that have a :name and :size and gives back a bigger sequence"
    [asym-body-parts n]
    (reduce (fn [final-body-parts part]
              (into final-body-parts (set (flatten [(general-matching-parts part n)]))))
            []
            asym-body-parts))


  (def dec3 (dec-maker 3))
  (def dec9 (dec-maker 9))
  (println "Ch. 1 Ex.1 str: " (str "This is was not a string -> " 1))
  (println "Ch. 1 Ex.1 vector: " ( vector  "This" "was" "not" "a" "vector"))
  (println "Ch. 1 Ex.1 list: " ( list  "This" "was" "not" "a" "list"))
  (println "Ch. 1 Ex.1 hash-map: " ( hash-map :goodfood "ravioli" :badfood "lettuce" ))
  (println "Ch. 1 Ex.1 hash-set: " ( hash-set 1 2 3 3 3 3 3 3 3 4 5 ))
  (println "Ch. 1 Ex.2 add-100: " ( add-100 50 ))
  (println "Ch. 1 Ex.3 dec-maker 3: " ( dec3 10 ))
  (println "Ch. 1 Ex.3 dec-maker 9: " ( dec9 10 ))
  (println "Ch. 1 Ex.4 mapset: " (mapset inc [1 1 2 2]))
  (println "Ch. 1 Ex.5 matching set " (matching-parts {:name "first-eye" :size 1} ))
  (println "Ch. 1 Ex.5 symmetrize " (symmetrize-body-parts asym-alien-body-parts ))
  (println "Ch. 1 Ex.6 expand matching set " (general-matching-parts {:name "first-eye" :size 1} 4 ))
  (println "Ch. 1 Ex.6 expand " (general-symmetrize-body-parts asym-alien-body-parts 3 ))

  )

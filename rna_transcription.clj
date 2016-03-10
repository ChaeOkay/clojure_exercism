(ns rna-transcription
  (:require [clojure.string :as string]))

(def translation {"G" "C
                  "C" "G"
                  "T" "A"
                  "A" "U"})
(defn translate [x]
    (assert (contains? translation x))
    (translation x))

(defn to-rna [dna]
  (def dna-letters (string/split dna #""))
  (def rna-letters (map (fn [x] (translate x)) dna-letters))
  (apply str rna-letters)
)

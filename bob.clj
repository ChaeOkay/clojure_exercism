(ns bob)

(def response {:fine "Fine. Be that way!"
	       :shouting "Whoa, chill out!"
	       :sure "Sure."
	       :whatever "Whatever."})

(defn response-for
  [phrase] 
  (cond 
    (empty? phrase) (:fine response)
    (re-find #"\s{2,}" phrase) (:fine response)
    (re-find #"[A-Z]{4,}" phrase) (:shouting response)
    (re-find #"[A-Z]!$" phrase) (:shouting response)
    (re-find #"\?$" phrase) (:sure response)
    :else (:whatever response)))

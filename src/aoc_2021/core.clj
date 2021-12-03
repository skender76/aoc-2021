(ns aoc-2021.core
  (:require [clojure.java.io :as io] ))


(defn -main []

  (with-open [rdr (io/reader (io/resource
                            "report.txt" ))]
    (def greaterVect (vector))

    (def oldValue 0)
    (doseq [line (line-seq rdr)]
      (def value (Integer/parseInt line))
      (def greaterVect (if (> value oldValue) (conj greaterVect "greater") (conj greaterVect)))
      (def oldValue value)
      (def numInc (count greaterVect))
      ))
  (println (- numInc 1))
  )

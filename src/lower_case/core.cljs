(ns lower-case.core
  (:require ["lower-case" :refer [lowerCase]])
  )

(defn init! [] (println (lowerCase "AsDf")))

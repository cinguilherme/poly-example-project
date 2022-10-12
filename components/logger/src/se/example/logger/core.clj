(ns se.example.logger.core
  (:require [taoensso.timbre :as timbre]))

(defn tap [v] (println v) v)

(defmacro info [args]
  `(timbre/log! :info :p ~args))

(comment
  
  (tap 10)
  (info 10)
  )
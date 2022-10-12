(ns se.example.logger.interface
  (:require [se.example.logger.core :as core]))

(defn tap [v] (core/tap v))

(defmacro info [& args]
  `(core/info ~args))

(comment

  (tap 10)
  (info 10)
  )

(ns dev.cin
  (:require [se.example.logger.interface :as logger]
            [se.example.cli.core :as cli]))

(+ 1 1)

(logger/tap 10)

(logger/info 40)

(comment
  (cli/-main "hey dude")

  )

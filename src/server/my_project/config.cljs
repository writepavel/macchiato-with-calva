(ns my-project.config
  (:require [macchiato.env :as config]
            [mount.core :refer [defstate]]))

(defstate env :start (config/env))


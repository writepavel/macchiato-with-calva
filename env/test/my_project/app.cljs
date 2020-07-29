(ns my-project.app
  (:require
    [doo.runner :refer-macros [doo-tests]]
    [my-project.core-test]))

(doo-tests 'my-project.core-test)



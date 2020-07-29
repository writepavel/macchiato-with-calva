(ns my-project.core-test
    (:require
    [pjstadig.humane-test-output]
    [cljs.test :refer-macros [is are deftest testing use-fixtures]]
    [my-project.core]))

(deftest test-core
  (is (= true true)))



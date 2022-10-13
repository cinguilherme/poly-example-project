(ns se.example.user.interface-test
  (:require [clojure.test :as test :refer :all]
            [se.example.user.interface :as user]))

(deftest hello-when-called-with-a-name
  (testing "should greet myself"
    (is (= "Hello, Cintra!!" (user/hello "Cintra")))))
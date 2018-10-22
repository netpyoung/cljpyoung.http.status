(ns http.status.core-test
  (:require [clojure.test :refer :all])
  (:require [clojure.spec.alpha :as s])
  (:require [http.status.core :as status]))

(deftest for-readme
  (testing "status"
    (is (= 200 status/OK)))

  (testing "spec"
    (is (s/valid? ::status/unassigned 999))
    (is (s/valid? ::status/success status/OK))
    (is (s/valid? ::status/success status/CREATED)))

  (testing "predicate"
    (is (status/ok? status/OK)))

  (testing "helper"
    (is (= #'http.status.core/CREATED
           (status/status status/CREATED)))
    (is (= "Created"
           (status/name status/CREATED)))
    (is (= "The request has been fulfilled and resulted in a new resource being created."
           (status/doc status/CREATED)))))

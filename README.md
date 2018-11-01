# http-response

[![Clojars Project](https://img.shields.io/clojars/v/netpyoung/http.status.svg)](https://clojars.org/netpyoung/http.status)

* HTTP Statuses with `cljc`
* There are some other librarys. But I just want to focus on http status itself.

## Usage

``` clojure
(ns http.status-test
  (:require [clojure.test :refer :all])
  (:require [clojure.spec.alpha :as s])
  (:require [http.status :as status]))

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
    (is (= #'http.status/CREATED
           (status/status status/CREATED)))
    (is (= "Created"
           (status/name status/CREATED)))
    (is (= "The request has been fulfilled and resulted in a new resource being created."
           (status/doc status/CREATED)))))
```

## Ref:
* https://github.com/metosin/ring-http-response
* https://github.com/macchiato-framework/macchiato-http
* https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
* https://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml


## License

Copyright © 2018 netpyoung

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

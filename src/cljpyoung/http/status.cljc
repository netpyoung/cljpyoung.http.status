(ns cljpyoung.http.status
  (:require [clojure.spec.alpha :as s])
  (:require [clojure.core :refer [defn <= =]])
  (:refer-clojure :exclude [name]))

(load "status_status")
(load "status_spec")
(load "status_predicate")

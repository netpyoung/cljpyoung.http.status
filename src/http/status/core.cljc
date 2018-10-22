(ns http.status.core
  (:require [clojure.spec.alpha :as s])
  (:require [clojure.core :refer [defn <= =]])
  (:refer-clojure :exclude [name]))

(load "core_status")
(load "core_spec")
(load "core_predicate")

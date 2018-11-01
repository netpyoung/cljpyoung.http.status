(in-ns 'http.status)


(defn informational?
  "Check whether the response type is Informational (status code is between
  100 and 199)."
  [status-code]
  (<= 100 status-code 199))

(defn success?
  "Check whether the response type is Success (status code is between
  200 and 299)."
  [status-code]
  (<= 200 status-code 299))

(defn redirection?
  "Check whether the response type is Redirection (status code is between
  300 and 399)."
  [status-code]
  (<= 300 status-code 399))

(defn client-error?
  "Check whether the response type is ClientError (status code is between
  400 and 499)."
  [status-code]
  (<= 400 status-code 499))

(defn server-error?
  "Check whether the response type is ServerError (status code is between
  500 and 599)."
  [status-code]
  (<= 500 status-code 599))

(defn continue?
  "Checks whether the response has status code 100"
  [status-code]
  (= status-code 100))

(defn switching-protocols?
  "Checks whether the response has status code 101"
  [status-code]
  (= status-code 101))

(defn processing?
  "Checks whether the response has status code 102"
  [status-code]
  (= status-code 102))

(defn ok?
  "Checks whether the response has status code 200"
  [status-code]
  (= status-code 200))

(defn created?
  "Checks whether the response has status code 201"
  [status-code]
  (= status-code 201))

(defn accepted?
  "Checks whether the response has status code 202"
  [status-code]
  (= status-code 202))

(defn non-authoritative-information?
  "Checks whether the response has status code 203"
  [status-code]
  (= status-code 203))

(defn no-content?
  "Checks whether the response has status code 204"
  [status-code]
  (= status-code 204))

(defn reset-content?
  "Checks whether the response has status code 205"
  [status-code]
  (= status-code 205))

(defn partial-content?
  "Checks whether the response has status code 206"
  [status-code]
  (= status-code 206))

(defn multi-status?
  "Checks whether the response has status code 207"
  [status-code]
  (= status-code 207))

(defn already-reported?
  "Checks whether the response has status code 208"
  [status-code]
  (= status-code 208))

(defn im-used?
  "Checks whether the response has status code 226"
  [status-code]
  (= status-code 226))

(defn multiple-choices?
  "Checks whether the response has status code 300"
  [status-code]
  (= status-code 300))

(defn moved-permanently?
  "Checks whether the response has status code 301"
  [status-code]
  (= status-code 301))

(defn found?
  "Checks whether the response has status code 302"
  [status-code]
  (= status-code 302))

(defn see-other?
  "Checks whether the response has status code 303"
  [status-code]
  (= status-code 303))

(defn not-modified?
  "Checks whether the response has status code 304"
  [status-code]
  (= status-code 304))

(defn use-proxy?
  "Checks whether the response has status code 305"
  [status-code]
  (= status-code 305))

(defn temporary-redirect?
  "Checks whether the response has status code 307"
  [status-code]
  (= status-code 307))

(defn permanent-redirect?
  "Checks whether the response has status code 308"
  [status-code]
  (= status-code 308))

(defn bad-request?
  "Checks whether the response has status code 400"
  [status-code]
  (= status-code 400))

(defn unauthorized?
  "Checks whether the response has status code 401"
  [status-code]
  (= status-code 401))

(defn payment-required?
  "Checks whether the response has status code 402"
  [status-code]
  (= status-code 402))

(defn forbidden?
  "Checks whether the response has status code 403"
  [status-code]
  (= status-code 403))

(defn not-found?
  "Checks whether the response has status code 404"
  [status-code]
  (= status-code 404))

(defn method-not-allowed?
  "Checks whether the response has status code 405"
  [status-code]
  (= status-code 405))

(defn not-acceptable?
  "Checks whether the response has status code 406"
  [status-code]
  (= status-code 406))

(defn proxy-authentication-required?
  "Checks whether the response has status code 407"
  [status-code]
  (= status-code 407))

(defn request-timeout?
  "Checks whether the response has status code 408"
  [status-code]
  (= status-code 408))

(defn conflict?
  "Checks whether the response has status code 409"
  [status-code]
  (= status-code 409))

(defn gone?
  "Checks whether the response has status code 410"
  [status-code]
  (= status-code 410))

(defn length-required?
  "Checks whether the response has status code 411"
  [status-code]
  (= status-code 411))

(defn precondition-failed?
  "Checks whether the response has status code 412"
  [status-code]
  (= status-code 412))

(defn request-entity-too-large?
  "Checks whether the response has status code 413"
  [status-code]
  (= status-code 413))

(defn request-uri-too-long?
  "Checks whether the response has status code 414"
  [status-code]
  (= status-code 414))

(defn unsupported-media-type?
  "Checks whether the response has status code 415"
  [status-code]
  (= status-code 415))

(defn requested-range-not-satisfiable?
  "Checks whether the response has status code 416"
  [status-code]
  (= status-code 416))

(defn expectation-failed?
  "Checks whether the response has status code 417"
  [status-code]
  (= status-code 417))

(defn enhance-your-calm?
  "Checks whether the response has status code 420"
  [status-code]
  (= status-code 420))

(defn unprocessable-entity?
  "Checks whether the response has status code 422"
  [status-code]
  (= status-code 422))

(defn locked?
  "Checks whether the response has status code 423"
  [status-code]
  (= status-code 423))

(defn failed-dependency?
  "Checks whether the response has status code 424"
  [status-code]
  (= status-code 424))

(defn unordered-collection?
  "Checks whether the response has status code 425"
  [status-code]
  (= status-code 425))

(defn upgrade-required?
  "Checks whether the response has status code 426"
  [status-code]
  (= status-code 426))

(defn precondition-required?
  "Checks whether the response has status code 428"
  [status-code]
  (= status-code 428))

(defn too-many-requests?
  "Checks whether the response has status code 429"
  [status-code]
  (= status-code 429))

(defn request-header-fields-too-large?
  "Checks whether the response has status code 431"
  [status-code]
  (= status-code 431))

(defn retry-with?
  "Checks whether the response has status code 449"
  [status-code]
  (= status-code 449))

(defn blocked-by-windows-parental-controls?
  "Checks whether the response has status code 450"
  [status-code]
  (= status-code 450))

(defn unavailable-for-legal-reasons?
  "Checks whether the response has status code 451"
  [status-code]
  (= status-code 451))

(defn internal-server-error?
  "Checks whether the response has status code 500"
  [status-code]
  (= status-code 500))

(defn not-implemented?
  "Checks whether the response has status code 501"
  [status-code]
  (= status-code 501))

(defn bad-gateway?
  "Checks whether the response has status code 502"
  [status-code]
  (= status-code 502))

(defn service-unavailable?
  "Checks whether the response has status code 503"
  [status-code]
  (= status-code 503))

(defn gateway-timeout?
  "Checks whether the response has status code 504"
  [status-code]
  (= status-code 504))

(defn http-version-not-supported?
  "Checks whether the response has status code 505"
  [status-code]
  (= status-code 505))

(defn variant-also-negotiates?
  "Checks whether the response has status code 506"
  [status-code]
  (= status-code 506))

(defn insufficient-storage?
  "Checks whether the response has status code 507"
  [status-code]
  (= status-code 507))

(defn loop-detected?
  "Checks whether the response has status code 508"
  [status-code]
  (= status-code 508))

(defn bandwidth-limit-exceeded?
  "Checks whether the response has status code 509"
  [status-code]
  (= status-code 509))

(defn not-extended?
  "Checks whether the response has status code 510"
  [status-code]
  (= status-code 510))

(defn network-authentication-required?
  "Checks whether the response has status code 511"
  [status-code]
  (= status-code 511))

(defn network-read-timeout?
  "Checks whether the response has status code 598"
  [status-code]
  (= status-code 598))

(defn network-connect-timeout?
  "Checks whether the response has status code 599"
  [status-code]
(= status-code 599))

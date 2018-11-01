(in-ns 'http.status)
;; http.status :as status
;; ref: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes

(def
  ^{:static true
    :doc "The server has received the request headers and the client should proceed to send the request body."
    ::name "Continue"}
  CONTINUE 100)

(def
  ^{:static true
    ::name "Switching Protocols"
    :doc "The server is switching protocols because the client requested the switch."}
  SWITCHING_PROTOCOLS 101)

(def
  ^{:static true
    ::name "Processing"
    :doc "The server is processing the request but no response is available yet."}
  PROCESSING 102)

(def
  ^{:static true
    ::name "Early Hints"
    :doc "Used to return some response headers before final HTTP message."}
  EARLY_HINTS 103)

(def
  ^{:static true
    ::name "OK"
    :doc "OK"}
  OK 200)

(def
  ^{:static true
    ::name "Created"
    :doc "The request has been fulfilled and resulted in a new resource being created."}
  CREATED 201)

(def
  ^{:static true
    ::name "Accepted"
    :doc "The request has been accepted for processing but the processing has not been completed."}
  ACCEPTED 202)

(def
  ^{:static true
    ::name "Non-Authoritative Information"
    :doc "The server successfully processed the request but is returning information that may be from another source."}
  NON_AUTHORITATIVE_INFORMATION 203)

(def
  ^{:static true
    ::name "No Content"
    :doc "The server successfully processed the request, but is not returning any content. Usually used as a response to a successful delete request."}
  NO_CONTENT 204)

(def
  ^{:static true
    ::name "Reset Content"
    :doc "The server successfully processed the request but is not returning any content. Unlike a 204 response, this response requires that the requester reset the document view."}
  RESET_CONTENT 205)

(def
  ^{:static true
    ::name "Partial Content"
    :doc "The server is delivering only part of the resource due to a range header sent by the client."}
  PARTIAL_CONTENT 206)

(def
  ^{:static true
    ::name "Multi-Status"
    :doc "The message body that follows is an XML message and can contain a number of separate response codes depending on how many sub-requests were made."}
  MULTI_STATUS 207)

(def
  ^{:static true
    ::name "Already Reported"
    :doc "The members of a DAV binding have already been enumerated in a previous reply to this request and are not being included again."}
  ALREADY_REPORTED 208)

(def
  ^{:static true
    ::name "IM Used"
    :doc "The server has fulfilled a GET request for the resource and the response is a representation of the result of one or more instance-manipulations applied to the current instance."}
  IM_USED 226)

(def
  ^{:static true
    ::name "Multiple Choices"
    :doc "There are multiple options for the resource that the client may follow."}
  MULTIPLE_CHOICES 300)

(def
  ^{:static true
    ::name "Moved Permanently"
    :doc "This and all future requests should be directed to the given URI."}
  MOVED_PERMANENTLY 301)

(def
  ^{:static true
    ::name "Found"
    :doc "The resource was found but at a different URI."}
  FOUND 302)

(def
  ^{:static true
    ::name "See Other"
    :doc "The response to the request can be found under another URI using a GET method."}
  SEE_OTHER 303)

(def
  ^{:static true
    ::name "Not Modified"
    :doc "The resource has not been modified since last requested."}
  NOT_MODIFIED 304)

(def
  ^{:static true
    ::name "Use Proxy"
    :doc "This single request is to be repeated via the proxy given by the Location field."}
  USE_PROXY 305)

(def
  ^{:static true
    ::name "Switch Proxy"
    :doc "No longer used. Originally meant \"Subsequent requests should use the specified proxy.\""}
  SWITCH_PROXY 306)

(def
  ^{:static true
    ::name "Temporary Redirect"
    :doc "The request should be repeated with another URI but future requests can still use the original URI."}
  TEMPORARY_REDIRECT 307)

(def
  ^{:static true
    ::name "Permanent Redirect"
    :doc "The request and all future requests should be repeated using another URI."}
  PERMANENT_REDIRECT 308)

(def
  ^{:static true
    ::name "Bad Request"
    :doc "The request contains bad syntax or cannot be fulfilled."}
  BAD_REQUEST 400)

(def
  ^{:static true
    ::name "Unauthorized"
    :doc "Authentication is possible but has failed or not yet been provided."}
  UNAUTHORIZED 401)

(def
  ^{:static true
    ::name "Payment Required"
    :doc "Reserved for future use."}
  PAYMENT_REQUIRED 402)

(def
  ^{:static true
    ::name "Forbidden"
    :doc "The request was a legal request but the server is refusing to respond to it."}
  FORBIDDEN 403)

(def
  ^{:static true
    ::name "Not Found"
    :doc "The requested resource could not be found but may be available again in the future."}
  NOT_FOUND 404)

(def
  ^{:static true
    ::name "Method Not Allowed"
    :doc "A request was made of a resource using a request method not supported by that resource;"}
  METHOD_NOT_ALLOWED 405)

(def
  ^{:static true
    ::name "Not Acceptable"
    :doc "The requested resource is only capable of generating content not acceptable according to the Accept headers sent in the request."}
  NOT_ACCEPTABLE 406)

(def
  ^{:static true
    ::name "Proxy Authentication Required"
    :doc "Proxy authentication is required to access the requested resource."}
  PROXY_AUTHENTICATION_REQUIRED 407)

(def
  ^{:static true
    ::name "Request Timeout"
    :doc "The server timed out waiting for the request."}
  REQUEST_TIMEOUT 408)

(def
  ^{:static true
    ::name "Conflict"
    :doc "The request could not be processed because of conflict in the request such as an edit conflict."}
  CONFLICT 409)

(def
  ^{:static true
    ::name "Gone"
    :doc "The resource requested is no longer available and will not be available again."}
  GONE 410)

(def
  ^{:static true
    ::name "Length Required"
    :doc "The request did not specify the length of its content which is required by the requested resource."}
  LENGTH_REQUIRED 411)

(def
  ^{:static true
    ::name "Precondition Failed"
    :doc "The server does not meet one of the preconditions that the requester put on the request."}
  PRECONDITION_FAILED 412)

(def
  ^{:static true
    ::name "Request Entity Too Large"
    :doc "The request is larger than the server is willing or able to process."}
  REQUEST_ENTITY_TOO_LARGE 413)

(def
  ^{:static true
    ::name "Request-URI Too Long"
    :doc "The URI provided was too long for the server to process."}
  REQUEST_URI_TOO_LONG 414)

(def
  ^{:static true
    ::name "Unsupported Media Type"
    :doc "The request entity has a media type which the server or resource does not support."}
  UNSUPPORTED_MEDIA_TYPE 415)

(def
  ^{:static true
    ::name "Requested Range Not Satisfiable"
    :doc "The client has asked for a portion of the file but the server cannot supply that portion."}
  REQUESTED_RANGE_NOT_SATISFIABLE 416)

(def
  ^{:static true
    ::name "Expectation Failed"
    :doc "The server cannot meet the requirements of the Expect request-header field."}
  EXPECTATION_FAILED 417)


(def
  ^{:static true
    ::name "I'm a teapot"
    :doc "This code was defined in 1998 as one of the traditional IETF April Fools' jokes, in RFC 2324, Hyper Text Coffee Pot Control Protocol, and is not expected to be implemented by actual HTTP servers."}
  IAM_A_TEAPOT 418)


(def
  ^{:static true
    ::name "Enhance Your Calm"
    :doc "You are being rate-limited."}
  ENHANCE_YOUR_CALM 420)

(def
  ^{:static true
    ::name "Misdirected Request"
    :doc "The request was directed at a server that is not able to produce a response[55] (for example because of connection reuse)"}
  MISDIRECTED_REQUEST 421)

(def
  ^{:static true
    ::name "Unprocessable Entity"
    :doc "The request was well-formed but was unable to be followed due to semantic errors."}
  UNPROCESSABLE_ENTITY 422)

(def
  ^{:static true
    ::name "Locked"
    :doc "The resource that is being accessed is locked."}
  LOCKED 423)

(def
  ^{:static true
    ::name "Failed Dependency"
    :doc "The request failed due to failure of a previous request."}
  FAILED_DEPENDENCY 424)

(def
  ^{:static true
    ::name "Unordered Collection"
    :doc "The collection is unordered."}
  UNORDERED_COLLECTION 425)

(def
  ^{:static true
    ::name "Upgrade Required"
    :doc "The client should switch to a different protocol."}
  UPGRADE_REQUIRED 426)

(def
  ^{:static true
    ::name "Precondition Required"
    :doc "The server requires the request to be conditional."}
  PRECONDITION_REQUIRED 428)

(def
  ^{:static true
    ::name "Too Many Requests"
    :doc "The user has sent too many requests in a given amount of time."}
  TOO_MANY_REQUESTS 429)

(def
  ^{:static true
    ::name "Request Header Fields Too Large"
    :doc "The server is unwilling to process the request because either an individual header field or all the header fields collectively are too large."}
  REQUEST_HEADER_FIELDS_TOO_LARGE 431)

(def
  ^{:static true
    ::name "Login Time-out"
    :doc "The client's session has expired and must log in again."}
  LOGIN_TIMEOUT 440)

(def
  ^{:static true
    ::name "Retry With"
    :doc "The request should be retried after doing the appropriate action."}
  RETRY_WITH 449)

(def
  ^{:static true
    ::name "Blocked by Windows Parental Controls"
    :doc "Windows Parental Controls are turned on and are blocking access to the given webpage."}
  BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS 450)

(def
  ^{:static true
    ::name "Unavailable For Legal Reasons"
    :doc "Resource access is denied for legal reasons."}
  UNAVAILABLE_FOR_LEGAL_REASONS 451)

(def
  ^{:static true
    ::name "Internal Server Error"
    :doc "There was an internal server error."}
  INTERNAL_SERVER_ERROR 500)

(def
  ^{:static true
    ::name "Not Implemented"
    :doc "The server either does not recognize the request method or it lacks the ability to fulfill the request."}
  NOT_IMPLEMENTED 501)

(def
  ^{:static true
    ::name "Bad Gateway"
    :doc "The server was acting as a gateway or proxy and received an invalid response from the upstream server."}
  BAD_GATEWAY 502)

(def
  ^{:static true
    ::name "Service Unavailable"
    :doc "The server is currently unavailable (because it is overloaded or down for maintenance)."}
  SERVICE_UNAVAILABLE 503)

(def
  ^{:static true
    ::name "Gateway Timeout"
    :doc "The server was acting as a gateway or proxy and did not receive a timely request from the upstream server."}
  GATEWAY_TIMEOUT 504)

(def
  ^{:static true
    ::name "HTTP Version Not Supported"
    :doc "The server does not support the HTTP protocol version used in the request."}
  HTTP_VERSION_NOT_SUPPORTED 505)

(def
  ^{:static true
    ::name "Variant Also Negotiates"
    :doc "Transparent content negotiation for the request results in a circular reference."}
  VARIANT_ALSO_NEGOTIATES 506)

(def
  ^{:static true
    ::name "Insufficient Storage"
    :doc "Insufficient storage to complete the request."}
  INSUFFICIENT_STORAGE 507)

(def
  ^{:static true
    ::name "Loop Detected"
    :doc "The server detected an infinite loop while processing the request."}
  LOOP_DETECTED 508)

(def
  ^{:static true
    ::name "Bandwidth Limit Exceeded"
    :doc "Bandwidth limit has been exceeded."}
  BANDWIDTH_LIMIT_EXCEEDED 509)

(def
  ^{:static true
    ::name "Not Extended"
    :doc "Further extensions to the request are required for the server to fulfill it."}
  NOT_EXTENDED 510)

(def
  ^{:static true
    ::name "Network Authentication Required"
    :doc "The client needs to authenticate to gain network access."}
  NETWORK_AUTHENTICATION_REQUIRED 511)

(def
  ^{:static true
    ::name "Network read timeout"
    :doc ""}
  NETWORK_READ_TIMEOUT 598)

(def
  ^{:static true
    ::name "Network connect timeout"
    :doc ""}
  NETWORK_CONNECT_TIMEOUT 599)

(def
  ^{:static true
    :doc "Maps status to name and description"}
  CODE_STATUS_DIC
  {100 #'CONTINUE
   101 #'SWITCHING_PROTOCOLS
   102 #'PROCESSING
   103 #'EARLY_HINTS

   200 #'OK
   201 #'CREATED
   202 #'ACCEPTED
   203 #'NON_AUTHORITATIVE_INFORMATION
   204 #'NO_CONTENT
   205 #'RESET_CONTENT
   206 #'PARTIAL_CONTENT
   207 #'MULTI_STATUS
   208 #'ALREADY_REPORTED
   226 #'IM_USED

   300 #'MULTIPLE_CHOICES
   301 #'MOVED_PERMANENTLY
   302 #'FOUND
   303 #'SEE_OTHER
   304 #'NOT_MODIFIED
   305 #'USE_PROXY
   306 #'SWITCH_PROXY
   307 #'TEMPORARY_REDIRECT
   308 #'PERMANENT_REDIRECT

   400 #'BAD_REQUEST
   401 #'UNAUTHORIZED
   402 #'PAYMENT_REQUIRED
   403 #'FORBIDDEN
   404 #'NOT_FOUND
   405 #'METHOD_NOT_ALLOWED
   406 #'NOT_ACCEPTABLE
   407 #'PROXY_AUTHENTICATION_REQUIRED
   408 #'REQUEST_TIMEOUT
   409 #'CONFLICT
   410 #'GONE
   411 #'LENGTH_REQUIRED
   412 #'PRECONDITION_FAILED
   413 #'REQUEST_ENTITY_TOO_LARGE
   414 #'REQUEST_URI_TOO_LONG
   415 #'UNSUPPORTED_MEDIA_TYPE
   416 #'REQUESTED_RANGE_NOT_SATISFIABLE
   417 #'EXPECTATION_FAILED
   420 #'ENHANCE_YOUR_CALM
   422 #'UNPROCESSABLE_ENTITY
   423 #'LOCKED
   424 #'FAILED_DEPENDENCY
   425 #'UNORDERED_COLLECTION
   426 #'UPGRADE_REQUIRED
   428 #'PRECONDITION_REQUIRED
   429 #'TOO_MANY_REQUESTS
   431 #'REQUEST_HEADER_FIELDS_TOO_LARGE
   440 #'LOGIN_TIMEOUT
   449 #'RETRY_WITH
   450 #'BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS
   451 #'UNAVAILABLE_FOR_LEGAL_REASONS

   500 #'INTERNAL_SERVER_ERROR
   501 #'NOT_IMPLEMENTED
   502 #'BAD_GATEWAY
   503 #'SERVICE_UNAVAILABLE
   504 #'GATEWAY_TIMEOUT
   505 #'HTTP_VERSION_NOT_SUPPORTED
   506 #'VARIANT_ALSO_NEGOTIATES
   507 #'INSUFFICIENT_STORAGE
   508 #'LOOP_DETECTED
   509 #'BANDWIDTH_LIMIT_EXCEEDED
   510 #'NOT_EXTENDED
   511 #'NETWORK_AUTHENTICATION_REQUIRED
   598 #'NETWORK_READ_TIMEOUT
   599 #'NETWORK_CONNECT_TIMEOUT})

(defn name
  "Returns http status name by code."
  [status-code]
  (-> status-code CODE_STATUS_DIC meta ::name))

(defn doc
  "Returns http status description by code."
  [status-code]
  (-> status-code CODE_STATUS_DIC meta :doc))

(defn status
  "Returns http status var."
  [status-code]
  (-> status-code CODE_STATUS_DIC))

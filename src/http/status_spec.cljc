(in-ns 'http.status)

(s/def ::informational-response
  #{
    CONTINUE                            ;100
    SWITCHING_PROTOCOLS                 ;101
    PROCESSING                          ;102
    EARLY_HINTS                         ;103
    })

(s/def ::success
  #{
    OK                                  ;200
    CREATED                             ;201
    ACCEPTED                            ;202
    NON_AUTHORITATIVE_INFORMATION       ;203
    NO_CONTENT                          ;204
    RESET_CONTENT                       ;205
    PARTIAL_CONTENT                     ;206
    MULTI_STATUS                        ;207
    ALREADY_REPORTED                    ;208
    IM_USED                             ;226
    })

(s/def ::redirection
  #{
    MULTIPLE_CHOICES                    ;300
    MOVED_PERMANENTLY                   ;301
    FOUND                               ;302
    SEE_OTHER                           ;304
    NOT_MODIFIED                        ;305
    USE_PROXY                           ;306
    SWITCH_PROXY                        ;307
    TEMPORARY_REDIRECT                  ;308
    PERMANENT_REDIRECT                  ;309
    })

(s/def ::client-error
  #{
    BAD_REQUEST                       ;400
    UNAUTHORIZED                      ;401
    PAYMENT_REQUIRED                  ;402
    FORBIDDEN                         ;403
    NOT_FOUND                         ;404
    METHOD_NOT_ALLOWED                ;405
    NOT_ACCEPTABLE                    ;406
    PROXY_AUTHENTICATION_REQUIRED     ;407
    REQUEST_TIMEOUT                   ;408
    CONFLICT                          ;409
    GONE                              ;410
    LENGTH_REQUIRED                   ;411
    PRECONDITION_FAILED               ;412
    REQUEST_ENTITY_TOO_LARGE          ;413
    REQUEST_URI_TOO_LONG              ;414
    UNSUPPORTED_MEDIA_TYPE            ;415
    REQUESTED_RANGE_NOT_SATISFIABLE   ;416
    EXPECTATION_FAILED                ;417
    IAM_A_TEAPOT                      ;418
    MISDIRECTED_REQUEST               ;421
    UNPROCESSABLE_ENTITY              ;422
    LOCKED                            ;423
    FAILED_DEPENDENCY                 ;424
    UPGRADE_REQUIRED                  ;426
    PRECONDITION_REQUIRED             ;428
    TOO_MANY_REQUESTS                 ;429
    REQUEST_HEADER_FIELDS_TOO_LARGE   ;431
    UNAVAILABLE_FOR_LEGAL_REASONS     ;451
    })

(s/def ::server-error
  #{
    INTERNAL_SERVER_ERROR             ;500
    NOT_IMPLEMENTED                   ;501
    BAD_GATEWAY                       ;502
    SERVICE_UNAVAILABLE               ;503
    GATEWAY_TIMEOUT                   ;504
    HTTP_VERSION_NOT_SUPPORTED        ;505
    VARIANT_ALSO_NEGOTIATES           ;506
    INSUFFICIENT_STORAGE              ;507
    LOOP_DETECTED                     ;508
    BANDWIDTH_LIMIT_EXCEEDED          ;509
    NOT_EXTENDED                      ;510
    NETWORK_AUTHENTICATION_REQUIRED   ;511
    })


(s/def ::unassigned
  ;; 104-199 	Unassigned
  ;; 209-225 	Unassigned
  ;; 227-299 	Unassigned
  ;; 309-399 	Unassigned
  ;; 418-420 	Unassigned
  ;; 432-450 	Unassigned
  ;; 452-499 	Unassigned
  ;; 512-599 	Unassigned
  #(or (<= % 100)
       (<= 104 % 199)
       (<= 209 % 225)
       (<= 227 % 299)
       (<= 309 % 399)
       (<= 418 % 420)
       (<= 432 % 450)
       (<= 452 % 499)
       (<= 512 % 599)
       (<= 600 %)))

;; http://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml
(s/def ::status-codes-official
(s/or ::informational-response
      ::informational-response
      ::success
      ::success
      ::redirection
      ::redirection
      ::client-error
      ::client-error
      ::server-error
      ::server-error))

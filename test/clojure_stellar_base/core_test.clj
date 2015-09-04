(ns clojure-stellar-base.core-test
  (:require [clojure.test :refer :all]
            [clojure-stellar-base.core :refer :all]))

(deftest random-out
  (encode (xdr-out) (pubkey (random-key))))

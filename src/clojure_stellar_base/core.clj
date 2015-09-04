(ns clojure-stellar-base.core)

(defn random-key []
  (org.stellar.base.StellarKeypair/random))

(defn xdr-stream [out]
  (new org.stellar.base.xdr.XdrDataOutputStream out))

(defn xdr-out []
  (xdr-stream (new java.io.DataOutputStream System/out)))

(defn pubkey [keypair]
  (.getXdrPublicKey keypair))

(defn encode [xdrstream xdrthing]
  (clojure.lang.Reflector/invokeStaticMethod
   (class xdrthing) "encode" (to-array [xdrstream xdrthing])))

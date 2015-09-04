(defproject clojure-stellar-base "0.1.0-SNAPSHOT"
  :description "Clojure client for stellar-core"
  :url "http://stellar.org"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  ; NB: The java-stellar-base and net.i2p.crypto jars are not
  ; published to any public maven repos presently.
  ;
  ; This makes it awkward to use them externally from their development
  ; trees; there appears to be no reasonable way to refer to jars between
  ; paths on the local filesystem from leiningen, without going through
  ; a "local maven repo", so we use the lein-localrepo helper to install
  ; them.
  ;
  ; Basically you want to grab the jars from the java-stellar-base repo and
  ; do some variant of:
  ;
  ;  $ lein localrepo install java-stellar-base-1.0.0.jar java-stellar-base/java-stellar-base 1.0.0
  ;  $ lein localrepo install net.i2p.crypto-4.0.0.jar net.i2p.crypto/net.i2p.crypto 4.0.0

  :plugins [[lein-localrepo "0.5.3"]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [java-stellar-base "1.0.0"]
                 [net.i2p.crypto "4.0.0"]])

(defproject generator "0.1.0-SNAPSHOT"
  :description "create traffic to rabbit for toy project"
  :license {:name "The MIT LIcense"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.novemberain/langohr "3.3.0"]]
  :main generator.core
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}}
  :plugins [[lein-midje "3.1.3"]]
  :test-paths ["test"])

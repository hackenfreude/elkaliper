(ns generator.core
  (:gen-class)
  (:require [langohr.core :as rmq]
            [langohr.channel :as lch]
            [langohr.basic :as lb]))

(defn -main
  [& args]
  (let [conn (rmq/connect {:host "rabbit"})
        ch (lch/open conn)
        routing-key ""
        exchange "logs"]
    (Thread/sleep 10000)
    (println (format "[main] Connected. Channel id: %d" (.getChannelNumber ch)))
    (dotimes [n 1000] (lb/publish ch exchange routing-key "Hello!"))
    (Thread/sleep 2000)
    (println "[main] Disconnecting...")
    (rmq/close ch)
    (rmq/close conn)))


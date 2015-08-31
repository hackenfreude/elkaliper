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
    (println (format "[main] Connected. Channel id: %d" (.getChannelNumber ch)))
    (lb/publish ch exchange routing-key "Hello!")
    (Thread/sleep 2000)
    (println "[main] Disconnecting...")
    (rmq/close ch)
    (rmq/close conn)))


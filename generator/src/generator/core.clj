(ns generator.core)

(defn smoke-test []
  true)

(defn do-stuff []
  println "hello world")

(defn -main []
  (do-stuff))

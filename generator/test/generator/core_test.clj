(ns generator.core-test
  (:use midje.sweet)
  (:require [generator.core :refer :all]))

(fact "smoke test should pass"
      (smoke-test) => false)

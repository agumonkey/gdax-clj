(defproject gdax-clj "0.1.0-SNAPSHOT"
  :description "A Clojure wrapper for the GDAX API."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [pandect "0.6.1"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]
                 [environ "1.1.0"]
                 [clj-time "0.14.2"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.codec "0.1.1"]]
  :plugins [[lein-environ "1.1.0"]])

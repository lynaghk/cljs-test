(defproject cljs-tests "0.1.0-SNAPSHOT"
  :plugins [[lein-cljsbuild "0.3.3"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]
                 [com.keminglabs/c2 "0.2.3"]]
  :cljsbuild {:builds [{:source-paths ["c2-src"]
                        :compiler {:output-to "public/c2-test.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})

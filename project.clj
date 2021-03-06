(defproject metosin/ring-http-response "0.9.0"
  :description "Handling HTTP Statuses with Clojure(Script)"
  :url "https://github.com/metosin/ring-http-response"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[ring/ring-core "1.6.0"]
                 [potemkin "0.4.3"]]
  :profiles {:dev {:plugins [[lein-clojars "0.9.1"]]
                   :resource-paths ["templates"]
                   :source-paths ["dev"]
                   :dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.tobereplaced/lettercase "1.0.0"]
                                  [stencil "0.5.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0-alpha16"]]}}
  :deploy-repositories [["releases" :clojars]]
  :aliases {"all" ["with-profile" "dev:dev,1.7:dev,1.9" "test"]})

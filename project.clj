(defproject
  badassguestbook
  "0.1.0-SNAPSHOT"
  :dependencies
  [[org.clojure/clojure "1.5.1"]
   [lib-noir "0.7.0"]
   [compojure "1.1.5"]
   [ring-server "0.3.0"]
   [selmer "0.4.3"]
   [com.taoensso/timbre "2.6.2"]
   [com.postspectacular/rotor "0.1.0"]
   [com.taoensso/tower "1.7.1"]
   [markdown-clj "0.9.32"]
   [com.h2database/h2 "1.3.172"]
   [korma "0.3.0-RC5"]
   [log4j
    "1.2.17"
    :exclusions
    [javax.mail/mail
     javax.jms/jms
     com.sun.jdmk/jmxtools
     com.sun.jmx/jmxri]]]
  :ring
  {:handler badassguestbook.handler/war-handler,
   :init badassguestbook.handler/init,
   :destroy badassguestbook.handler/destroy}
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}},
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.0"]]}}
  :url
  "http://example.com/FIXME"
  :plugins
  [[lein-ring "0.8.7"]]
  :description
  "FIXME: write description"
  :min-lein-version "2.0.0")
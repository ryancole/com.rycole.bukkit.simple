(defproject com.rycole.bukkit.simple "0.1.0-SNAPSHOT"
  :repositories [["bukkit.release" "http://repo.bukkit.org/content/repositories/releases"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.bukkit/bukkit "1.4.7-R0.1"]]
  :filespecs [{:type :path :path "src\\plugin.yml"}]
  :aot :all)

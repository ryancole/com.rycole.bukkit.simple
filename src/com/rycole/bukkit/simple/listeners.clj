(ns com.rycole.bukkit.simple.listeners
  (:gen-class :name com.rycole.bukkit.simple.listeners.PlayerLoginListener
              :implements [org.bukkit.event.Listener]
              :methods [[^{org.bukkit.event.EventHandler true} onPlayerLoggedIn [org.bukkit.event.player.PlayerLoginEvent] void]]))

(defn -onPlayerLoggedIn [this evnt]
  (.info (org.bukkit.Bukkit/getLogger) "PLAYER LOGGED IN"))

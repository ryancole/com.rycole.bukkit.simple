(ns com.rycole.bukkit.simple.core
  (:require com.rycole.bukkit.simple.listeners)
  (:import [com.rycole.bukkit.simple.listeners PlayerLoginListener])
  (:gen-class :name com.rycole.bukkit.simple.core.Main
              :extends org.bukkit.plugin.java.JavaPlugin))

(defn -onEnable [this]
  (.info (.getLogger this) "PLUGIN ENABLED")
  (.registerEvents (.getPluginManager (.getServer this)) (com.rycole.bukkit.simple.listeners.PlayerLoginListener.) this))

(defn -onDisable [this]
  (.info (.getLogger this) "PLUGIN DISABLED"))

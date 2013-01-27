# Simple Bukkit Plugin, in Clojure

A Clojure library designed to ... well, serve as a simple example of how to write Bukkit plugins.

## Usage

Simply clone this repository and compile using `lein jar`. This should install the required dependencies and create the required `jar` file, for Bukkit. Copy the `jar` file into Bukkit's plugin directory and then start the server. The plugin will be loaded.

## Class path requirements

You must include clojure, the plugins and bukkit on the class path for this to work. An example would be:

```
java -cp ~\clojure-1.4.0.jar;~\bukkit\plugins\*;~\bukkit\craftbukkit.jar org.bukkit.craftbukkit.Main
```

## License

Copyright © 2013 Ryan Cole

Distributed under the Eclipse Public License, the same as Clojure.

package com.tehrandomguy;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Community extends JavaPlugin{
	// Define variables
	Logger log = Logger.getLogger("Minecraft");
	String prefix = "[Community] ";
	// Define onEnable
	public void onEnable(){
		// Register events
		PluginManager PM = getServer().getPluginManager();
		// Output to log
		log.info(prefix + "Community now enabled!");
	}
	// Define onDisable
	public void onDisable(){
		log.info(prefix + "Community now disabled!");
	}
}

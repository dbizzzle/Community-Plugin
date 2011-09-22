package com.tehrandomguy;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerPortalEvent;

public class PlayerListen extends PlayerListener{
	// Define constructor
	Community plugin;
	public PlayerListen(Community instance){
		plugin = instance;
	}
	
	// Call Player_Portal Event
	public void onPlayerPortal(PlayerPortalEvent _event){
		Player _Player = _event.getPlayer();
		// Check if the player has permission
		if(_Player.hasPermission("community.portal")){
			// If yes, do nothing
			_event.setCancelled(false);
		} else {
			// If no, cancel the event
			_event.setCancelled(true);
		}
	}
}

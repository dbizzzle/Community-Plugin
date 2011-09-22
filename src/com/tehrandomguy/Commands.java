package com.tehrandomguy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("pokeme")){
			try{
				Player s = (Player) sender;
				String se = s.getDisplayName();
				Bukkit.getServer().getPlayer(args[0]).sendMessage(se + " pokes you!");
				Bukkit.getServer().getPlayer(args[0]).damage(1);
				Bukkit.getServer().getPlayer(args[0]).chat("Ouch!");
				return false;
			} catch(ArrayIndexOutOfBoundsException e){
				s.sendMessage(ChatColor.RED + "Use /pokeme <player>");
				return false;
			}
		}
		
		if (command.getName().equalsIgnoreCase("slap")) {
			Player s = (Player) sender;
			String se = s.getDisplayName();
			if (args.length == 0) {
				s.sendMessage(ChatColor.RED + "Please select a player to slap.");
			} else if (args.length > 0) {
				Player slapped = getServer().getPlayer(args[0]);
				String slap = slapped.getDisplayName();
				slapped.damage(3);
				slapped.sendMessage(ChatColor.BLUE + se + " slapped you! Whatcha gonna do about it!?");
				slapped.sendMessage(ChatColor.BLUE + "Slap them back with: /slap <player>"
				slapped.chat("Ouch!");
				//hehe couldn't come up with any other commands without my ide on this computer
			}
		}
		return false;
	}

}
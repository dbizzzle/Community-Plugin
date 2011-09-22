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
				sender.sendMessage(ChatColor.RED + "Use /pokeme <player>");
				return false;
			}
		}
		
		if (command.getName().equalsIgnoreCase("slap")) {
			Player s = (Player) sender;
			String se = s.getDisplayName();
			if (args.length == 0) {
				s.sendMessage(ChatColor.RED + "Proper Usage:");
				s.sendMessage(ChatColor.RED + "/slap <player>");
			} else if (args.length > 0) {
				Player slapped = Bukkit.getServer().getPlayer(args[0]);
				String slap = slapped.getDisplayName();
				slapped.damage(3);
				slapped.sendMessage(ChatColor.GOLD + se + ChatColor.BLUE + 
				        " slapped you! Whatcha gonna do about it!?");
				slapped.sendMessage(ChatColor.BLUE + "Slap them back with: /slap <player>");
				s.sendMessage(ChatColor.BLUE + "You have slapped " + ChatColor.GOLD + slap + 
				        ChatColor. BLUE +"!");
				s.sendMessage(ChatColor.BLUE + "Better watch out they don't slap back!");
				slapped.chat("Ouch!");
			}
		}
		return false;
	}

}
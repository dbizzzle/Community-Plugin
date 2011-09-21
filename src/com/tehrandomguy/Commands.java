package com.tehrandomguy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	public boolean onCommand(CommandSender _sender, Command _cmd, String _label, String[] _args) {
		if(_cmd.getName().equalsIgnoreCase("pokeme")){
			try{
				Player _pSender = (Player)_sender;
				Bukkit.getServer().getPlayer(_args[0]).sendMessage(_pSender.getDisplayName() + " pokes you!");
				Bukkit.getServer().getPlayer(_args[0]).damage(1);
				Bukkit.getServer().getPlayer(_args[0]).chat("Ouch!");
				return false;
			} catch(ArrayIndexOutOfBoundsException e){
				_sender.sendMessage(ChatColor.RED + "Use /pokeme <player>");
				return false;
			}
		}
		return false;
	}

}
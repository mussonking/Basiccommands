package com.dragonsdoom.basiccommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class modifyMessages implements CommandExecutor {
	public modifyMessages(Main main) {}

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){	

		if(cmd.getName().equalsIgnoreCase("setmessage")){
			if(args.length < 2) {
				sender.sendMessage("Invalid Value.");
			}	
			
				else
					if(args[0].equalsIgnoreCase("donate") || args[0].equalsIgnoreCase("website") || args[0].equalsIgnoreCase("forum") || args[0].equalsIgnoreCase("member")){
						
						String myString = "";

				        for(int i = 1; i < args.length; i++){
				            String arg = args[i] + " ";
				            myString = myString + arg;
				        }
												
					   Main.plugin.getConfig().set("commands." + args[0], myString);
					   sender.sendMessage("Changed command " + args[0] + " to: " + myString);
					   Main.plugin.saveConfig();
					   Main.plugin.reloadConfig();
					}
			}
		
		
	 	return false;  
	}
	
	
}
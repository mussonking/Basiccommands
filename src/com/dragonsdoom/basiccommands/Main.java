package com.dragonsdoom.basiccommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	public static Main plugin;
	
		public void onEnable(){
			
			plugin = this;
			
			//executors
			getCommand("setmessage").setExecutor(new modifyMessages(this));

			
			
			//transfer JavaPlugin
			new modifyMessages(this);
			
			
		   loadConfiguration();
		   getLogger().info("BasicCommands Plugin enabled!");
		  
		}
		
		private void loadConfiguration() {
		   String donate = "commands.donate";
		   getConfig().addDefault(donate, "&bTo donate, &4follow this link: &6donate.dragonsdoom.net");
		   String website = "commands.website";
		   getConfig().addDefault(website, "&3DragonsDoom website: &6www.dragonsdoom.net");
		   String forum = "commands.forum";
		   getConfig().addDefault(forum, "&2DragonsDoom forum: &6www.dragonsdoom.net/forum/");
		   String member = "commands.member";
		   getConfig().addDefault(member, "&9To become a DragonsDoom &amember, &9follow instruction here: &6bemember.dragonsdoom.net");
		   getConfig().options().copyDefaults(true);
		   saveConfig();
	   }
		
		
		//Default Basic Commands
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		 	  if(sender instanceof Player){
		           Player player = (Player) sender;	 	
			       if(cmd.getName().equalsIgnoreCase("donate")){
			    	   String toBroadcast = ChatColor.translateAlternateColorCodes('&',getConfig().getString("commands.donate"));
			    	   Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[" + player.getName() + "], " + toBroadcast);
			   	 	}
			       if(cmd.getName().equalsIgnoreCase("website")){
			    	   String toBroadcast = ChatColor.translateAlternateColorCodes('&',getConfig().getString("commands.website"));
			    	   Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[" + player.getName() + "], " + toBroadcast);
			   	 	}
			       if(cmd.getName().equalsIgnoreCase("forum")){
			    	   String toBroadcast = ChatColor.translateAlternateColorCodes('&',getConfig().getString("commands.forum"));
			    	   Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[" + player.getName() + "], " + toBroadcast);
			   	 	}
			       if(cmd.getName().equalsIgnoreCase("member")){
			    	   String toBroadcast = ChatColor.translateAlternateColorCodes('&',getConfig().getString("commands.member"));
			    	   Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[" + player.getName() + "], " + toBroadcast);
			   	 	}
			   	}

			   	 	return false;
		   }
}
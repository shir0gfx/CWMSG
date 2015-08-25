package shiro.was.there;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author Shiro
 *
 */

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		if (e.getResult().equals(PlayerLoginEvent.Result.KICK_WHITELIST)) {
			e.setKickMessage("§c§lFakaheda §8- §7Whitelist \n\n§e§oNa servery je whitelist a ty nanho nemas pristup! \n\n§dTeamspeak3 §8» §7ts.fakaheda.eu \n§dWeb §8» §7http://fakeheda.eu");
			return;
		}
	}
}

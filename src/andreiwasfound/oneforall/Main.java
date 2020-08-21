package andreiwasfound.oneforall;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDie(PlayerDeathEvent e) {
        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @a");
    }
}

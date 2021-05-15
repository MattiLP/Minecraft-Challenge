package nosthy.mcplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class MCPlugin extends JavaPlugin implements Listener
{
    @Override
    public void onEnable()
    {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerEat(PlayerItemConsumeEvent event)
    {
        Player player = event.getPlayer();
        PotionEffect effect = PotionEffectType.values()[new Random().nextInt(PotionEffectType.values().length)].createEffect(new Random().nextInt(20 * 60 * 3), new Random().nextInt(40));

        player.addPotionEffect(effect, true);
    }

}

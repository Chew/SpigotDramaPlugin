package pw.chew.spigotdramaplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotDramaPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("spigotdrama").setExecutor(new SpigotDramaCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

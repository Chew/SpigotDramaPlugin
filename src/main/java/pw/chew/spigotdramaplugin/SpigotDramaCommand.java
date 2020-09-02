package pw.chew.spigotdramaplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pro.chew.api.ChewAPI;

public class SpigotDramaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.getScheduler().runTaskAsynchronously(
                Bukkit.getPluginManager().getPlugin("SpigotDrama"),
                () -> sender.sendMessage(new ChewAPI().generateSpigotDrama().getPhrase())
        );
        return true;
    }
}

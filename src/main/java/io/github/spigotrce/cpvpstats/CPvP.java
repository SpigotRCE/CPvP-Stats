package io.github.spigotrce.cpvpstats;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CPvP extends JavaPlugin {
    public static CPvP INSTANCE;
    public static Logger LOGGER;

    @Override
    public void onEnable() {
        INSTANCE = this;
        LOGGER = getLogger();
        LOGGER.info("Booting CPvP Stats...");
        LOGGER.info("--------------------------------");
        LOGGER.info("Written by SpigotRCE");
        LOGGER.info("--------------------------------");
        LOGGER.info("Thanks for using this plugin!");

    }

    @Override
    public void onDisable() {
        LOGGER.info("CPvP Stats has been disabled.");
        LOGGER.info("Good bye!");
        LOGGER.info("We hope to meet you once again!");
        INSTANCE = null;
    }
}

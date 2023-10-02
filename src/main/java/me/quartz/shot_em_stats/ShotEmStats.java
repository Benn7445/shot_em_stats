package me.quartz.shot_em_stats;

import me.quartz.shot_em_stats.localPlayer.LocalPlayerManager;
import me.quartz.shot_em_stats.mysql.MySQLManager;
import me.quartz.shot_em_stats.papi.PlaceholderAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShotEmStats extends JavaPlugin {

    private static ShotEmStats instance;

    private MySQLManager mysqlManager;
    private LocalPlayerManager localPlayerManager;

    public static ShotEmStats getInstance() {
        return instance;
    }

    public MySQLManager getMysqlManager() {
        return mysqlManager;
    }

    public LocalPlayerManager getLocalPlayerManager() {
        return localPlayerManager;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        localPlayerManager = new LocalPlayerManager();
        mysqlManager = new MySQLManager();
        registerPAPI();
    }

    @Override
    public void onDisable() { }

    /*
    Register all the event listeners
     */
    private void registerPAPI() {
        if (this.getServer().getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new PlaceholderAPI().register();
        }
    }
}

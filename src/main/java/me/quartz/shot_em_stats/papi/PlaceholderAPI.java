package me.quartz.shot_em_stats.papi;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.quartz.shot_em_stats.ShotEmStats;
import me.quartz.shot_em_stats.localPlayer.LocalPlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlaceholderAPI extends PlaceholderExpansion {

    @Override
    public @NotNull String getIdentifier() {
        return "Shot Em";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Quartz";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public @Nullable String onPlaceholderRequest(Player player, @NotNull String params) {
        switch (params.toLowerCase()) {
            case "points": {
                LocalPlayer localPlayer = ShotEmStats.getInstance().getLocalPlayerManager().getLocalPlayer(player);
                return localPlayer.getPoints() + "";
            }
            case "high_score": {
                LocalPlayer localPlayer = ShotEmStats.getInstance().getLocalPlayerManager().getLocalPlayer(player);
                return localPlayer.getHighScore() + "";
            }
            case "time_played": {
                LocalPlayer localPlayer = ShotEmStats.getInstance().getLocalPlayerManager().getLocalPlayer(player);
                return localPlayer.getTimePlayed() + "";
            }
            default: {
                return null;
            }
        }
    }
}

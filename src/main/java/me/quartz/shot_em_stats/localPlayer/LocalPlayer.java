package me.quartz.shot_em_stats.localPlayer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class LocalPlayer {

    private final UUID uuid;
    private int points;
    private int highScore;
    private int timePlayed;

    public LocalPlayer(UUID uuid) {
        this.uuid = uuid;
        this.points = 0;
        this.highScore = 0;
        this.timePlayed = 0;
    }

    public LocalPlayer(UUID uuid, int points, int highScore, int timePlayed) {
        this.uuid = uuid;
        this.points = points;
        this.highScore = highScore;
        this.timePlayed = timePlayed;
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void removePoints() {
        this.points -= 25;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void addTimePlayed(int timePlayed) {
        this.timePlayed += timePlayed;
    }
}

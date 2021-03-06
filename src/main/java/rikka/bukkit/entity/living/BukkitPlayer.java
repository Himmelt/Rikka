package rikka.bukkit.entity.living;

import org.bukkit.entity.Player;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.IPlayer;
import rikka.api.entity.living.player.CooldownTracker;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IContainer;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.profile.GameProfile;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.util.math.Vector3d;
import rikka.api.util.type.HandType;
import rikka.api.world.IWorldBorder;
import rikka.bukkit.scoreboard.BukkitScoreboard;
import rikka.bukkit.world.BukkitWorldBorder;

import javax.annotation.Nullable;
import java.util.UUID;

import static org.bukkit.GameMode.*;

public final class BukkitPlayer extends BukkitLiving<Player> implements IPlayer {

    public BukkitPlayer(Player source) {
        super(source);
    }

    public IContainer getOpenInventory() {
        return null;
    }

    public IContainer openInventory(IInventory inventory) {
        return null;
    }

    public boolean closeInventory() {
        return false;
    }

    public boolean isChatColorsEnabled() {
        return false;
    }

    public TabList getTabList() {
        return null;
    }

    public void kick() {
        source.kickPlayer("");
    }

    public void kick(String reason) {
        source.kickPlayer(reason);
    }

    public IScoreboard getScoreboard() {
        return new BukkitScoreboard(source.getScoreboard());
    }

    public void setScoreboard(IScoreboard scoreboard) {
        if (scoreboard instanceof BukkitScoreboard) {
            source.setScoreboard(((BukkitScoreboard) scoreboard).getSource());
        }
    }

    public long firstPlayed() {
        return source.getFirstPlayed();
    }

    public long lastPlayed() {
        return source.getLastPlayed();
    }

    public String getDisplayName() {
        return source.getDisplayName();
    }

    public GameMode gameMode() {
        org.bukkit.GameMode mode = source.getGameMode();
        if (mode == SURVIVAL) return GameMode.SURVIVAL;
        if (mode == CREATIVE) return GameMode.CREATIVE;
        if (mode == ADVENTURE) return GameMode.ADVENTURE;
        if (mode == SPECTATOR) return GameMode.SPECTATOR;
        return GameMode.SURVIVAL;
    }

    public boolean isSleepingIgnored() {
        return source.isSleepingIgnored();
    }

    public void setSleepingIgnored(boolean ignored) {
        source.setSleepingIgnored(ignored);
    }

    public IInventory getEnderChestInventory() {
        return null;
    }

    public void respawn() {
        source.spigot().respawn();
    }

    public IEntity getSpectatorTarget() {
        return null;
    }

    public void setSpectatorTarget(@Nullable IEntity entity) {

    }

    public IWorldBorder getWorldBorder() {
        return new BukkitWorldBorder(source.getWorld().getWorldBorder());
    }

    public void setWorldBorder(@Nullable IWorldBorder border, Cause cause) {

    }

    public CooldownTracker getCooldownTracker() {
        return null;
    }

    public GameProfile getProfile() {
        return null;
    }

    public String getName() {
        return source.getName();
    }

    public boolean isOnline() {
        return source.isOnline();
    }

    public IPlayer getPlayer() {
        return this;
    }

    public Vector3d getPosition() {
        // TODO
        return new Vector3d(0, 0, 0);
    }

    public boolean setLocation(Vector3d position, UUID world) {
        // TODO
        return false;
    }

    public IItemStack getItemInHand(HandType handType) {
        return null;
    }

    public void setItemInHand(HandType hand, @Nullable IItemStack itemInHand) {

    }

    public boolean canEquip(EquipmentType type) {
        return false;
    }

    public boolean canEquip(EquipmentType type, @Nullable IItemStack equipment) {
        return false;
    }

    public IItemStack getEquipped(EquipmentType type) {
        return null;
    }

    public boolean equip(EquipmentType type, @Nullable IItemStack equipment) {
        return false;
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }

    public boolean hasPermission(String perm) {
        if (perm == null) return true;
        return source.hasPermission(perm);
    }

    public void sendMsg(String msg) {
        source.sendMessage(msg);
    }

}

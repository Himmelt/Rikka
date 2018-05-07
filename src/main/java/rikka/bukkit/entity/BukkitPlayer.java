package rikka.bukkit.entity;

import org.bukkit.entity.Player;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.message.MessageChannelEvent;
import rikka.api.data.type.HandType;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.CooldownTracker;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.ICarrier;
import rikka.api.item.inventory.IContainer;
import rikka.api.item.inventory.IInventory;
import rikka.api.item.inventory.IItemStack;
import rikka.api.item.inventory.equipment.EquipmentType;
import rikka.api.item.inventory.type.CarriedInventory;
import rikka.api.profile.GameProfile;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.api.text.chat.ChatType;
import rikka.api.text.chat.ChatVisibility;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorldBorder;
import rikka.api.world.Location;
import rikka.bukkit.scoreboard.BukkitScoreboard;
import rikka.bukkit.world.BukkitWorldBorder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

import static org.bukkit.GameMode.*;

public class BukkitPlayer extends BukkitLiving<Player> implements IPlayer {

    public BukkitPlayer(Player source) {
        super(source);
    }

    @Nullable
    public IContainer getOpenInventory() {
        return null;
    }

    @Nullable
    public IContainer openInventory(IInventory inventory) throws IllegalArgumentException {
        return null;
    }

    public boolean closeInventory() throws IllegalArgumentException {
        return false;
    }

    public ChatVisibility getChatVisibility() {
        return null;
    }

    public boolean isChatColorsEnabled() {
        return false;
    }

    public MessageChannelEvent.Chat simulateChat(Text message, Cause cause) {
        return null;
    }

    public TabList getTabList() {
        return null;
    }

    public void kick() {
        source.kickPlayer("");
    }

    public void kick(Text reason) {
        source.kickPlayer(reason.toPlain());
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
        return source.getEnderChest();
    }

    public void respawn() {
        source.spigot().respawn();
    }

    public Optional<IEntity> getSpectatorTarget() {
        return Optional.empty();
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

    public boolean setLocationSafely(Location location) {
        return false;
    }

    public GameProfile getProfile() {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean isOnline() {
        return false;
    }

    public IPlayer getPlayer() {
        return null;
    }

    public Vector3d getPosition() {
        return null;
    }

    public Optional<UUID> getWorldUniqueId() {
        return Optional.empty();
    }

    public boolean setLocation(Vector3d position, UUID world) {
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

    public Text getTeamRepresentation() {
        return null;
    }

    public boolean hasPermission(@Nonnull String permission) {
        return source.hasPermission(permission);
    }

    public void sendMessage(Text message) {

    }

    public MessageChannel getMessageChannel() {
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {

    }

    public void sendMessage(ChatType type, Text message) {

    }

}

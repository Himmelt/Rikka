package rikka.sponge.entity;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.gamemode.GameModes;
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
import rikka.sponge.world.SpongeWorldBorder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

public class SpongePlayer extends SpongeLiving<Player> implements IPlayer {
    public SpongePlayer(Player source) {
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
        source.kick();
    }

    public void kick(Text reason) {
        // TODO
        source.kick(org.spongepowered.api.text.Text.of(reason.toPlain()));
    }

    public IScoreboard getScoreboard() {
        return null;
    }

    public void setScoreboard(IScoreboard scoreboard) {

    }

    public long firstPlayed() {
        return source.firstPlayed().get().toEpochMilli();
    }

    public long lastPlayed() {
        return source.lastPlayed().get().toEpochMilli();
    }

    public String getDisplayName() {
        // TODO
        return source.getDisplayNameData().displayName().get().toPlain();
    }

    public GameMode gameMode() {
        org.spongepowered.api.entity.living.player.gamemode.GameMode mode = source.gameMode().get();
        if (mode == GameModes.SURVIVAL) return GameMode.SURVIVAL;
        if (mode == GameModes.CREATIVE) return GameMode.CREATIVE;
        if (mode == GameModes.ADVENTURE) return GameMode.ADVENTURE;
        if (mode == GameModes.SPECTATOR) return GameMode.SPECTATOR;
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
        source.respawnPlayer();
    }

    public Optional<IEntity> getSpectatorTarget() {
        return Optional.empty();
    }

    public void setSpectatorTarget(@Nullable IEntity entity) {

    }

    public IWorldBorder getWorldBorder() {
        if (source.getWorldBorder().isPresent()) {
            return new SpongeWorldBorder(source.getWorldBorder().get());
        } else return null;
    }

    public void setWorldBorder(@Nullable IWorldBorder border, Cause cause) {

    }

    public CooldownTracker getCooldownTracker() {
        return null;
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

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }

    public boolean hasPermission(@Nonnull String permission) {
        return false;
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

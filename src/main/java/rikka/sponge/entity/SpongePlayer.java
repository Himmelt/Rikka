package rikka.sponge.entity;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.gamemode.GameModes;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.cause.EventContext;
import org.spongepowered.api.item.inventory.Container;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.WorldBorder;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.CooldownTracker;
import rikka.api.entity.living.player.IPlayer;
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
import rikka.sponge.entity.living.SpongeLiving;
import rikka.sponge.item.inventory.SpongeContainer;
import rikka.sponge.item.inventory.SpongeInventory;
import rikka.sponge.scoreboard.SpongeScoreboard;
import rikka.sponge.world.SpongeWorld;
import rikka.sponge.world.SpongeWorldBorder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

public final class SpongePlayer extends SpongeLiving<Player> implements IPlayer {

    public SpongePlayer(Player source) {
        super(source);
    }

    public IContainer getOpenInventory() {
        Container container = source.getOpenInventory().orElse(null);
        return container == null ? null : new SpongeContainer(container);
    }

    public IContainer openInventory(IInventory inv) {
        if (inv instanceof SpongeInventory) {
            Container container = null;
            try {
                container = source.openInventory(((SpongeInventory) inv).getSource()).orElse(null);
            } catch (Throwable ignored) {
            }
            return container == null ? null : new SpongeContainer(container);
        }
        return null;
    }

    public boolean closeInventory() {
        try {
            return source.closeInventory();
        } catch (Throwable ignored) {
        }
        return false;
    }

    public boolean isChatColorsEnabled() {
        return source.isChatColorsEnabled();
    }

    public TabList getTabList() {
        return null;
    }

    public void kick() {
        source.kick();
    }

    public void kick(String reason) {
        // TODO
        source.kick(org.spongepowered.api.text.Text.of(reason));
    }

    public IScoreboard getScoreboard() {
        return new SpongeScoreboard(source.getScoreboard());
    }

    public void setScoreboard(IScoreboard scoreboard) {
        if (scoreboard instanceof SpongeScoreboard) {
            source.setScoreboard(((SpongeScoreboard) scoreboard).getSource());
        }
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
        // TODO EndChest Inventory
        return new SpongeInventory<>(source.getEnderChestInventory());
    }

    public void respawn() {
        source.respawnPlayer();
    }

    public IEntity getSpectatorTarget() {
        return getEntity(source.getSpectatorTarget().orElse(null));
    }

    public void setSpectatorTarget(IEntity entity) {
        if (entity instanceof SpongeEntity) {
            source.setSpectatorTarget(((SpongeEntity) entity).getSource());
        }
    }

    public IWorldBorder getWorldBorder() {
        WorldBorder border = source.getWorldBorder().orElse(null);
        return border == null ? null : new SpongeWorldBorder(border);
    }

    public void setWorldBorder(IWorldBorder border, Cause cause) {
        if (border instanceof SpongeWorldBorder) {
            source.setWorldBorder(((SpongeWorldBorder) border).getSource(), Cause.of(EventContext.empty(), "TODO"));
        }
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
        return source.isOnline();
    }

    public IPlayer getPlayer() {
        return this;
    }

    public Vector3d getPosition() {
        return new Vector3d(source.getPosition());
    }

    public boolean setLocation(Vector3d pos, UUID worldId) {
        SpongeWorld world = getWorld(worldId);
        if (world != null) {
            return source.setLocation(new Location<>(world.getSource(), new com.flowpowered.math.vector.Vector3d(pos.x, pos.y, pos.z)));
        }
        return false;
    }

    public CarriedInventory<? extends ICarrier> getInventory() {
        return null;
    }

    public boolean hasPermission(@Nonnull String permission) {
        return source.hasPermission(permission);
    }

    public void sendMessage(String message) {
        source.sendMessage(org.spongepowered.api.text.Text.of(message));
    }

    public void sendMessage(Text message) {

    }

    public MessageChannel getMessageChannel() {
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {

    }
}

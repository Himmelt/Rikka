package org.soraworld.rikka.world;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3i;
import org.soraworld.rikka.Sponge;
import org.soraworld.rikka.effect.Viewer;
import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.entity.living.player.Player;
import org.soraworld.rikka.service.context.ContextSource;
import org.soraworld.rikka.text.channel.ChatTypeMessageReceiver;
import org.soraworld.rikka.text.channel.MessageReceiver;
import org.soraworld.rikka.world.difficulty.Difficulty;
import org.soraworld.rikka.world.explosion.Explosion;
import org.soraworld.rikka.world.extent.Extent;
import org.soraworld.rikka.world.extent.worker.MutableBiomeVolumeWorker;
import org.soraworld.rikka.world.extent.worker.MutableBlockVolumeWorker;
import org.soraworld.rikka.world.gen.WorldGenerator;
import org.soraworld.rikka.world.storage.WorldProperties;
import org.soraworld.rikka.world.storage.WorldStorage;
import org.soraworld.rikka.world.weather.WeatherUniverse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface World extends Extent, WeatherUniverse, Viewer, ContextSource, MessageReceiver, ChatTypeMessageReceiver {

    Collection<Player> getPlayers();

    @Override
    default Location<World> getLocation(Vector3i position) {
        return new Location<>(this, position);
    }

    @Override
    default Location<World> getLocation(int x, int y, int z) {
        return getLocation(new Vector3i(x, y, z));
    }

    @Override
    default Location<World> getLocation(Vector3d position) {
        return new Location<>(this, position);
    }

    @Override
    default Location<World> getLocation(double x, double y, double z) {
        return getLocation(new Vector3d(x, y, z));
    }

    default LocatableBlock getLocatableBlock(Vector3i position) {
        return LocatableBlock.builder().world(this).position(position).build();
    }

    default LocatableBlock getLocatableBlock(int x, int y, int z) {
        return LocatableBlock.builder().world(this).position(x, y, z).build();
    }

    default Optional<Chunk> getChunkAtBlock(Vector3i blockPosition) {
        return getChunkAtBlock(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
    }

    default Optional<Chunk> getChunkAtBlock(int bx, int by, int bz) {
        return getChunk(Sponge.getServer().getChunkLayout().forceToChunk(bx, by, bz));
    }

    default Optional<Chunk> getChunk(Vector3i chunkPosition) {
        return getChunk(chunkPosition.getX(), chunkPosition.getY(), chunkPosition.getZ());
    }

    Optional<Chunk> getChunk(int cx, int cy, int cz);

    default Optional<Chunk> loadChunk(Vector3i chunkPosition, boolean shouldGenerate) {
        return this.loadChunk(chunkPosition.getX(), chunkPosition.getY(), chunkPosition.getZ(), shouldGenerate);
    }

    Optional<Chunk> loadChunk(int cx, int cy, int cz, boolean shouldGenerate);

    default CompletableFuture<Optional<Chunk>> loadChunkAsync(Vector3i chunkPosition, boolean shouldGenerate) {
        return loadChunkAsync(chunkPosition.getX(), chunkPosition.getY(), chunkPosition.getZ(), shouldGenerate);
    }

    default CompletableFuture<Optional<Chunk>> loadChunkAsync(int cx, int cy, int cz, boolean shouldGenerate) {
        return CompletableFuture.completedFuture(loadChunk(cx, cy, cz, shouldGenerate));
    }

    boolean unloadChunk(Chunk chunk);

    Iterable<Chunk> getLoadedChunks();

    @Override
    Optional<Entity> getEntity(UUID uuid);

    WorldBorder getWorldBorder();

    ChunkPreGenerate.Builder newChunkPreGenerate(Vector3d center, double diameter);

    Dimension getDimension();

    WorldGenerator getWorldGenerator();

    WorldProperties getProperties();

    Path getDirectory();

    @Override
    default UUID getUniqueId() {
        return getProperties().getUniqueId();
    }

    default String getName() {
        return getProperties().getWorldName();
    }

    default Difficulty getDifficulty() {
        return getProperties().getDifficulty();
    }

    default Optional<String> getGameRule(String gameRule) {
        return getProperties().getGameRule(gameRule);
    }

    default Map<String, String> getGameRules() {
        return getProperties().getGameRules();
    }

    default boolean doesKeepSpawnLoaded() {
        return getProperties().doesKeepSpawnLoaded();
    }

    default void setKeepSpawnLoaded(boolean keepLoaded) {
        getProperties().setKeepSpawnLoaded(keepLoaded);
    }

    default Location<World> getSpawnLocation() {
        return new Location<>(this, getProperties().getSpawnPosition());
    }

    default SerializationBehavior getSerializationBehavior() {
        return getProperties().getSerializationBehavior();
    }

    default void setSerializationBehavior(SerializationBehavior behavior) {
        getProperties().setSerializationBehavior(behavior);
    }

    WorldStorage getWorldStorage();

    void triggerExplosion(Explosion explosion);

    PortalAgent getPortalAgent();

    int getSeaLevel();

    @Override
    MutableBiomeVolumeWorker<World> getBiomeWorker();

    @Override
    MutableBlockVolumeWorker<World> getBlockWorker();

    boolean save() throws IOException;

    int getViewDistance();

    void setViewDistance(int viewDistance);

    void resetViewDistance();
}

package rikka.api.world;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3i;
import rikka.api.effect.Viewer;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.service.context.ContextSource;
import rikka.api.text.channel.ChatTypeMessageReceiver;
import rikka.api.text.channel.MessageReceiver;
import rikka.api.world.difficulty.Difficulty;
import rikka.api.world.explosion.Explosion;
import rikka.api.world.extent.Extent;
import rikka.api.world.extent.worker.MutableBiomeVolumeWorker;
import rikka.api.world.extent.worker.MutableBlockVolumeWorker;
import rikka.api.world.gen.WorldGenerator;
import rikka.api.world.storage.WorldProperties;
import rikka.api.world.storage.WorldStorage;
import rikka.api.world.weather.WeatherUniverse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface World extends Extent, WeatherUniverse, Viewer, ContextSource, MessageReceiver, ChatTypeMessageReceiver {

    Collection<IPlayer> getPlayers();

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
    Optional<IEntity> getEntity(UUID uuid);

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

package rikka.api.world;

import org.spongepowered.api.world.GeneratorType;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;
import rikka.api.world.difficulty.Difficulty;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface WorldProperties {

    boolean isInitialized();

    String getWorldName();

    UUID getUniqueId();

    boolean isEnabled();

    void setEnabled(boolean state);

    boolean loadOnStartup();

    void setLoadOnStartup(boolean state);

    boolean doesKeepSpawnLoaded();

    void setKeepSpawnLoaded(boolean state);

    boolean doesGenerateSpawnOnLoad();

    void setGenerateSpawnOnLoad(boolean state);

    Vector3i getSpawnPosition();

    void setSpawnPosition(Vector3i position);

    GeneratorType getGeneratorType();

    void setGeneratorType(GeneratorType type);

    long getSeed();

    void setSeed(long seed);

    long getTotalTime();

    long getWorldTime();

    void setWorldTime(long time);

    DimensionType getDimensionType();

    boolean isPVPEnabled();

    void setPVPEnabled(boolean enabled);

    boolean isRaining();

    void setRaining(boolean state);

    int getRainTime();

    void setRainTime(int time);

    boolean isThundering();

    void setThundering(boolean state);

    int getThunderTime();

    void setThunderTime(int time);

    GameMode getGameMode();

    void setGameMode(GameMode gamemode);

    boolean usesMapFeatures();

    void setMapFeaturesEnabled(boolean state);

    boolean isHardcore();

    void setHardcore(boolean state);

    boolean areCommandsAllowed();

    void setCommandsAllowed(boolean state);

    Difficulty getDifficulty();

    void setDifficulty(Difficulty difficulty);

    boolean doesGenerateBonusChest();

    Vector3d getWorldBorderCenter();

    void setWorldBorderCenter(double x, double z);

    double getWorldBorderDiameter();

    void setWorldBorderDiameter(double diameter);

    long getWorldBorderTimeRemaining();

    void setWorldBorderTimeRemaining(long time);

    double getWorldBorderTargetDiameter();

    void setWorldBorderTargetDiameter(double diameter);

    double getWorldBorderDamageThreshold();

    void setWorldBorderDamageThreshold(double distance);

    double getWorldBorderDamageAmount();

    void setWorldBorderDamageAmount(double damage);

    int getWorldBorderWarningTime();

    void setWorldBorderWarningTime(int time);

    int getWorldBorderWarningDistance();

    void setWorldBorderWarningDistance(int distance);

    Optional<String> getGameRule(String gameRule);

    Map<String, String> getGameRules();

    void setGameRule(String gameRule, String value);

    boolean removeGameRule(String gameRule);

}

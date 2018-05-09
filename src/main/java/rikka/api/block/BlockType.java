package rikka.api.block;

import org.bukkit.Material;
import org.spongepowered.api.block.BlockTypes;
import rikka.api.text.translation.RTranslatable;
import rikka.api.text.translation.Translation;

import java.util.HashMap;

public enum BlockType implements RTranslatable {

    AIR("air", Material.AIR, BlockTypes.AIR),
    STONE("stone", Material.STONE, BlockTypes.STONE),
    UNKNOWN;

    public final String nameId;
    public final org.bukkit.Material bukkitType;
    public final org.spongepowered.api.block.BlockType spongeType;

    private static final HashMap<String, BlockType> nameIdMap = new HashMap<>();
    private static final HashMap<org.bukkit.Material, BlockType> bukkitTypeMap = new HashMap<>();
    private static final HashMap<org.spongepowered.api.block.BlockType, BlockType> spongeTypeMap = new HashMap<>();

    static {
        nameIdMap.clear();
        bukkitTypeMap.clear();
        spongeTypeMap.clear();
        for (BlockType type : values()) {
            bukkitTypeMap.put(type.bukkitType, type);
            spongeTypeMap.put(type.spongeType, type);
            if (type.nameId != null && !type.nameId.isEmpty()) {
                if (nameIdMap.containsKey(type.nameId)) {
                    throw new RuntimeException("Multi Map of BlockType nameId: " + type.nameId);
                }
                nameIdMap.put(type.nameId, type);
            }
        }
    }

    BlockType(String nameId, org.bukkit.Material bukkitType, org.spongepowered.api.block.BlockType spongeType) {
        this.nameId = nameId;
        this.bukkitType = bukkitType;
        this.spongeType = spongeType;
    }

    public static BlockType getType(org.bukkit.Material type) {
        return bukkitTypeMap.getOrDefault(type, UNKNOWN);
    }

    public static BlockType getType(org.spongepowered.api.block.BlockType type) {
        return spongeTypeMap.getOrDefault(type, UNKNOWN);
    }

    public Translation getTranslation() {
        return null;
    }
}

package rikka.api.block;

import org.bukkit.Material;
import org.spongepowered.api.block.BlockTypes;
import rikka.api.text.translation.RTranslatable;
import rikka.api.text.translation.Translation;

import java.util.HashMap;

public enum BlockType implements RTranslatable {

    AIR(0, "air", Material.AIR, BlockTypes.AIR),
    STONE(1, "stone", Material.STONE, BlockTypes.STONE),
    GRASS(2, "grass", Material.GRASS, BlockTypes.GRASS),
    DIRT(3, "dirt", Material.DIRT, BlockTypes.DIRT),
    COBBLESTONE(4, "cobblestone", Material.COBBLESTONE, BlockTypes.COBBLESTONE),
    PLANKS(5, "planks", Material.WOOD, BlockTypes.PLANKS),
    SAPLING(6, "sapling", Material.SAPLING, BlockTypes.SAPLING),
    BEDROCK(7, "bedrock", Material.BEDROCK, BlockTypes.BEDROCK),
    FLOWING_WATER(8, "flowing_water", Material.WATER, BlockTypes.FLOWING_WATER),
    WATER(9, "water", Material.STATIONARY_WATER, BlockTypes.WATER),
    FLOWING_LAVA(10, "flowing_lava", Material.LAVA, BlockTypes.FLOWING_LAVA),
    LAVA(11, "lava", Material.STATIONARY_LAVA, BlockTypes.LAVA),
    SAND(12, "sand", Material.SAND, BlockTypes.SAND),
    GRAVEL(13, "gravel", Material.GRAVEL, BlockTypes.GRAVEL),
    GOLD_ORE(14, "gold_ore", Material.GOLD_ORE, BlockTypes.GOLD_ORE),
    IRON_ORE(15, "iron_ore", Material.IRON_ORE, BlockTypes.IRON_ORE),
    COAL_ORE(16, "coal_ore", Material.COAL_ORE, BlockTypes.COAL_ORE),
    LOG(17, "log", Material.LOG, BlockTypes.LOG),
    LEAVES(18, "leaves", Material.LEAVES, BlockTypes.LEAVES),
    SPONGE(19, "sponge", Material.SPONGE, BlockTypes.SPONGE),
    GLASS(20, "glass", Material.GLASS, BlockTypes.GLASS),
    LAPIS_ORE(21, "lapis_ore", Material.LAPIS_ORE, BlockTypes.LAPIS_ORE),
    LAPIS_BLOCK(22, "lapis_block", Material.LAPIS_BLOCK, BlockTypes.LAPIS_BLOCK),
    DISPENSER(23, "dispenser", Material.DISPENSER, BlockTypes.DISPENSER),
    SANDSTONE(24, "sandstone", Material.SANDSTONE, BlockTypes.SANDSTONE),
    NOTEBLOCK(25, "noteblock", Material.NOTE_BLOCK, BlockTypes.NOTEBLOCK),
    BED(26, "bed", Material.BED, BlockTypes.BED),
    GOLDEN_RAIL(27, "golden_rail", Material.POWERED_RAIL, BlockTypes.GOLDEN_RAIL),
    DETECTOR_RAIL(28, "detector_rail", Material.DETECTOR_RAIL, BlockTypes.DETECTOR_RAIL),
    STICKY_PISTON(29, "sticky_piston", Material.PISTON_STICKY_BASE, BlockTypes.STICKY_PISTON),
    WEB(30, "web", Material.WEB, BlockTypes.WEB),
    TALLGRASS(31, "tallgrass", Material.LONG_GRASS, BlockTypes.TALLGRASS),
    DEADBUSH(32, "deadbush", Material.DEAD_BUSH, BlockTypes.DEADBUSH),
    PISTON(33, "piston", Material.PISTON_BASE, BlockTypes.PISTON),
    PISTON_HEAD(34, "piston_head", Material.PISTON_EXTENSION, BlockTypes.PISTON_HEAD),
    WOOL(35, "wool", Material.WOOL, BlockTypes.WOOL),
    PISTON_EXTENSION(36, "piston_extension", Material.PISTON_EXTENSION, BlockTypes.PISTON_EXTENSION),
    YELLOW_FLOWER(37, "yellow_flower", Material.YELLOW_FLOWER, BlockTypes.YELLOW_FLOWER),
    RED_FLOWER(38, "red_flower", Material.RED_ROSE, BlockTypes.RED_FLOWER),
    BROWN_MUSHROOM(39, "brown_mushroom", Material.BROWN_MUSHROOM, BlockTypes.BROWN_MUSHROOM),
    RED_MUSHROOM(40, "red_mushroom", Material.RED_MUSHROOM, BlockTypes.RED_MUSHROOM),
    GOLD_BLOCK(41, "gold_block", Material.GOLD_BLOCK, BlockTypes.GOLD_BLOCK),
    IRON_BLOCK(42, "iron_block", Material.IRON_BLOCK, BlockTypes.IRON_BLOCK),
    DOUBLE_STONE_SLAB(43, "double_stone_slab", Material.DOUBLE_STEP, BlockTypes.DOUBLE_STONE_SLAB),
    STONE_SLAB(44, "stone_slab", Material.STEP, BlockTypes.STONE_SLAB),
    BRICK_BLOCK(45, "brick_block", Material.BRICK, BlockTypes.BRICK_BLOCK),
    TNT(46, "tnt", Material.TNT, BlockTypes.TNT),
    BOOKSHELF(47, "bookshelf", Material.BOOKSHELF, BlockTypes.BOOKSHELF),
    MOSSY_COBBLESTONE(48, "mossy_cobblestone", Material.MOSSY_COBBLESTONE, BlockTypes.MOSSY_COBBLESTONE),
    OBSIDIAN(49, "obsidian", Material.OBSIDIAN, BlockTypes.OBSIDIAN),
    TORCH(50, "torch", Material.TORCH, BlockTypes.TORCH),
    FIRE(51, "fire", Material.FIRE, BlockTypes.FIRE),
    MOB_SPAWNER(52, "mob_spawner", Material.MOB_SPAWNER, BlockTypes.MOB_SPAWNER),
    OAK_STAIRS(53, "oak_stairs", Material.WOOD_STAIRS, BlockTypes.OAK_STAIRS),
    CHEST(54, "chest", Material.CHEST, BlockTypes.CHEST),
    REDSTONE_WIRE(55, "redstone_wire", Material.REDSTONE_WIRE, BlockTypes.REDSTONE_WIRE),
    DIAMOND_ORE(56, "diamond_ore", Material.DIAMOND_ORE, BlockTypes.DIAMOND_ORE),
    DIAMOND_BLOCK(57, "diamond_block", Material.DIAMOND_BLOCK, BlockTypes.DIAMOND_BLOCK),
    CRAFTING_TABLE(58, "crafting_table", Material.WORKBENCH, BlockTypes.CRAFTING_TABLE),
    WHEAT(59, "wheat", Material.WHEAT, BlockTypes.WHEAT),
    FARMLAND(60, "farmland", Material.SOIL, BlockTypes.FARMLAND),
    FURNACE(61, "furnace", Material.FURNACE, BlockTypes.FURNACE),
    LIT_FURNACE(62, "lit_furnace", Material.BURNING_FURNACE, BlockTypes.LIT_FURNACE),
    STANDING_SIGN(63, "standing_sign", Material.SIGN_POST, BlockTypes.STANDING_SIGN),
    WOODEN_DOOR(64, "wooden_door", Material.WOODEN_DOOR, BlockTypes.WOODEN_DOOR),
    LADDER(65, "ladder", Material.LADDER, BlockTypes.LADDER),
    RAIL(66, "rail", Material.RAILS, BlockTypes.RAIL),
    STONE_STAIRS(67, "stone_stairs", Material.COBBLESTONE_STAIRS, BlockTypes.STONE_STAIRS),
    WALL_SIGN(68, "wall_sign", Material.WALL_SIGN, BlockTypes.WALL_SIGN),
    LEVER(69, "lever", Material.LEVER, BlockTypes.LEVER),
    STONE_PRESSURE_PLATE(70, "stone_pressure_plate", Material.STONE_PLATE, BlockTypes.STONE_PRESSURE_PLATE),
    IRON_DOOR(71, "iron_door", Material.IRON_DOOR, BlockTypes.IRON_DOOR),
    WOODEN_PRESSURE_PLATE(72, "wooden_pressure_plate", Material.WOOD_PLATE, BlockTypes.WOODEN_PRESSURE_PLATE),
    REDSTONE_ORE(73, "redstone_ore", Material.REDSTONE_ORE, BlockTypes.REDSTONE_ORE),
    LIT_REDSTONE_ORE(74, "lit_redstone_ore", Material.GLOWING_REDSTONE_ORE, BlockTypes.LIT_REDSTONE_ORE),
    UNLIT_REDSTONE_TORCH(75, "unlit_redstone_torch", Material.REDSTONE_TORCH_OFF, BlockTypes.UNLIT_REDSTONE_TORCH),
    REDSTONE_TORCH(76, "redstone_torch", Material.REDSTONE_TORCH_ON, BlockTypes.REDSTONE_TORCH),
    STONE_BUTTON(77, "stone_button", Material.STONE_BUTTON, BlockTypes.STONE_BUTTON),
    SNOW_LAYER(78, "snow_layer", Material.SNOW, BlockTypes.SNOW_LAYER),
    ICE(79, "ice", Material.ICE, BlockTypes.ICE),
    SNOW(80, "snow", Material.SNOW_BLOCK, BlockTypes.SNOW),
    CACTUS(81, "cactus", Material.CACTUS, BlockTypes.CACTUS),
    CLAY(82, "clay", Material.CLAY, BlockTypes.CLAY),
    REEDS(83, "reeds", Material.SUGAR_CANE_BLOCK, BlockTypes.REEDS),
    JUKEBOX(84, "jukebox", Material.JUKEBOX, BlockTypes.JUKEBOX),
    FENCE(85, "fence", Material.FENCE, BlockTypes.FENCE),
    PUMPKIN(86, "pumpkin", Material.PUMPKIN, BlockTypes.PUMPKIN),
    NETHERRACK(87, "netherrack", Material.NETHERRACK, BlockTypes.NETHERRACK),
    SOUL_SAND(88, "soul_sand", Material.SOUL_SAND, BlockTypes.SOUL_SAND),
    GLOWSTONE(89, "glowstone", Material.GLOWSTONE, BlockTypes.GLOWSTONE),
    PORTAL(90, "portal", Material.PORTAL, BlockTypes.PORTAL),
    LIT_PUMPKIN(91, "lit_pumpkin", Material.JACK_O_LANTERN, BlockTypes.LIT_PUMPKIN),
    CAKE(92, "cake", Material.CAKE, BlockTypes.CAKE),
    UNPOWERED_REPEATER(93, "unpowered_repeater", Material.DIODE_BLOCK_OFF, BlockTypes.UNPOWERED_REPEATER),
    POWERED_REPEATER(94, "powered_repeater", Material.DIODE_BLOCK_ON, BlockTypes.POWERED_REPEATER),
    STAINED_GLASS(95, "stained_glass", Material.STAINED_GLASS, BlockTypes.STAINED_GLASS),
    TRAPDOOR(96, "trapdoor", Material.TRAP_DOOR, BlockTypes.TRAPDOOR),
    MONSTER_EGG(97, "monster_egg", Material.MONSTER_EGG, BlockTypes.MONSTER_EGG),
    STONEBRICK(98, "stonebrick", Material.SMOOTH_BRICK, BlockTypes.STONEBRICK),
    BROWN_MUSHROOM_BLOCK(99, "brown_mushroom_block", Material.HUGE_MUSHROOM_1, BlockTypes.BROWN_MUSHROOM_BLOCK),
    RED_MUSHROOM_BLOCK(100, "red_mushroom_block", Material.HUGE_MUSHROOM_2, BlockTypes.RED_MUSHROOM_BLOCK),
    IRON_BARS(101, "iron_bars", Material.IRON_FENCE, BlockTypes.IRON_BARS),
    GLASS_PANE(102, "glass_pane", Material.THIN_GLASS, BlockTypes.GLASS_PANE),
    MELON_BLOCK(103, "melon_block", Material.MELON_BLOCK, BlockTypes.MELON_BLOCK),
    PUMPKIN_STEM(104, "pumpkin_stem", Material.PUMPKIN_STEM, BlockTypes.PUMPKIN_STEM),
    MELON_STEM(105, "melon_stem", Material.MELON_STEM, BlockTypes.MELON_STEM),
    VINE(106, "vine", Material.VINE, BlockTypes.VINE),
    FENCE_GATE(107, "fence_gate", Material.FENCE_GATE, BlockTypes.FENCE_GATE),
    BRICK_STAIRS(108, "brick_stairs", Material.BRICK_STAIRS, BlockTypes.BRICK_STAIRS),
    STONE_BRICK_STAIRS(109, "stone_brick_stairs", Material.SMOOTH_STAIRS, BlockTypes.STONE_BRICK_STAIRS),
    MYCELIUM(110, "mycelium", Material.MYCEL, BlockTypes.MYCELIUM),
    WATERLILY(111, "waterlily", Material.WATER_LILY, BlockTypes.WATERLILY),
    NETHER_BRICK(112, "nether_brick", Material.NETHER_BRICK, BlockTypes.NETHER_BRICK),
    NETHER_BRICK_FENCE(113, "nether_brick_fence", Material.NETHER_FENCE, BlockTypes.NETHER_BRICK_FENCE),
    NETHER_BRICK_STAIRS(114, "nether_brick_stairs", Material.NETHER_BRICK_STAIRS, BlockTypes.NETHER_BRICK_STAIRS),
    NETHER_WART(115, "nether_wart", Material.NETHER_WARTS, BlockTypes.NETHER_WART),
    ENCHANTING_TABLE(116, "enchanting_table", Material.ENCHANTMENT_TABLE, BlockTypes.ENCHANTING_TABLE),
    BREWING_STAND(117, "brewing_stand", Material.BREWING_STAND, BlockTypes.BREWING_STAND),
    CAULDRON(118, "cauldron", Material.CAULDRON, BlockTypes.CAULDRON),
    END_PORTAL(119, "end_portal", Material.ENDER_PORTAL, BlockTypes.END_PORTAL),
    END_PORTAL_FRAME(120, "end_portal_frame", Material.ENDER_PORTAL_FRAME, BlockTypes.END_PORTAL_FRAME),
    END_STONE(121, "end_stone", Material.ENDER_STONE, BlockTypes.END_STONE),
    DRAGON_EGG(122, "dragon_egg", Material.DRAGON_EGG, BlockTypes.DRAGON_EGG),
    REDSTONE_LAMP(123, "redstone_lamp", Material.REDSTONE_LAMP_OFF, BlockTypes.REDSTONE_LAMP),
    LIT_REDSTONE_LAMP(124, "lit_redstone_lamp", Material.REDSTONE_LAMP_ON, BlockTypes.LIT_REDSTONE_LAMP),
    DOUBLE_WOODEN_SLAB(125, "double_wooden_slab", Material.WOOD_DOUBLE_STEP, BlockTypes.DOUBLE_WOODEN_SLAB),
    WOODEN_SLAB(126, "wooden_slab", Material.WOOD_STEP, BlockTypes.WOODEN_SLAB),
    COCOA(127, "cocoa", Material.COCOA, BlockTypes.COCOA),
    SANDSTONE_STAIRS(128, "sandstone_stairs", Material.SANDSTONE_STAIRS, BlockTypes.SANDSTONE_STAIRS),
    EMERALD_ORE(129, "emerald_ore", Material.EMERALD_ORE, BlockTypes.EMERALD_ORE),
    ENDER_CHEST(130, "ender_chest", Material.ENDER_CHEST, BlockTypes.ENDER_CHEST),
    TRIPWIRE_HOOK(131, "tripwire_hook", Material.TRIPWIRE_HOOK, BlockTypes.TRIPWIRE_HOOK),
    TRIPWIRE(132, "tripwire", Material.TRIPWIRE, BlockTypes.TRIPWIRE),
    EMERALD_BLOCK(133, "emerald_block", Material.EMERALD_BLOCK, BlockTypes.EMERALD_BLOCK),
    SPRUCE_STAIRS(134, "spruce_stairs", Material.SPRUCE_WOOD_STAIRS, BlockTypes.SPRUCE_STAIRS),
    BIRCH_STAIRS(135, "birch_stairs", Material.BIRCH_WOOD_STAIRS, BlockTypes.BIRCH_STAIRS),
    JUNGLE_STAIRS(136, "jungle_stairs", Material.JUNGLE_WOOD_STAIRS, BlockTypes.JUNGLE_STAIRS),
    COMMAND_BLOCK(137, "command_block", Material.COMMAND, BlockTypes.COMMAND_BLOCK),
    BEACON(138, "beacon", Material.BEACON, BlockTypes.BEACON),
    COBBLESTONE_WALL(139, "cobblestone_wall", Material.COBBLE_WALL, BlockTypes.COBBLESTONE_WALL),
    FLOWER_POT(140, "flower_pot", Material.FLOWER_POT, BlockTypes.FLOWER_POT),
    CARROTS(141, "carrots", Material.CARROT, BlockTypes.CARROTS),
    POTATOES(142, "potatoes", Material.POTATO, BlockTypes.POTATOES),
    WOODEN_BUTTON(143, "wooden_button", Material.WOOD_BUTTON, BlockTypes.WOODEN_BUTTON),
    SKULL(144, "skull", Material.SKULL, BlockTypes.SKULL),
    ANVIL(145, "anvil", Material.ANVIL, BlockTypes.ANVIL),
    TRAPPED_CHEST(146, "trapped_chest", Material.TRAPPED_CHEST, BlockTypes.TRAPPED_CHEST),
    LIGHT_WEIGHTED_PRESSURE_PLATE(147, "light_weighted_pressure_plate", Material.GOLD_PLATE, BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE),
    HEAVY_WEIGHTED_PRESSURE_PLATE(148, "heavy_weighted_pressure_plate", Material.IRON_PLATE, BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE),
    UNPOWERED_COMPARATOR(149, "unpowered_comparator", Material.REDSTONE_COMPARATOR_OFF, BlockTypes.UNPOWERED_COMPARATOR),
    POWERED_COMPARATOR(150, "powered_comparator", Material.REDSTONE_COMPARATOR_ON, BlockTypes.POWERED_COMPARATOR),
    DAYLIGHT_DETECTOR(151, "daylight_detector", Material.DAYLIGHT_DETECTOR, BlockTypes.DAYLIGHT_DETECTOR),
    REDSTONE_BLOCK(152, "redstone_block", Material.REDSTONE_BLOCK, BlockTypes.REDSTONE_BLOCK),
    QUARTZ_ORE(153, "quartz_ore", Material.QUARTZ_ORE, BlockTypes.QUARTZ_ORE),
    HOPPER(154, "hopper", Material.HOPPER, BlockTypes.HOPPER),
    QUARTZ_BLOCK(155, "quartz_block", Material.QUARTZ_BLOCK, BlockTypes.QUARTZ_BLOCK),
    QUARTZ_STAIRS(156, "quartz_stairs", Material.QUARTZ_STAIRS, BlockTypes.QUARTZ_STAIRS),
    ACTIVATOR_RAIL(157, "activator_rail", Material.ACTIVATOR_RAIL, BlockTypes.ACTIVATOR_RAIL),
    DROPPER(158, "dropper", Material.DROPPER, BlockTypes.DROPPER),
    STAINED_HARDENED_CLAY(159, "stained_hardened_clay", Material.STAINED_CLAY, BlockTypes.STAINED_HARDENED_CLAY),
    STAINED_GLASS_PANE(160, "stained_glass_pane", Material.STAINED_GLASS_PANE, BlockTypes.STAINED_GLASS_PANE),
    LEAVES2(161, "leaves2", Material.LEAVES_2, BlockTypes.LEAVES2),
    ACACIA_STAIRS(163, "acacia_stairs", Material.ACACIA_STAIRS, BlockTypes.ACACIA_STAIRS),
    DARK_OAK_STAIRS(164, "dark_oak_stairs", Material.DARK_OAK_STAIRS, BlockTypes.DARK_OAK_STAIRS),
    SLIME_BLOCK(165, "slime", Material.SLIME_BLOCK, BlockTypes.SLIME),
    BARRIER(166, "barrier", Material.BARRIER, BlockTypes.BARRIER),
    IRON_TRAPDOOR(167, "iron_trapdoor", Material.IRON_TRAPDOOR, BlockTypes.IRON_TRAPDOOR),
    PRISMARINE(168, "prismarine", Material.PRISMARINE, BlockTypes.PRISMARINE),
    SEA_LANTERN(169, "sea_lantern", Material.SEA_LANTERN, BlockTypes.SEA_LANTERN),
    HAY_BLOCK(170, "hay_block", Material.HAY_BLOCK, BlockTypes.HAY_BLOCK),
    CARPET(171, "carpet", Material.CARPET, BlockTypes.CARPET),
    HARDENED_CLAY(172, "hardened_clay", Material.HARD_CLAY, BlockTypes.HARDENED_CLAY),
    COAL_BLOCK(173, "coal_block", Material.COAL_BLOCK, BlockTypes.COAL_BLOCK),
    PACKED_ICE(174, "packed_ice", Material.PACKED_ICE, BlockTypes.PACKED_ICE),
    DOUBLE_PLANT(175, "double_plant", Material.DOUBLE_PLANT, BlockTypes.DOUBLE_PLANT),
    STANDING_BANNER(176, "standing_banner", Material.STANDING_BANNER, BlockTypes.STANDING_BANNER),
    WALL_BANNER(177, "wall_banner", Material.WALL_BANNER, BlockTypes.WALL_BANNER),
    DAYLIGHT_DETECTOR_INVERTED(178, "daylight_detector_inverted", Material.DAYLIGHT_DETECTOR_INVERTED, BlockTypes.DAYLIGHT_DETECTOR_INVERTED),
    RED_SANDSTONE(179, "red_sandstone", Material.RED_SANDSTONE, BlockTypes.RED_SANDSTONE),
    RED_SANDSTONE_STAIRS(180, "red_sandstone_stairs", Material.RED_SANDSTONE_STAIRS, BlockTypes.RED_SANDSTONE_STAIRS),
    DOUBLE_STONE_SLAB2(181, "double_stone_slab2", Material.DOUBLE_STONE_SLAB2, BlockTypes.DOUBLE_STONE_SLAB2),
    STONE_SLAB2(182, "stone_slab2", Material.STONE_SLAB2, BlockTypes.STONE_SLAB2),
    SPRUCE_FENCE_GATE(183, "spruce_fence_gate", Material.SPRUCE_FENCE_GATE, BlockTypes.SPRUCE_FENCE_GATE),
    BIRCH_FENCE_GATE(184, "birch_fence_gate", Material.BIRCH_FENCE_GATE, BlockTypes.BIRCH_FENCE_GATE),
    JUNGLE_FENCE_GATE(185, "jungle_fence_gate", Material.JUNGLE_FENCE_GATE, BlockTypes.JUNGLE_FENCE_GATE),
    DARK_OAK_FENCE_GATE(186, "dark_oak_fence_gate", Material.DARK_OAK_FENCE_GATE, BlockTypes.DARK_OAK_FENCE_GATE),
    ACACIA_FENCE_GATE(187, "acacia_fence_gate", Material.ACACIA_FENCE_GATE, BlockTypes.ACACIA_FENCE_GATE),
    SPRUCE_FENCE(188, "spruce_fence", Material.SPRUCE_FENCE, BlockTypes.SPRUCE_FENCE),
    BIRCH_FENCE(189, "birch_fence", Material.BIRCH_FENCE, BlockTypes.BIRCH_FENCE),
    JUNGLE_FENCE(190, "jungle_fence", Material.JUNGLE_FENCE, BlockTypes.JUNGLE_FENCE),
    DARK_OAK_FENCE(191, "dark_oak_fence", Material.DARK_OAK_FENCE, BlockTypes.DARK_OAK_FENCE),
    ACACIA_FENCE(192, "acacia_fence", Material.ACACIA_FENCE, BlockTypes.ACACIA_FENCE),
    SPRUCE_DOOR(193, "spruce_door", Material.SPRUCE_DOOR, BlockTypes.SPRUCE_DOOR),
    BIRCH_DOOR(194, "birch_door", Material.BIRCH_DOOR, BlockTypes.BIRCH_DOOR),
    JUNGLE_DOOR(195, "jungle_door", Material.JUNGLE_DOOR, BlockTypes.JUNGLE_DOOR),
    ACACIA_DOOR(196, "acacia_door", Material.ACACIA_DOOR, BlockTypes.ACACIA_DOOR),
    DARK_OAK_DOOR(197, "dark_oak_door", Material.DARK_OAK_DOOR, BlockTypes.DARK_OAK_DOOR),
    END_ROD(198, "end_rod", Material.END_ROD, BlockTypes.END_ROD),
    CHORUS_PLANT(199, "chorus_plant", Material.CHORUS_PLANT, BlockTypes.CHORUS_PLANT),
    CHORUS_FLOWER(200, "chorus_flower", Material.CHORUS_FLOWER, BlockTypes.CHORUS_FLOWER),
    PURPUR_BLOCK(201, "purpur_block", Material.PURPUR_BLOCK, BlockTypes.PURPUR_BLOCK),
    PURPUR_PILLAR(202, "purpur_pillar", Material.PURPUR_PILLAR, BlockTypes.PURPUR_PILLAR),
    PURPUR_STAIRS(203, "purpur_stairs", Material.PURPUR_STAIRS, BlockTypes.PURPUR_STAIRS),
    PURPUR_DOUBLE_SLAB(204, "purpur_double_slab", Material.PURPUR_DOUBLE_SLAB, BlockTypes.PURPUR_DOUBLE_SLAB),
    PURPUR_SLAB(205, "purpur_slab", Material.PURPUR_SLAB, BlockTypes.PURPUR_SLAB),
    END_BRICKS(206, "end_bricks", Material.END_BRICKS, BlockTypes.END_BRICKS),
    BEETROOTS(207, "beetroots", Material.BEETROOT, BlockTypes.BEETROOTS),
    GRASS_PATH(208, "grass_path", Material.GRASS_PATH, BlockTypes.GRASS_PATH),
    END_GATEWAY(209, "end_gateway", Material.END_GATEWAY, BlockTypes.END_GATEWAY),
    REPEATING_COMMAND_BLOCK(210, "repeating_command_block", Material.COMMAND_REPEATING, BlockTypes.REPEATING_COMMAND_BLOCK),
    CHAIN_COMMAND_BLOCK(211, "chain_command_block", Material.COMMAND_CHAIN, BlockTypes.CHAIN_COMMAND_BLOCK),
    FROSTED_ICE(212, "frosted_ice", Material.FROSTED_ICE, BlockTypes.FROSTED_ICE),
    MAGMA(213, "magma", Material.MAGMA, BlockTypes.MAGMA),
    NETHER_WART_BLOCK(214, "nether_wart_block", Material.NETHER_WART_BLOCK, BlockTypes.NETHER_WART_BLOCK),
    RED_NETHER_BRICK(215, "red_nether_brick", Material.RED_NETHER_BRICK, BlockTypes.RED_NETHER_BRICK),
    BONE_BLOCK(216, "bone_block", Material.BONE_BLOCK, BlockTypes.BONE_BLOCK),
    STRUCTURE_VOID(217, "structure_void", Material.STRUCTURE_VOID, BlockTypes.STRUCTURE_VOID),
    OBSERVER(218, "observer", Material.OBSERVER, BlockTypes.OBSERVER),
    WHITE_SHULKER_BOX(219, "white_shulker_box", Material.WHITE_SHULKER_BOX, BlockTypes.WHITE_SHULKER_BOX),
    ORANGE_SHULKER_BOX(220, "orange_shulker_box", Material.ORANGE_SHULKER_BOX, BlockTypes.ORANGE_SHULKER_BOX),
    MAGENTA_SHULKER_BOX(221, "magenta_shulker_box", Material.MAGENTA_SHULKER_BOX, BlockTypes.MAGENTA_SHULKER_BOX),
    LIGHT_BLUE_SHULKER_BOX(222, "light_blue_shulker_box", Material.LIGHT_BLUE_SHULKER_BOX, BlockTypes.LIGHT_BLUE_SHULKER_BOX),
    YELLOW_SHULKER_BOX(223, "yellow_shulker_box", Material.YELLOW_SHULKER_BOX, BlockTypes.YELLOW_SHULKER_BOX),
    LIME_SHULKER_BOX(224, "lime_shulker_box", Material.LIME_SHULKER_BOX, BlockTypes.LIME_SHULKER_BOX),
    PINK_SHULKER_BOX(225, "pink_shulker_box", Material.PINK_SHULKER_BOX, BlockTypes.PINK_SHULKER_BOX),
    GRAY_SHULKER_BOX(226, "gray_shulker_box", Material.GRAY_SHULKER_BOX, BlockTypes.GRAY_SHULKER_BOX),
    SILVER_SHULKER_BOX(227, "silver_shulker_box", Material.SILVER_SHULKER_BOX, BlockTypes.SILVER_SHULKER_BOX),
    CYAN_SHULKER_BOX(228, "cyan_shulker_box", Material.CYAN_SHULKER_BOX, BlockTypes.CYAN_SHULKER_BOX),
    PURPLE_SHULKER_BOX(229, "purple_shulker_box", Material.PURPLE_SHULKER_BOX, BlockTypes.PURPLE_SHULKER_BOX),
    BLUE_SHULKER_BOX(230, "blue_shulker_box", Material.BLUE_SHULKER_BOX, BlockTypes.BLUE_SHULKER_BOX),
    BROWN_SHULKER_BOX(231, "brown_shulker_box", Material.BROWN_SHULKER_BOX, BlockTypes.BROWN_SHULKER_BOX),
    GREEN_SHULKER_BOX(232, "green_shulker_box", Material.GREEN_SHULKER_BOX, BlockTypes.GREEN_SHULKER_BOX),
    RED_SHULKER_BOX(233, "red_shulker_box", Material.RED_SHULKER_BOX, BlockTypes.RED_SHULKER_BOX),
    BLACK_SHULKER_BOX(234, "black_shulker_box", Material.BLACK_SHULKER_BOX, BlockTypes.BLACK_SHULKER_BOX),
    WHITE_GLAZED_TERRACOTTA(235, "white_glazed_terracotta", Material.WHITE_GLAZED_TERRACOTTA, BlockTypes.WHITE_GLAZED_TERRACOTTA),
    ORANGE_GLAZED_TERRACOTTA(236, "orange_glazed_terracotta", Material.ORANGE_GLAZED_TERRACOTTA, BlockTypes.ORANGE_GLAZED_TERRACOTTA),
    MAGENTA_GLAZED_TERRACOTTA(237, "magenta_glazed_terracotta", Material.MAGENTA_GLAZED_TERRACOTTA, BlockTypes.MAGENTA_GLAZED_TERRACOTTA),
    LIGHT_BLUE_GLAZED_TERRACOTTA(238, "light_blue_glazed_terracotta", Material.LIGHT_BLUE_GLAZED_TERRACOTTA, BlockTypes.LIGHT_BLUE_GLAZED_TERRACOTTA),
    YELLOW_GLAZED_TERRACOTTA(239, "yellow_glazed_terracotta", Material.YELLOW_GLAZED_TERRACOTTA, BlockTypes.YELLOW_GLAZED_TERRACOTTA),
    LIME_GLAZED_TERRACOTTA(240, "lime_glazed_terracotta", Material.LIME_GLAZED_TERRACOTTA, BlockTypes.LIME_GLAZED_TERRACOTTA),
    PINK_GLAZED_TERRACOTTA(241, "pink_glazed_terracotta", Material.PINK_GLAZED_TERRACOTTA, BlockTypes.PINK_GLAZED_TERRACOTTA),
    GRAY_GLAZED_TERRACOTTA(242, "gray_glazed_terracotta", Material.GRAY_GLAZED_TERRACOTTA, BlockTypes.GRAY_GLAZED_TERRACOTTA),
    SILVER_GLAZED_TERRACOTTA(243, "silver_glazed_terracotta", Material.SILVER_GLAZED_TERRACOTTA, BlockTypes.SILVER_GLAZED_TERRACOTTA),
    CYAN_GLAZED_TERRACOTTA(244, "cyan_glazed_terracotta", Material.CYAN_GLAZED_TERRACOTTA, BlockTypes.CYAN_GLAZED_TERRACOTTA),
    PURPLE_GLAZED_TERRACOTTA(245, "purple_glazed_terracotta", Material.PURPLE_GLAZED_TERRACOTTA, BlockTypes.PURPLE_GLAZED_TERRACOTTA),
    BLUE_GLAZED_TERRACOTTA(246, "blue_glazed_terracotta", Material.BLUE_GLAZED_TERRACOTTA, BlockTypes.BLUE_GLAZED_TERRACOTTA),
    BROWN_GLAZED_TERRACOTTA(247, "brown_glazed_terracotta", Material.BROWN_GLAZED_TERRACOTTA, BlockTypes.BROWN_GLAZED_TERRACOTTA),
    GREEN_GLAZED_TERRACOTTA(248, "green_glazed_terracotta", Material.GREEN_GLAZED_TERRACOTTA, BlockTypes.GREEN_GLAZED_TERRACOTTA),
    RED_GLAZED_TERRACOTTA(249, "red_glazed_terracotta", Material.RED_GLAZED_TERRACOTTA, BlockTypes.RED_GLAZED_TERRACOTTA),
    BLACK_GLAZED_TERRACOTTA(250, "black_glazed_terracotta", Material.BLACK_GLAZED_TERRACOTTA, BlockTypes.BLACK_GLAZED_TERRACOTTA),
    CONCRETE(251, "concrete", Material.CONCRETE, BlockTypes.CONCRETE),
    CONCRETE_POWDER(252, "concrete_powder", Material.CONCRETE_POWDER, BlockTypes.CONCRETE_POWDER),
    STRUCTURE_BLOCK(255, "structure_block", Material.STRUCTURE_BLOCK, BlockTypes.STRUCTURE_BLOCK),
    UNKNOWN(-1, "unknown", null, null);

    public final int id;
    public final String nameId;
    public final Material bukkitType;
    public final org.spongepowered.api.block.BlockType spongeType;

    private static final HashMap<String, BlockType> nameIdMap = new HashMap<>();
    private static final HashMap<Material, BlockType> bukkitTypeMap = new HashMap<>();
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

    private IBlockState defaultState;

    BlockType(int id, String nameId, Material bukkitType, org.spongepowered.api.block.BlockType spongeType) {
        this.id = id;
        this.nameId = nameId;
        this.bukkitType = bukkitType;
        this.spongeType = spongeType;
    }

    public static BlockType getType(Material type) {
        return bukkitTypeMap.getOrDefault(type, UNKNOWN);
    }

    public static BlockType getType(org.spongepowered.api.block.BlockType type) {
        return spongeTypeMap.getOrDefault(type, UNKNOWN);
    }

    public Translation getTranslation() {
        return null;
    }

    public IBlockState getDefaultState() {
        return defaultState;
    }

    public void setDefaultState(IBlockState defaultState) {
        this.defaultState = defaultState;
    }
}

package org.rikka.craft.block;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.rikka.RikkaType;
import org.rikka.block.BlockScript;

public class CraftBlockScript extends CraftBlock implements BlockScript {

    public CraftBlockScript(World world, Block block, BlockPos pos) {
        super(world, block, pos);
    }

    @Override
    public RikkaType type() {
        return RikkaType.BLOCK_SCRIPT;
    }
}

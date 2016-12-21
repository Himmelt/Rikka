package org.rikka.craft.block;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import org.rikka.RikkaType;
import org.rikka.block.IBlockScript;
import org.rikka.world.IWorld;

public class CraftBlockScript extends CraftBlock implements IBlockScript {

    public CraftBlockScript(IWorld world, Block block, BlockPos pos) {
        super(world, block, pos);
    }

    @Override
    public RikkaType getType() {
        return RikkaType.BLOCK_SCRIPT;
    }
}

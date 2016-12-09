package org.rikka.craft.block;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.rikka.block.BlockScript;
import org.rikka.data.Data;
import org.rikka.script.Scriptable;

public class CraftBlockScript extends CraftBlock implements BlockScript {

    private final Data TData;
    private final Data SData;

    public CraftBlockScript(World world, Block block, BlockPos pos) {
        super(world, block, pos);
        if (this.tile instanceof Scriptable) {
            this.TData = ((Scriptable) tile).getTData();
            this.SData = ((Scriptable) tile).getSData();
        } else {
            this.TData = null;
            this.SData = null;
        }
    }

    @Override
    public Data getTData() {
        return TData;
    }

    @Override
    public Data getSData() {
        return SData;
    }
}

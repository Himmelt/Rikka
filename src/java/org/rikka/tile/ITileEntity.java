package org.rikka.tile;

import net.minecraft.tileentity.TileEntity;
import org.rikka.Rikka;
import org.rikka.data.IData;

public interface ITileEntity extends Rikka<TileEntity> {
    /**
     * 获取缓存变量(TempData).
     *
     * @return 缓存变量.
     */
    IData getTData();

    /**
     * 获取存储变量(StoredData).
     *
     * @return 存储变量.
     */
    IData getSData();
}

package com.akroZora.highendtechnology.block.custom;

import com.akroZora.highendtechnology.tile.custom.TileEntityStorageCrate;
import mekanism.common.block.prefab.BlockTile;
import mekanism.common.content.blocktype.BlockTypeTile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class StorageCrateBlock extends BlockTile<TileEntityStorageCrate, BlockTypeTile<TileEntityStorageCrate>> {


    public StorageCrateBlock(BlockTypeTile<TileEntityStorageCrate> blockTypeTileStorageCrate) {
        super(blockTypeTileStorageCrate);
    }

    @Override
    public void onRemove(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof TileEntityStorageCrate) {
                ((TileEntityStorageCrate) blockEntity).drops();
            }
        }
        super.onRemove(state, world, pos, newState, isMoving);
    }
}




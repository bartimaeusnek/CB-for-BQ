package com.github.bartimaeusnek.CB4BQ;

import betterquesting.core.BetterQuesting;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockREB
extends BlockCommandBlock {
    public BlockREB() {
        this.setHardness(1.0f);
        this.setBlockName("CB4BQ.REB");
        this.setBlockTextureName("command_block");
        this.setCreativeTab(BetterQuesting.tabQuesting);
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		return Util.executeCommand(world, player, "reset", "all");
	}
}

package com.github.bartimaeusnek.CB4BQ;

import betterquesting.commands.BQ_CommandAdmin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Util {
    public static boolean executeCommand(World world, EntityPlayer player, String... command) {
        if (!world.isRemote) {
            new BQ_CommandAdmin().processCommand(player,command);
        }
        return true;
    }

}
package com.github.bartimaeusnek.CB4BQ;

import betterquesting.commands.BQ_CommandAdmin;
import betterquesting.commands.admin.QuestCommandDefaults;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class Util {
    public static boolean executeCommand(World world, EntityPlayer player, String... command) {
        if (!world.isRemote) {
            new QuestCommandDefaults().runCommand(MinecraftServer.getServer(),new BQ_CommandAdmin(),player,command);
        }
        return true;
    }

}
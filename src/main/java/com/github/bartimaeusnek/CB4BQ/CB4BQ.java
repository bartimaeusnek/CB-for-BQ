package com.github.bartimaeusnek.CB4BQ;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;

@Mod(
		modid = "cb4bq", name = "Command Blocks for Better Questing", version = "1",
		dependencies = "required-after:betterquesting", acceptableRemoteVersions = "*"
		)


public class CB4BQ {

	public static Block BlockDLB = new BlockDLB();
	public static Block BlockDSB = new BlockDSB();
	public static Block BlockHSB = new BlockHSB();
	public static Block BlockREB = new BlockREB();

	public static final org.apache.logging.log4j.Logger CLClogger = LogManager.getLogger("cb4bq");
	
	@Instance(value = "cb4bq")
	public static CB4BQ instance;
	
	@SidedProxy(clientSide="com.github.bartimaeusnek.CB4BQ.CommonProxy",serverSide="com.github.bartimaeusnek.CB4BQ.ServerProxy")
	public static ServerProxy proxy;
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
}

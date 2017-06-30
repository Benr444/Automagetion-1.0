package com.baconianmethod.automagetion;

import com.baconianmethod.automagetion.block.ModBlocks;
import com.baconianmethod.automagetion.crafting.BasicCrafting;
import com.baconianmethod.automagetion.event.BroomEventHandler;
import com.baconianmethod.automagetion.gui.ModGuiHandler;
import com.baconianmethod.automagetion.item.Melody;
import com.baconianmethod.automagetion.item.ModItems;
import com.baconianmethod.automagetion.tileentity.ModTileEntities;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy 
{

    public void preInit(FMLPreInitializationEvent e) 
    {
    	//Register new in-game features
    	ModItems.init();
    	ModBlocks.init();
    	ModTileEntities.init();
    	BasicCrafting.init();
    	
    	//Gui handlers
    	NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new ModGuiHandler());
    	
    	//Register event handlers
    	MinecraftForge.EVENT_BUS.register(new BroomEventHandler());
    }

    public void init(FMLInitializationEvent e) 
    {

    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
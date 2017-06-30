package com.baconianmethod.automagetion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main 
{

    public static final String MODID = "automagetion";
    public static final String MODNAME = "Automagetion";
    public static final String VERSION = "1.0.0";
        
    @Instance
    public static Main instance = new Main();
        
    @SidedProxy(clientSide="com.baconianmethod.automagetion.ClientProxy", serverSide="com.baconianmethod.automagetion.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("Hello World!");
    	proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
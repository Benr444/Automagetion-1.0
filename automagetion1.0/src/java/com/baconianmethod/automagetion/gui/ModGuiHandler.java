package com.baconianmethod.automagetion.gui;

import com.baconianmethod.automagetion.tileentity.VibratoriumEntity;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ModGuiHandler implements IGuiHandler
{
	public static final int VIBRATORIUM_GUI = 0;

	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch (ID)
		{
			case VIBRATORIUM_GUI:
				return new ContainerVibratoriumEntity(player.inventory, (VibratoriumEntity)world.getTileEntity(x, y, z));

			
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case VIBRATORIUM_GUI:
				return new GuiVibratoriumEntity(player.inventory, (VibratoriumEntity)world.getTileEntity(x, y, z));
			
		}
		return null;
	}
	
}

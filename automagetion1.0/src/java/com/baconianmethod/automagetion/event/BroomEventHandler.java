package com.baconianmethod.automagetion.event;

import com.baconianmethod.automagetion.item.ModItems;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class BroomEventHandler 
{
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void preventItemPickup(EntityItemPickupEvent e)
	{
		try
		{
			if (ModItems.broom.getUnlocalizedName().equals(e.entityPlayer.getCurrentEquippedItem().getItem().getUnlocalizedName()))
			{
				//System.out.println("Cannot pick up item due to broom.");
				e.setCanceled(true);
			}
		}
		catch(NullPointerException n)
		{
			
		}
	}
}

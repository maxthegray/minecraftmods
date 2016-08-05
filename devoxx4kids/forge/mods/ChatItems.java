package org.devoxx4kids.forge.mods;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {

	@SubscribeEvent
	public void giveItems(ServerChatEvent event) {
		if (event.message.contains("potato!")) {
			event.player.inventory.addItemStackToInventory(
					new ItemStack(Items.diamond_sword, 1));
			event.player.inventory.addItemStackToInventory(
					new ItemStack(Items.iron_sword, 1));
		}
	}
}

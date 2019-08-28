package me.rndstad.amigos.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerInventoryUtils {

    public static boolean hasInventorySpace(Player player, ItemStack itemStack) {
        int spaceLeft = 0;

        for (int i = 0; i < 36; i++) {
            ItemStack currentItemStack = player.getInventory().getItem(i);

            //Itemstack is Material.AIR
            if (currentItemStack == null) {
                spaceLeft = itemStack.getMaxStackSize() + 1;
                //Item has same item meta
            } else if (currentItemStack.isSimilar(itemStack)) {
                spaceLeft = (itemStack.getMaxStackSize() - currentItemStack.getAmount()) + 1;
            }
        }
        return spaceLeft >= itemStack.getAmount();
    }

    public static boolean hasOpenSlots(Player player, int slots) {
        int spaceLeft = 0;

        for (int i = 0; i < 36; i++) {
            ItemStack currentItemStack = player.getInventory().getItem(i);
            if (currentItemStack == null) {
                spaceLeft++;
            }
        }

        return spaceLeft >= slots;
    }
}

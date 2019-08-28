package me.rndstad.amigos.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.Arrays;

public class ItemStackUtils {

    public static ItemStack getPotionItemStack(PotionType type, int level, boolean extend, String displayName, String... lore){
        Potion potion = new Potion(type).extend();
        potion.setLevel(level);
        potion.setSplash(false);

        if (extend) {
            potion.setHasExtendedDuration(true);
        }

        ItemStack item = potion.toItemStack(1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(displayName);
        if (lore != null) {
            meta.setLore(Arrays.asList(lore));
        }
        item.setItemMeta(meta);

        return item;
    }
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rottenfleshnowuseful.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.rottenfleshnowuseful.item.CuredFleshItem;
import net.mcreator.rottenfleshnowuseful.RottenFleshNowUsefulMod;

public class RottenFleshNowUsefulModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RottenFleshNowUsefulMod.MODID);
	public static final RegistryObject<Item> CURED_FLESH = REGISTRY.register("cured_flesh", () -> new CuredFleshItem());
	// Start of user code block custom items
	// End of user code block custom items
}

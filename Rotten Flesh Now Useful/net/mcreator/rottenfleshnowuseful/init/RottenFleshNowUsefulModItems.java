/*    */ package net.mcreator.rottenfleshnowuseful.init;
/*    */ 
/*    */ import net.mcreator.rottenfleshnowuseful.item.CookedFleshItem;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RottenFleshNowUsefulModItems
/*    */ {
/* 18 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((Registry)BuiltInRegistries.ITEM, "rotten_flesh_now_useful");
/* 19 */   public static final DeferredHolder<Item, Item> COOKED_FLESH = REGISTRY.register("cooked_flesh", () -> new CookedFleshItem());
/*    */ 
/*    */ 
/*    */   
/*    */   public static void register(IEventBus bus) {
/* 24 */     REGISTRY.register(bus);
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/rotten_flesh_now_useful-1.0.0-neoforge-1.20.4.jar!/net/mcreator/rottenfleshnowuseful/init/RottenFleshNowUsefulModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
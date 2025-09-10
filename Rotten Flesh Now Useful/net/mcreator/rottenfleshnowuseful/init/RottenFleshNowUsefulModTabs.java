/*    */ package net.mcreator.rottenfleshnowuseful.init;
/*    */ 
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.CreativeModeTabs;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.common.Mod.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class RottenFleshNowUsefulModTabs
/*    */ {
/* 20 */   public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "rotten_flesh_now_useful");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
/* 24 */     if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
/* 25 */       tabData.accept((ItemLike)RottenFleshNowUsefulModItems.COOKED_FLESH.get()); 
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/rotten_flesh_now_useful-1.0.0-neoforge-1.20.4.jar!/net/mcreator/rottenfleshnowuseful/init/RottenFleshNowUsefulModTabs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
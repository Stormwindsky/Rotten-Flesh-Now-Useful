/*    */ package net.mcreator.rottenfleshnowuseful.item;
/*    */ 
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class CookedFleshItem
/*    */   extends Item {
/*    */   public CookedFleshItem() {
/* 10 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build()));
/*    */   }
/*    */ }


/* Location:              /home/stormwindsky/Téléchargements/rotten_flesh_now_useful-1.0.0-neoforge-1.20.4.jar!/net/mcreator/rottenfleshnowuseful/item/CookedFleshItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
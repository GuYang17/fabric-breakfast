package hisui.breakfast.registers;

import hisui.breakfast.Main;
import hisui.breakfast.MilkBottleItem;
import hisui.breakfast.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegister {
    public static final Item TOAST = new Item(new FabricItemSettings().food(ModFoodComponents.TOAST));
    public static final Item BUTTER = new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER));
    public static final Item FRIED_EGG = new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG));
    public static final Item JAM = new HoneyBottleItem(new FabricItemSettings().food(ModFoodComponents.JAM).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16));
    public static final Item EGG_ON_TOAST = new Item(new FabricItemSettings().food(ModFoodComponents.EGG_ON_TOAST));
    public static final Item JAM_TOAST = new Item(new FabricItemSettings().food(ModFoodComponents.JAM_TOAST));
    public static final Item JAM_SANDWICH = new Item(new FabricItemSettings().food(ModFoodComponents.JAM_SANDWICH));
    public static final Item BUTTER_TOAST = new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER_TOAST));
    public static final Item FRESH_MILK = new MilkBottleItem(new FabricItemSettings().maxCount(16));

    private static void addItem(Item item, String id){
        Registry.register(Registries.ITEM, new Identifier(Main.MODID, id), item);
    }
    public static void register() {
        addItem(TOAST, "toast");
        addItem(BUTTER, "butter");
        addItem(FRIED_EGG, "fried_egg");
        addItem(JAM, "jam");
        addItem(EGG_ON_TOAST,"egg_toast");
        addItem(JAM_TOAST,"jam_toast");
        addItem(JAM_SANDWICH,"jam_sandwich");
        addItem(BUTTER_TOAST,"butter_toast");
        addItem(FRESH_MILK, "fresh_milk");

        handleItemGroup();
    }

    private static void handleItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(Items.BREAD, TOAST);
            content.addAfter(TOAST, BUTTER_TOAST);
            content.addAfter(BUTTER_TOAST, EGG_ON_TOAST);
            content.addAfter(EGG_ON_TOAST, JAM_TOAST);
            content.addAfter(JAM_TOAST, JAM_SANDWICH);
            content.addAfter(Items.MILK_BUCKET, FRESH_MILK);
            content.addAfter(FRESH_MILK, BUTTER);
            content.addAfter(JAM_SANDWICH, FRIED_EGG);
            content.addAfter(Items.HONEY_BOTTLE, JAM);
        });
    }

}

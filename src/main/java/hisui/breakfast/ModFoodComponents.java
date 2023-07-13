package hisui.breakfast;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build();
    public static final FoodComponent BUTTER = new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).snack().build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent JAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).alwaysEdible().build();
    public static final FoodComponent EGG_ON_TOAST = new FoodComponent.Builder().hunger(11).saturationModifier(1.2f).build();
    public static final FoodComponent JAM_TOAST = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent JAM_SANDWICH = new FoodComponent.Builder().hunger(17).saturationModifier(1.2f).build();
    public static final FoodComponent BUTTER_TOAST = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build();
    public static final FoodComponent FRESH_MILK = new FoodComponent.Builder().hunger(0).saturationModifier(0).build();
}

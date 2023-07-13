package hisui.breakfast;

import hisui.breakfast.registers.ItemRegister;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.DataProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class DataGeneration implements DataGeneratorEntrypoint {

    private static class ModModelGenerator extends FabricModelProvider {
        private ModModelGenerator(FabricDataOutput generator){
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){

        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator){
            itemModelGenerator.register(ItemRegister.TOAST, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.BUTTER, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.JAM, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.FRIED_EGG, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.EGG_ON_TOAST, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.JAM_TOAST, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.JAM_SANDWICH, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.BUTTER_TOAST, Models.GENERATED);
            itemModelGenerator.register(ItemRegister.FRESH_MILK, Models.GENERATED);
        }
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.createPack().addProvider(ModModelGenerator::new);
    }

}

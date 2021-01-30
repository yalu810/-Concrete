package com.yalu.concrete;

import com.yalu.concrete.Block.LightBlockBase;
import com.yalu.concrete.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static com.yalu.concrete.util.UtilKt.concreteRegistryBlock;


@Mod(modid = Reference.MODID,version = Reference.VERSION,name = Reference.NAME)
public class Main {
    @Mod.EventHandler
    void preInit(FMLInitializationEvent event) {
        concreteRegisterBlocks();
    }

    void concreteRegisterBlocks() {
        //concrete
        Block blackConcrete = new BlockBase(Material.rock,"black_concrete");
        Block blueConcrete = new BlockBase(Material.rock,"blue_concrete");
        Block brownConcrete = new BlockBase(Material.rock,"brown_concrete");
        Block cyanConcrete = new BlockBase(Material.rock,"cyan_concrete");
        Block grayConcrete = new BlockBase(Material.rock,"gray_concrete");
        Block greenConcrete = new BlockBase(Material.rock,"green_concrete");
        Block lightBlueConcrete = new BlockBase(Material.rock,"light_blue_concrete");
        Block lightGrayConcrete = new BlockBase(Material.rock,"light_gray_concrete");
        Block limeConcrete = new BlockBase(Material.rock,"lime_concrete");
        Block magentaConcrete = new BlockBase(Material.rock,"magenta_concrete");
        Block orangeConcrete = new BlockBase(Material.rock,"orange_concrete");
        Block pinkConcrete = new BlockBase(Material.rock,"pink_concrete");
        Block purpleConcrete = new BlockBase(Material.rock,"purple_concrete");
        Block redConcrete = new BlockBase(Material.rock,"red_concrete");
        Block whiteConcrete = new BlockBase(Material.rock,"white_concrete");
        Block yellowConcrete = new BlockBase(Material.rock,"yellow_concrete");
        //light block
        Block sea_lantern = new LightBlockBase(Material.rock,"sea_lantern");

        concreteRegistryBlock(blackConcrete);
        concreteRegistryBlock(blueConcrete);
        concreteRegistryBlock(brownConcrete);
        concreteRegistryBlock(cyanConcrete);
        concreteRegistryBlock(grayConcrete);
        concreteRegistryBlock(greenConcrete);
        concreteRegistryBlock(lightBlueConcrete);
        concreteRegistryBlock(lightGrayConcrete);
        concreteRegistryBlock(limeConcrete);
        concreteRegistryBlock(magentaConcrete);
        concreteRegistryBlock(orangeConcrete);
        concreteRegistryBlock(pinkConcrete);
        concreteRegistryBlock(purpleConcrete);
        concreteRegistryBlock(redConcrete);
        concreteRegistryBlock(whiteConcrete);
        concreteRegistryBlock(yellowConcrete);
        concreteRegistryBlock(sea_lantern);
    }
    
}

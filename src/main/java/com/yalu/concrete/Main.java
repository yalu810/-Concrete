package com.yalu.concrete;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = "concrete", version = "0.1.1", name = "Concrete Mod")
public class Main {
    @Mod.EventHandler
    void preInit(FMLInitializationEvent event) {
        registerBlocks();
    }

    void registerBlocks() {
        final Block blackConcrete = new BlockTable(Material.cloth).setBlockName("black_concrete").setBlockTextureName("concrete:black_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block blueConcrete = new BlockTable(Material.cloth).setBlockName("blue_concrete").setBlockTextureName("concrete:blue_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block brownConcrete = new BlockTable(Material.cloth).setBlockName("brown_concrete").setBlockTextureName("concrete:brown_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block cyanConcrete = new BlockTable(Material.cloth).setBlockName("cyan_concrete").setBlockTextureName("concrete:cyan_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block grayConcrete = new BlockTable(Material.cloth).setBlockName("gray_concrete").setBlockTextureName("concrete:gray_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block greenConcrete = new BlockTable(Material.cloth).setBlockName("green_concrete").setBlockTextureName("concrete:green_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block lightBlueConcrete = new BlockTable(Material.cloth).setBlockName("light_blue_concrete").setBlockTextureName("concrete:light_blue_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block lightGrayConcrete = new BlockTable(Material.cloth).setBlockName("light_gray_concrete").setBlockTextureName("concrete:light_gray_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block limeConcrete = new BlockTable(Material.cloth).setBlockName("lime_concrete").setBlockTextureName("concrete:lime_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block magentaConcrete = new BlockTable(Material.cloth).setBlockName("magenta_concrete").setBlockTextureName("concrete:magenta_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block orangeConcrete = new BlockTable(Material.cloth).setBlockName("orange_concrete").setBlockTextureName("concrete:orange_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block pinkConcrete = new BlockTable(Material.cloth).setBlockName("pink_concrete").setBlockTextureName("concrete:pink_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block purpleConcrete = new BlockTable(Material.cloth).setBlockName("purple_concrete").setBlockTextureName("concrete:purple_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block redConcrete = new BlockTable(Material.cloth).setBlockName("red_concrete").setBlockTextureName("concrete:red_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block whiteConcrete = new BlockTable(Material.cloth).setBlockName("white_concrete").setBlockTextureName("concrete:white_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block yellowConcrete = new BlockTable(Material.cloth).setBlockName("yellow_concrete").setBlockTextureName("concrete:yellow_concrete").setCreativeTab(CreativeTabs.tabBlock);
        
        GameRegistry.registerBlock(blackConcrete, blackConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blueConcrete, blueConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(brownConcrete, brownConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cyanConcrete, cyanConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(grayConcrete, grayConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(greenConcrete, greenConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lightBlueConcrete, lightBlueConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lightGrayConcrete, lightGrayConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(limeConcrete, limeConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(magentaConcrete, magentaConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(orangeConcrete, orangeConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(pinkConcrete, pinkConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(purpleConcrete, purpleConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(redConcrete, redConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(whiteConcrete, whiteConcrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(yellowConcrete, yellowConcrete.getUnlocalizedName().substring(5));
    }
}

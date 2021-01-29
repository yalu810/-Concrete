package com.yalu.concrete;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid ="concrete", version = "0.1.1",name="Concrete Mod")
public class Main {


    @Mod.EventHandler
    void preInit(FMLInitializationEvent event){
        REG();
    }

    void REG() {
        final Block black_concrete = new BlockTable(Material.cloth).setBlockName("black_concrete").setBlockTextureName("concrete:black_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block blue_concrete = new BlockTable(Material.cloth).setBlockName("blue_concrete").setBlockTextureName("concrete:blue_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block brown_concrete = new BlockTable(Material.cloth).setBlockName("brown_concrete").setBlockTextureName("concrete:brown_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block cyan_concrete = new BlockTable(Material.cloth).setBlockName("cyan_concrete").setBlockTextureName("concrete:cyan_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block gray_concrete = new BlockTable(Material.cloth).setBlockName("gray_concrete").setBlockTextureName("concrete:gray_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block green_concrete = new BlockTable(Material.cloth).setBlockName("green_concrete").setBlockTextureName("concrete:green_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block light_blue_concrete = new BlockTable(Material.cloth).setBlockName("light_blue_concrete").setBlockTextureName("concrete:light_blue_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block light_gray_concrete = new BlockTable(Material.cloth).setBlockName("light_gray_concrete").setBlockTextureName("concrete:light_gray_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block lime_concrete = new BlockTable(Material.cloth).setBlockName("lime_concrete").setBlockTextureName("concrete:lime_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block magenta_concrete = new BlockTable(Material.cloth).setBlockName("magenta_concrete").setBlockTextureName("concrete:magenta_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block orange_concrete = new BlockTable(Material.cloth).setBlockName("orange_concrete").setBlockTextureName("concrete:orange_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block pink_concrete = new BlockTable(Material.cloth).setBlockName("pink_concrete").setBlockTextureName("concrete:pink_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block purple_concrete = new BlockTable(Material.cloth).setBlockName("purple_concrete").setBlockTextureName("concrete:purple_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block red_concrete = new BlockTable(Material.cloth).setBlockName("red_concrete").setBlockTextureName("concrete:red_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block white_concrete = new BlockTable(Material.cloth).setBlockName("white_concrete").setBlockTextureName("concrete:white_concrete").setCreativeTab(CreativeTabs.tabBlock);
        final Block yellow_concrete = new BlockTable(Material.cloth).setBlockName("yellow_concrete").setBlockTextureName("concrete:yellow_concrete").setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(black_concrete, black_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blue_concrete, blue_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(brown_concrete, brown_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cyan_concrete, cyan_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(gray_concrete, gray_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(green_concrete, green_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(light_blue_concrete, light_blue_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(light_gray_concrete, light_gray_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lime_concrete, lime_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(magenta_concrete, magenta_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(orange_concrete, orange_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(pink_concrete, pink_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(purple_concrete, purple_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(red_concrete, red_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(white_concrete, white_concrete.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(yellow_concrete, yellow_concrete.getUnlocalizedName().substring(5));
    }
}

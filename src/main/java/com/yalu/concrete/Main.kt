package com.yalu.concrete

import com.yalu.concrete.util.concreteRegistryBlock
import cpw.mods.fml.common.event.FMLInitializationEvent
import com.yalu.concrete.BlockBase
import com.yalu.concrete.Block.LightBlockBase
import com.yalu.concrete.util.Reference
import cpw.mods.fml.common.Mod
import net.minecraft.block.Block
import net.minecraft.block.material.Material

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
class Main {
    @Mod.EventHandler
    fun preInit(event: FMLInitializationEvent?) {
        concreteRegisterBlocks()
    }

    fun concreteRegisterBlocks() {
        //concrete
        val blackConcrete: Block = BlockBase(Material.rock, "black_concrete")
        val blueConcrete: Block = BlockBase(Material.rock, "blue_concrete")
        val brownConcrete: Block = BlockBase(Material.rock, "brown_concrete")
        val cyanConcrete: Block = BlockBase(Material.rock, "cyan_concrete")
        val grayConcrete: Block = BlockBase(Material.rock, "gray_concrete")
        val greenConcrete: Block = BlockBase(Material.rock, "green_concrete")
        val lightBlueConcrete: Block = BlockBase(Material.rock, "light_blue_concrete")
        val lightGrayConcrete: Block = BlockBase(Material.rock, "light_gray_concrete")
        val limeConcrete: Block = BlockBase(Material.rock, "lime_concrete")
        val magentaConcrete: Block = BlockBase(Material.rock, "magenta_concrete")
        val orangeConcrete: Block = BlockBase(Material.rock, "orange_concrete")
        val pinkConcrete: Block = BlockBase(Material.rock, "pink_concrete")
        val purpleConcrete: Block = BlockBase(Material.rock, "purple_concrete")
        val redConcrete: Block = BlockBase(Material.rock, "red_concrete")
        val whiteConcrete: Block = BlockBase(Material.rock, "white_concrete")
        val yellowConcrete: Block = BlockBase(Material.rock, "yellow_concrete")
        //light block
        val sea_lantern: Block = LightBlockBase(Material.rock, "sea_lantern")
        concreteRegistryBlock(blackConcrete)
        concreteRegistryBlock(blueConcrete)
        concreteRegistryBlock(brownConcrete)
        concreteRegistryBlock(cyanConcrete)
        concreteRegistryBlock(grayConcrete)
        concreteRegistryBlock(greenConcrete)
        concreteRegistryBlock(lightBlueConcrete)
        concreteRegistryBlock(lightGrayConcrete)
        concreteRegistryBlock(limeConcrete)
        concreteRegistryBlock(magentaConcrete)
        concreteRegistryBlock(orangeConcrete)
        concreteRegistryBlock(pinkConcrete)
        concreteRegistryBlock(purpleConcrete)
        concreteRegistryBlock(redConcrete)
        concreteRegistryBlock(whiteConcrete)
        concreteRegistryBlock(yellowConcrete)
        concreteRegistryBlock(sea_lantern)
    }
}
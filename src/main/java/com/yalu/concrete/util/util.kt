package com.yalu.concrete.util

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block

fun concreteRegistryBlock(block: Block){
    GameRegistry.registerBlock(block,block.getUnlocalizedName().substring(5))
}
object Reference{
    const val MODID = "concrete"
    const val VERSION = "0.1.1"
    const val NAME = "Concrete Mod"
}
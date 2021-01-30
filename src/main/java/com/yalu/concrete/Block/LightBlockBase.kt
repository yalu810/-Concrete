package com.yalu.concrete.Block

import net.minecraft.block.Block
import net.minecraft.block.material.Material

class LightBlockBase(material: Material?,name:String) : Block(material) {
    init {
        setLightLevel(150f)
        setBlockName(name)
        setBlockTextureName("concrete:"+name)
    }
}
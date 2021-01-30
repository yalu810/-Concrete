package com.yalu.concrete

import com.yalu.concrete.CreativeTab.CreativeTabConcrete
import net.minecraft.block.Block
import net.minecraft.block.material.Material

class BlockBase(p_i45394_1_: Material?,name:String) : Block(p_i45394_1_) {
    init{
        setCreativeTab(CreativeTabConcrete.TabConcrete)
        setBlockName(name)
        setBlockTextureName("concrete:"+name)
    }
}

package com.yalu.concrete.CreativeTab

import net.minecraft.creativetab.CreativeTabs

import net.minecraft.item.Item

class CreativeTabConcrete(label: String?) : CreativeTabs(label) {
    override fun getTabIconItem(): Item {
        return Item.getItemById(1)
    }

    companion object Tab{
        val TabConcrete: CreativeTabs = CreativeTabConcrete("Concrete")
    }
}
package com.yalu.concrete

import cpw.mods.fml.common.event.FMLInitializationEvent
import com.yalu.concrete.util.Reference
import com.yalu.concrete.Block.concreteBlockInit
import cpw.mods.fml.common.Mod

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
class Main {
    @Mod.EventHandler
    fun preInit(event: FMLInitializationEvent?) {
        concreteBlockInit()
    }
}
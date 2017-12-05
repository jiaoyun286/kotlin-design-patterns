package com.nd.patterns.strategy

/**
 * @author JiaoYun
 * @date 2017/12/5 下午11:18
 * @Description
 */
class SpellStrategy : DragonSlayingStrategy{
    override fun execute() {
        println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")
    }
}
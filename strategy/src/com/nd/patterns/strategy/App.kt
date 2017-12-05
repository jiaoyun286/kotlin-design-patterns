package com.nd.patterns.strategy

/**
 * @author JiaoYun
 * @date 2017/12/5 下午11:10
 * @Description
 */

fun main(args: Array<String>) {
    var dragonSlayer = DragonSlayer(MeleeStategy())
    dragonSlayer.goToBattle()
    dragonSlayer.changeStrategy(ProjectileStrategy())
    dragonSlayer.goToBattle()
    dragonSlayer.changeStrategy(SpellStrategy())
    dragonSlayer.goToBattle()

}
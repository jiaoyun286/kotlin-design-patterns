package com.nd.patterns.strategy

/**
 * @author JiaoYun
 * @date 2017/12/5 下午11:17
 * @Description
 */
class ProjectileStrategy : DragonSlayingStrategy{
    override fun execute() {
        println("You shoot the dragon with the magical crossbow and it falls dead on the ground!")
    }
}
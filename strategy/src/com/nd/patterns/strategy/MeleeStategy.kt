package com.nd.patterns.strategy

/**
 * @author JiaoYun
 * @date 2017/12/5 下午11:15
 * @Description
 */
class MeleeStategy : DragonSlayingStrategy{
    override fun execute() {
        println("With you Excalibur you server the dragon's head")
    }
}
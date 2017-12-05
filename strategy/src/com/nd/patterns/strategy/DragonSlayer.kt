package com.nd.patterns.strategy

/**
 * @author JiaoYun
 * @date 2017/12/5 下午11:19
 * @Description
 */
class DragonSlayer ( private var strategy: DragonSlayingStrategy){

    fun changeStrategy(strategy: DragonSlayingStrategy){
        this.strategy = strategy
    }

    fun goToBattle() = strategy.execute()
}
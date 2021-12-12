package com.yangyijing.stepcounter.bean

/**
 * Created by yangyijing
 * Date: 2021/6/14
 * To do:
 */
class StepEntity() {
    var curDate: String? = null //当天的日期
    var steps: String? = null   //当天的步数

    constructor(curDate: String, steps: String) : this() {
        this.curDate = curDate
        this.steps = steps
    }

    override fun toString(): String {
        return "StepEntity{" +
                "curDate='" + curDate + '\'' +
                ", steps=" + steps +
                '}'
    }
}
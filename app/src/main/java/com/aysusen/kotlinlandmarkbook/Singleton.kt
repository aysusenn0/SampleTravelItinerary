package com.aysusen.kotlinlandmarkbook

object Singleton {
    var chosenLandMark:LandMark?=null
    fun initialize(landmark: LandMark) {
        chosenLandMark = landmark
    }

}
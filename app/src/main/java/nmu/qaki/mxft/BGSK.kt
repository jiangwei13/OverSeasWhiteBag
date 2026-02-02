package nmu.qaki.mxft

import android.app.Application


class BGSK : Application() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: BGSK? = null


    }

    override fun onCreate() {
        val arr_EHDSopqGJEqt = intArrayOf(24, 79)
        for (i_xKbATUlXs in 0 until arr_EHDSopqGJEqt.size - 1) {
            for (j_bPNipzfARqXOkAb in 0 until arr_EHDSopqGJEqt.size - 1 - i_xKbATUlXs) {
                if (arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb] > arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1]) {
                    val tmp_XSfmCyOhnEdbBMrV = arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb]
                    arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb] = arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1]
                    arr_EHDSopqGJEqt[j_bPNipzfARqXOkAb + 1] = tmp_XSfmCyOhnEdbBMrV
                }
            }
        }
        super.onCreate()
        insApp = this

    }




}
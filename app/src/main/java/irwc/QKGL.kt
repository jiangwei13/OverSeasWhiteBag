package irwc

import android.app.Application
import com.example.overseaswhitebag.common.utils.APPContext


class QKGL : Application() {

    companion object {
        var isBackLanch: Boolean = false


        @JvmStatic
        var insDrawApp: QKGL? = null


    }

    override fun onCreate() {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val asdfghjk5621arr = intArrayOf(12, 5, 8, 19, 3)
            var maxValPlokmn8734 = asdfghjk5621arr[0]
            var maxIdxQazwsx9812 = 0
            for (iterYhnujm3456 in 1..<asdfghjk5621arr.size) {
                if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                    maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456]
                    maxIdxQazwsx9812 = iterYhnujm3456
                }
            }
            val unusedMaxRfvtgb2198 = maxValPlokmn8734
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        super.onCreate()
        insDrawApp = this
        APPContext.setApplication(this)

    }




}
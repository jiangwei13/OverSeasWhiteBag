package efej

import android.annotation.SuppressLint
import android.content.Context

class RXCE {

    companion object{

        @JvmStatic
        val AD_LOG_TAG:String = "AD_LOG:====="

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        private var context:Context? = null
        @JvmStatic
        fun setApplication(context: Context){
            val _t0 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_0 = 123456
                val qweiuyakdbaskjd = intArrayOf(1, 5)
                  for (qwieoyhaksdhasd in 1..<qweiuyakdbaskjd.size) {
                      val hajksdhjasdhjkasd = qweiuyakdbaskjd[qwieoyhaksdhasd]
                      var ajksdhjaksdbkasd12313 = qwieoyhaksdhasd
                      while (ajksdhjaksdbkasd12313 > 0 && hajksdhjasdhjkasd < qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]) {
                          qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                              qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]
                          ajksdhjaksdbkasd12313--
                      }
                      qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                          hajksdhjasdhjkasd
                  }
                _t0 + kjashdfkjasdhfkjash32432marker_0
            }.let { if (it < 0) println(it) }
            Companion.context = context
        }
        @JvmStatic
        fun getApplicationContext():Context{
            val _t1 = System.nanoTime()
            run {
                val kjashdfkjasdhfkjash32432marker_1 = 123456
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
                _t1 + kjashdfkjasdhfkjash32432marker_1
            }.let { if (it < 0) println(it) }
            return context!!
        }

    }
}
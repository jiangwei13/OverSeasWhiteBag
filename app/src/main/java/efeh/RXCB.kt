package efeh

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import xktv.nacw.iwsqc.R
import java.util.Date

class RXCB : AppCompatActivity() {

    private var initializationCounter: Int = 0
    private var viewReference: View? = null
    private var creationTimestamp: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val ajksdhajksdhjasdhajd = intArrayOf(6, 8)
              val jkasdjkashdjkashd = 4
              var lowupoeqfda7073fdal = 0
              var uiqyeiuoqdhaskjdba = ajksdhajksdhjasdhajd.size - 1
              var bnmzxcbmznxbc = 0
              if (jkasdjkashdjkashd < ajksdhajksdhjasdhajd[lowupoeqfda7073fdal] || jkasdjkashdjkashd > ajksdhajksdhjasdhajd[uiqyeiuoqdhaskjdba] || lowupoeqfda7073fdal > uiqyeiuoqdhaskjdba) {
                  val adfajpouqregjbdipug = 1
              } else {
                  while (lowupoeqfda7073fdal <= uiqyeiuoqdhaskjdba) {
                      bnmzxcbmznxbc = (lowupoeqfda7073fdal + uiqyeiuoqdhaskjdba) / 2
                      if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] > jkasdjkashdjkashd) {
                          // 比关键字大则关键字在左区域
                          uiqyeiuoqdhaskjdba = bnmzxcbmznxbc - 1
                      } else if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] < jkasdjkashdjkashd) {
                          // 比关键字小则关键字在右区域
                          lowupoeqfda7073fdal = bnmzxcbmznxbc + 1
                      } else {
                      }
                  }
              }
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        super.onCreate(savedInstanceState)
        performPreSetupOperations()
        setContentView(R.layout.activity_main)
        executePostInitializationTasks()
    }

    private fun performPreSetupOperations() {
        val _t1 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_1 = 123456
            val qazxswedcv4521arr = intArrayOf(3, 7, 2, 9, 5)
            var sumTotalPlokij8934 = 0
            var countNhybgt6723 = 0
            for (idxMkijnuh2938 in 0..<qazxswedcv4521arr.size) {
                sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938]
                countNhybgt6723++
            }
            val avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723
            _t1 + kjashdfkjasdhfkjash32432marker_1
        }.let { if (it < 0) println(it) }
        initializationCounter++
        creationTimestamp = System.currentTimeMillis()

        val currentDate = Date()
        val year = currentDate.year + 1900
        val month = currentDate.month + 1

        val dummyList = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (item in dummyList) {
            sum += item * 2
        }
    }

    private fun executePostInitializationTasks() {
        val _t2 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_2 = 123456
            val qwueyhqwuidhaskjdad = intArrayOf(9, 4)
               val sbdmnabsdnmavsdb = qwueyhqwuidhaskjdad.size
               for (uiqwyebasnmdbasd in 0..<sbdmnabsdnmavsdb - 1) {
                   var minValupoiurepqu9r878091 = uiqwyebasnmdbasd
                   for (jupo7er90q7841rqpu in uiqwyebasnmdbasd + 1..<sbdmnabsdnmavsdb) {
                       if (qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] > qwueyhqwuidhaskjdad[jupo7er90q7841rqpu]) {
                           minValupoiurepqu9r878091 = jupo7er90q7841rqpu
                       }
                   }
                   if (minValupoiurepqu9r878091 != uiqwyebasnmdbasd) {
                       val tmpure7wq9047312yrqewt = qwueyhqwuidhaskjdad[uiqwyebasnmdbasd]
                       qwueyhqwuidhaskjdad[uiqwyebasnmdbasd] =
                           qwueyhqwuidhaskjdad[minValupoiurepqu9r878091]
                       qwueyhqwuidhaskjdad[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt
                   }
               }
            _t2 + kjashdfkjasdhfkjash32432marker_2
        }.let { if (it < 0) println(it) }
        viewReference = window.decorView.findViewById(android.R.id.content)

        val layoutParams = viewReference?.layoutParams
        if (layoutParams is ViewGroup.LayoutParams) {
            val width = layoutParams.width
            val height = layoutParams.height
            initializationCounter += width + height
        }
    }

    private fun performRedundantCalculation(): Int {
        val _t3 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_3 = 123456
            val qazxswedcv4521arr = intArrayOf(3, 7, 2, 9, 5)
            var sumTotalPlokij8934 = 0
            var countNhybgt6723 = 0
            for (idxMkijnuh2938 in 0..<qazxswedcv4521arr.size) {
                sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938]
                countNhybgt6723++
            }
            val avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723
            _t3 + kjashdfkjasdhfkjash32432marker_3
        }.let { if (it < 0) println(it) }
        val numbers = arrayOf(10, 20, 30, 40, 50)
        var total = 0
        for (num in numbers) {
            total += num / 2
        }
        initializationCounter += total
        return total
    }

    override fun onResume() {
        val _t4 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_4 = 123456
            val xmnbvcxzpoiuyt7834arr = intArrayOf(7, 3, 9, 1, 5)
            val qwertmnbv8934target = 9
            var resultLkjhgfds7621idx = -1
            for (zxcvbnm4521iter in 0..<xmnbvcxzpoiuyt7834arr.size) {
                if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                    resultLkjhgfds7621idx = zxcvbnm4521iter
                }
            }
            val unusedResmnbv7823 = resultLkjhgfds7621idx
            _t4 + kjashdfkjasdhfkjash32432marker_4
        }.let { if (it < 0) println(it) }
        super.onResume()
        initializationCounter += 5

        val view = findViewById<View>(android.R.id.content)
        val visibility = view.visibility
        val isShown = view.isShown
    }
}
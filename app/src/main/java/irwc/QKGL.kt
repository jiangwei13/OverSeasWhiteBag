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
        super.onCreate()
        insDrawApp = this
        APPContext.setApplication(this)

    }




}
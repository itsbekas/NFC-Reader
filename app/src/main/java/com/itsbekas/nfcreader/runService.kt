package com.itsbekas.nfcreader

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.itsbekas.nfcreader.api.*

class ReadTag : Service() {

    private var api: BaseAPI? = null
    private var binder: IBinder? = null

    override fun onCreate() {
        // The service is being created
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Connect to required API
        var intentApp: String = "boas"
        when (intentApp) {
            "habitica" -> api = HabiticaAPI()
            "spotify" -> api = SpotifyAPI()
        }
        return Service.START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        // idk what this does
        return binder
    }

    override fun onDestroy() {
        // Kill the process
    }
}
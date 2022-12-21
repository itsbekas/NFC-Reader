package com.itsbekas.nfcreader

import android.app.Service

class ReadTag : Service() {

    private var binder: IBinder? = null

    override fun onCreate() {
        // Connect to required API
        stopSelf()
    }

    override fun onBind(intent: Intent): IBinder? {
        // idk what this does
        return binder
    }

    override fun onDestroy() {
        // Kill the process
    }
}
package com.bedsongultom.splashscreen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        Timber.tag("Welcome Activity").i("onCreate")
    }

    //life cycles

    override fun onStart() {
        super.onStart()
        Timber.tag("Welcome Activity").i("onStart")

    }

    override fun onResume() {
        super.onResume()
        Timber.tag("Welcome Activity").i("onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.tag("Welcome Activity").i("onRestart")
    }

    override fun onPause() {
        super.onPause()
        Timber.tag("Welcome Activity").i("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.tag("Welcome Activity").i("onPause")
    }
}
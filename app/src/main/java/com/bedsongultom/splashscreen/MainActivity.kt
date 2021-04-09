package com.bedsongultom.splashscreen

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private var mProgress: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView(){
        mProgress =  findViewById(R.id.splash_screen_progress_bar)
        val bckgrndDr: Drawable = ColorDrawable(Color.RED)
      
        mProgress!!.indeterminateDrawable.setColorFilter(bckgrndDr, PorterDuff.Mode.SRC_IN)
        mProgress!!.progressDrawable.setColorFilter(bckgrndDr, PorterDuff.Mode.SRC_IN)

        Thread(Runnable {
            doWork()
            startApp()
            finish()
        }).start()

    }

    private fun startApp() {
        val intent = Intent(this, Welcome::class.java)
        startActivity(intent)
    }

    private fun doWork() {
        var progress = 0
        while (progress <= 100) {
            try {
                Thread.sleep(1000)
                mProgress!!.progress = progress
            } catch (e: Exception) {
                e.printStackTrace()
                Timber.e(e)
            }
            progress += 10
        }
    }


}

private fun Any.setColorFilter(bckgrndDr: Drawable, srcIn: PorterDuff.Mode) {

}

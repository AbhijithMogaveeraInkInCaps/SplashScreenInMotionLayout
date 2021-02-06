package com.abhijith.splashscreeninmotionlayout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<MotionLayout>(R.id.root).apply {
            addTransitionListener(object : MotionLayout.TransitionListener {

                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    if (p1 == R.id.end) {
                        setTransition(R.id.end, R.id.end1)
                        transitionToEnd()
                    }
                    if (p1 == R.id.end1) {
                        setTransition(R.id.end1, R.id.end2)
                        transitionToEnd()
                    }
                    if (p1 == R.id.end2) {
                        setTransition(R.id.end2, R.id.end3)
                        transitionToEnd()
                    }
                    if (p1 == R.id.end3) {
                        setTransition(R.id.end3, R.id.end4)
                        transitionToEnd()
//                        findViewById<LinearLayout>(R.id.logo).apply {
//                            this.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
//                        }
//                        val animZoomOut = AnimationUtils.loadAnimation(this@MainActivity, R.anim.zoom_out)
//                        findViewById<ImageView>(R.id.logo_outer).startAnimation(animZoomOut)
//                        val animZoomOutTwo = AnimationUtils.loadAnimation(this@MainActivity, R.anim.zoom_out_two)
//                        findViewById<ImageView>(R.id.logo_inner).startAnimation(animZoomOutTwo)
                    }
                    if (p1 == R.id.end4) {
                        Intent(context, IntroActivity::class.java).apply {
                            startActivity(this)
                            finish()
                        }
                    }

                }

                override fun onTransitionTrigger(
                    p0: MotionLayout?,
                    p1: Int,
                    p2: Boolean,
                    p3: Float
                ) {

                }
            })
        }
    }
}


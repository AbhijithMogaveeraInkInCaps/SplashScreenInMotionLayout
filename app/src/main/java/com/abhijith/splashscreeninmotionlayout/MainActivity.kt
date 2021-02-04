package com.abhijith.splashscreeninmotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var flag = true
        setContentView(R.layout.activity_main)
        findViewById<MotionLayout>(R.id.root).apply {

            addTransitionListener(object : MotionLayout.TransitionListener {

                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    if(flag) {
                        setTransition(R.id.end, R.id.start)
                        flag = false
                        flag = false
                    }else{
                        if(p1==R.id.end){
                            setTransition(R.id.end, R.id.end1)
                            transitionToEnd()
                        }
                        if(p1==R.id.end1){
                            setTransition(R.id.end1, R.id.end2)
                            transitionToEnd()
                        }
                        if(p1==R.id.end2){
                            setTransition(R.id.end2, R.id.end3)
                            transitionToEnd()
                        }
                        if(p1==R.id.end3){
                            setTransition(R.id.end3, R.id.end4)
                            transitionToEnd()
                        }
//                        if(p1==R.id.end1){
//                            setTransition(R.id.end, R.id.end2)
//                            transitionToEnd()
//                        }
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
            transitionToEnd()
        }
    }
}
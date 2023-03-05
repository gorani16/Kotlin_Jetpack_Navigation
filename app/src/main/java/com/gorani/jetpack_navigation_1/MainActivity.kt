package com.gorani.jetpack_navigation_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

/**
 * Navigation
 * 1. Graph
 * 2. Back Button Event
 * ex. Fragment 가 1 -> 2 -> 3  -> 4 -> 5 있다고 가정.
 * 1 -> 2 -> 3  -> 4 -> 5 로 이동했을 때, 5 에서 Back Button 을 누를 경우 5 -> 4 -> 3 -> 2 -> 1 로 작동될 것이다.
 * 하지만 이번 실습에서는 5 에서 1 로 바로 이동하는 것을 실습할 것이다.
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
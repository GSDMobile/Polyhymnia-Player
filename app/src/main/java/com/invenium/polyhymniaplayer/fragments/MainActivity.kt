package com.invenium.polyhymniaplayer.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.invenium.polyhymniaplayer.R
import com.invenium.polyhymniaplayer.fragments.home.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
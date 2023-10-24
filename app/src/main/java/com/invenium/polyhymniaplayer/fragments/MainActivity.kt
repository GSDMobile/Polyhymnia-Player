package com.invenium.polyhymniaplayer.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.invenium.polyhymniaplayer.R
import com.invenium.polyhymniaplayer.fragments.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, HomeFragment())
                .commit()
        }
    }
}

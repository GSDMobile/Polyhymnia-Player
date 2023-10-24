package com.invenium.polyhymniaplayer.fragments.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.invenium.polyhymniaplayer.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myButton: Button = view.findViewById(R.id.myButtonSongs)

        val navcontrol = findNavController()
        myButton.setOnClickListener {
            navcontrol.navigate(R.id.action_homeFragment_to_songsfragment)
        }
    }
}

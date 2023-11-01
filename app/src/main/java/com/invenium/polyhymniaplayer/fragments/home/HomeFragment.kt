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

        val mySongsButton: Button = view.findViewById(R.id.myButtonSongs)

        val myArtistsButton: Button = view.findViewById(R.id.myButtonArtists)

        val navControlSongs = findNavController()
        mySongsButton.setOnClickListener {
            navControlSongs.navigate(R.id.action_homeFragment_to_songsfragment)
        }

        val navControlArtists = findNavController()
        mySongsButton.setOnClickListener {
            navControlArtists.navigate(R.id.action_homeFragment_to_artistsFragment)

        }
    }
}
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

        val myAlbumsButton: Button = view.findViewById(R.id.myButtonAlbums)

        val myPlaylistsButton: Button = view.findViewById(R.id.myButtonPlaylists)

        val navControlSongs = findNavController()
        mySongsButton.setOnClickListener {
            navControlSongs.navigate(R.id.action_homeFragment_to_songsfragment)
        }

        val navControlArtists = findNavController()
        myArtistsButton.setOnClickListener {
            navControlArtists.navigate(R.id.action_homeFragment_to_artistsFragment)
        }

        val navControlAlbums = findNavController()
        myAlbumsButton.setOnClickListener {
            navControlAlbums.navigate(R.id.action_homeFragment_to_albumsFragment)
        }

        val navControlPlaylists = findNavController()
        myPlaylistsButton.setOnClickListener {
            navControlPlaylists.navigate(R.id.action_homeFragment_to_playlistsFragment)
        }
    }
}
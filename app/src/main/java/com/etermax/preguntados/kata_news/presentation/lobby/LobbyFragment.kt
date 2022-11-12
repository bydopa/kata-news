package com.etermax.preguntados.kata_news.presentation.lobby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.etermax.preguntados.kata_news.databinding.LobbyFragmentBinding

class LobbyFragment : Fragment() {

    private lateinit var binding: LobbyFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LobbyFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
package com.etermax.preguntados.kata_news.presentation.newsDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.etermax.preguntados.kata_news.R
import com.etermax.preguntados.kata_news.databinding.LobbyFragmentBinding
import com.etermax.preguntados.kata_news.databinding.NewsDetailFragmentBinding

class NewsDetailFragment : Fragment() {

    private lateinit var binding: NewsDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewsDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
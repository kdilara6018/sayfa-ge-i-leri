package com.example.sayfagecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sayfagecis.R
import com.example.sayfagecis.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        // Butona tıklanınca A_Fragment'a geçiş yap
        binding.anasayfaAButton.setOnClickListener {
            findNavController().navigate(R.id.anasayfadanayagecis)
        }
        binding.anasayfaXButton.setOnClickListener {
            findNavController().navigate(R.id.anasayfadanxegecis)
        }
        return binding.root
    }


    }

package com.example.sayfagecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sayfagecis.R
import com.example.sayfagecis.databinding.FragmentAnasayfaBinding
import com.example.sayfagecis.databinding.FragmentBBinding

class B_Fragment : Fragment() {
    private lateinit var binding : FragmentBBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        // Butona tıklanınca A_Fragment'a geçiş yap
        binding.bSayfasiButton.setOnClickListener {
            findNavController().navigate(R.id.bdenyyegecis)
        }
return binding.root
    }

}
















package com.example.sayfagecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sayfagecis.R
import com.example.sayfagecis.databinding.FragmentABinding
import com.example.sayfagecis.databinding.FragmentAnasayfaBinding

class A_Fragment : Fragment() {
    private lateinit var binding : FragmentABinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        // Butona tıklanınca A_Fragment'a geçiş yap
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.adanbyegecis)
        }
        return binding.root
    }

}




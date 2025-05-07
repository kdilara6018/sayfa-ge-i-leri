package com.example.sayfagecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sayfagecis.R
import com.example.sayfagecis.databinding.FragmentAnasayfaBinding
import com.example.sayfagecis.databinding.FragmentYBinding
import androidx.activity.OnBackPressedCallback


class Y_Fragment : Fragment() {
    private lateinit var binding : FragmentYBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater, container, false)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.ydenanasayfayagecis)
            }
        })
        return binding.root
    }
}
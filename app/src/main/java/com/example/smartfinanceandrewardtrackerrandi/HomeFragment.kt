package com.example.smartfinanceandrewardtrackerrandi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartfinanceandrewardtrackerrandi.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize buttons
        binding.sendMoneyButton.setOnClickListener { /* Handle send money */ }
        binding.addMoneyButton.setOnClickListener { /* Handle add money */ }
        binding.incomeButton.setOnClickListener { /* Handle income */ }
        binding.expenditureButton.setOnClickListener { /* Handle expenditure */ }
    }
}
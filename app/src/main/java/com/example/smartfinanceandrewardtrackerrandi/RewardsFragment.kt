package com.example.smartfinanceandrewardtrackerrandi

import android.app.Fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// RewardsFragment.kt
class RewardsFragment : Fragment() {
    private lateinit var binding: FragmentRewardsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentRewardsBinding.inflate(inflater, container, false)
        binding.rewardsText.text = "Every time you reach your goal, you get a coin as a reward."
        binding.setGoalButton.setOnClickListener { /* Handle goal setting */ }
        return binding.root
    }
}
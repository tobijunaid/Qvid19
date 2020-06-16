package com.thedroidcamp.qvid19.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.thedroidcamp.qvid19.R
import com.thedroidcamp.qvid19.databinding.FragmentPreventionBinding
import com.thedroidcamp.qvid19.preventions

class PreventionFragment : Fragment() {

<<<<<<< HEAD

    private lateinit var binding: FragmentPreventionBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

         binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_prevention, container, false)

        prevention_fragment_text.text = preventions

        prevention_fragment_previous_btn.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_preventionFragment_to_symptomsFragment)
        )

        prevention_fragment_next_btn.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_preventionFragment_to_treatmentsFragment)
=======
    private lateinit var binding: FragmentPreventionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_prevention, container, false
        )

        binding.preventionFragmentPreviousBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_preventionFragment_to_symptomsFragment
            )
        )

        binding.preventionFragmentNextBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_preventionFragment_to_treatmentsFragment
            )
>>>>>>> upstream/master
        )

        binding.preventionFragmentText.text = preventions

        return binding.root
    }
}

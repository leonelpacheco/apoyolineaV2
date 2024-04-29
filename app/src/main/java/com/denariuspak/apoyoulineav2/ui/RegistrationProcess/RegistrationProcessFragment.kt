package com.denariuspak.apoyoulineav2.ui.RegistrationProcess

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.denariuspak.apoyoulineav2.R
import com.denariuspak.apoyoulineav2.databinding.FragmentRegistrationProcessBinding

class RegistrationProcessFragment : Fragment() {

    private var _binding: FragmentRegistrationProcessBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val bundle = Bundle()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(RegistrationProcessViewModel::class.java)

        _binding = FragmentRegistrationProcessBinding.inflate(inflater, container, false)
        val root: View = binding.root

            binding.cardStepone.setOnClickListener {
                bundle.putInt("step", 1)
                findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
            }

        binding.cardSteptwo.setOnClickListener {
            bundle.putInt("step", 2)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }

        binding.cardStepthree.setOnClickListener {
            bundle.putInt("step", 3)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }


        binding.cardStepfour.setOnClickListener {
            bundle.putInt("step", 4)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }

        binding.cardStepfive.setOnClickListener {
            bundle.putInt("step", 5)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }

        binding.cardStepsix.setOnClickListener {
            bundle.putInt("step", 6)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }



        binding.cardStepseven.setOnClickListener {
            bundle.putInt("step", 7)
            findNavController().navigate(R.id.action_nav_procesoregistro_to_nav_processdetail, bundle)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
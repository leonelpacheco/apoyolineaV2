package com.denariuspak.apoyoulineav2.ui.examtips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.denariuspak.apoyoulineav2.databinding.FragmentExamtipsBinding


class ExamTipFragment : Fragment() {

    private var _binding: FragmentExamtipsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ExamTipViewModel::class.java)

        _binding = FragmentExamtipsBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
         //   textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
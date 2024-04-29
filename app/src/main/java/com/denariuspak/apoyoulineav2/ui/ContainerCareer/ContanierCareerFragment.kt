package com.denariuspak.apoyoulineav2.ui.ContainerCareer

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.denariuspak.apoyoulineav2.R
import com.denariuspak.apoyoulineav2.databinding.FragmentContainerCareerBinding


class ContanierCareerFragment : Fragment() {

    private var _binding: FragmentContainerCareerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ContainerCareerViewModel::class.java)

        _binding = FragmentContainerCareerBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val expandableView = binding.expandableView
        val CardView = binding.Cardview
        val arrowBtn = binding.arrowBtn

        arrowBtn.setBackgroundResource(R.drawable.ic_expand_less)


        arrowBtn.setOnClickListener {
            //start main activity


            if (expandableView.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(CardView, AutoTransition())
                expandableView.setVisibility(View.GONE);
                arrowBtn.setBackgroundResource(R.drawable.ic_expand_less)
            } else {
                TransitionManager.beginDelayedTransition(CardView, AutoTransition())
                expandableView.setVisibility(View.VISIBLE);
                arrowBtn.setBackgroundResource(R.drawable.ic_expand_more)
            }

        }






        val expandableViewtwo = binding.expandableViewtwo
        val CardviewTwo = binding.CardviewTwo
        val arrowBtntwo = binding.arrowBtntwo

        arrowBtntwo.setBackgroundResource(R.drawable.ic_expand_less)


        arrowBtntwo.setOnClickListener {
            //start main activity


            if (expandableViewtwo.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(CardviewTwo, AutoTransition())
                expandableViewtwo.setVisibility(View.GONE);
                arrowBtntwo.setBackgroundResource(R.drawable.ic_expand_less)
            } else {
                TransitionManager.beginDelayedTransition(CardviewTwo, AutoTransition())
                expandableViewtwo.setVisibility(View.VISIBLE);
                arrowBtntwo.setBackgroundResource(R.drawable.ic_expand_more)
            }

        }






        val expandableViewthree = binding.expandableViewthree
        val Cardviewthree = binding.Cardviewthree
        val arrowBtn_three = binding.arrowBtnThree

        arrowBtn_three.setBackgroundResource(R.drawable.ic_expand_less)


        arrowBtn_three.setOnClickListener {
            //start main activity


            if (expandableViewthree.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(Cardviewthree, AutoTransition())
                expandableViewthree.setVisibility(View.GONE);
                arrowBtn_three.setBackgroundResource(R.drawable.ic_expand_less)
            } else {
                TransitionManager.beginDelayedTransition(Cardviewthree, AutoTransition())
                expandableViewthree.setVisibility(View.VISIBLE);
                arrowBtn_three.setBackgroundResource(R.drawable.ic_expand_more)
            }

        }




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

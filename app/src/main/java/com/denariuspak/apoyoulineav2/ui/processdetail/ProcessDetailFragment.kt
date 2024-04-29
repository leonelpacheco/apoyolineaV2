package com.denariuspak.apoyoulineav2.ui.processdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SimpleAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denariuspak.apoyoulineav2.R
import com.denariuspak.apoyoulineav2.databinding.FragmentProcessdetailBinding


class ProcessDetailFragment : Fragment() {

    private var _binding: FragmentProcessdetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var listdetailprocess = listOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ProcessDetailModel::class.java)

        _binding = FragmentProcessdetailBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val step = arguments?.getInt("step")

        when(step){

            1->{listdetailprocess = listOf(getString(R.string.detail_txt_importantrecommendation),
                getString(R.string.detail_txt_recommendation1),getString(R.string.detail_txt_recommendation2)
            ,getString(R.string.detail_txt_recommendation3),getString(R.string.detail_txt_recommendation4))
              binding.txtTitledetail.text=getString(R.string.registrationprocess1_txt_TitleStep0ne)
                binding.txtDescriptiondetail.text=getString(R.string.detail_txt_description)
            }
            2->{listdetailprocess = listOf(getString(R.string.detailsteptwo_txt_importantrecommendation),
                getString(R.string.detailsteptwo_txt_recommendation1),getString(R.string.detailsteptwo_txt_recommendation2)
                )
                binding.txtTitledetail.text=getString(R.string.registrationprocess2_txt_TitleStepTwo)
                binding.txtDescriptiondetail.text=getString(R.string.detailsteptwo_txt_description)}

            3->{listdetailprocess = listOf(getString(R.string.detailstepthree_txt_importantrecommendation),
                getString(R.string.detailstepthree_txt_recommendation1),getString(R.string.detailstepthree_txt_recommendation2)
                ,getString(R.string.detailstepthree_txt_recommendation3))
                binding.txtTitledetail.text=getString(R.string.registrationprocess3_txt_TitleStepThree)
                binding.txtDescriptiondetail.text=getString(R.string.detailstepthree_txt_description)}

            4->{listdetailprocess = listOf(getString(R.string.detailstepfour_txt_importantrecommendation),
                getString(R.string.detailstepfour_txt_recommendation1),getString(R.string.detailstepfour_txt_recommendation2)
                ,getString(R.string.detailstepfour_txt_recommendation3))
                binding.txtTitledetail.text=getString(R.string.registrationprocess4_txt_TitleStepFour)
                binding.txtDescriptiondetail.text=getString(R.string.detailstepfour_txt_description)}

            5->{listdetailprocess = listOf(getString(R.string.detailstepfive_txt_importantrecommendation),
                getString(R.string.detailstepfive_txt_recommendation1),getString(R.string.detailstepfive_txt_recommendation2)
                ,getString(R.string.detailstepfive_txt_recommendation3),getString(R.string.detailstepfive_txt_recommendation4))
                binding.txtTitledetail.text=getString(R.string.registrationprocess5_txt_TitleStepFive)
                binding.txtDescriptiondetail.text=getString(R.string.detailstepfive_txt_description)}

            6->{listdetailprocess = listOf(getString(R.string.detailstepsix_txt_importantrecommendation),
                getString(R.string.detailstepsix_txt_recommendation1))
                binding.txtTitledetail.text=getString(R.string.registrationprocess6_txt_TitleStepsix)
                binding.txtDescriptiondetail.text=getString(R.string.detailstepsix_txt_description)}

            7->{listdetailprocess = listOf(getString(R.string.detailstepseven_txt_importantrecommendation),
                getString(R.string.detailstepseven_txt_recommendation1),getString(R.string.detailstepseven_txt_recommendation2))
                binding.txtTitledetail.text=getString(R.string.registrationprocess7_txt_TitleStepSeven)
                binding.txtDescriptiondetail.text=getString(R.string.detailstepseven_txt_description)}


            else ->listdetailprocess= listOf("")
        }


        binding.rvDetails.layoutManager = LinearLayoutManager(activity)
        val adapter = com.denariuspak.apoyoulineav2.adapter.SimpleAdapter(listdetailprocess)
        binding.rvDetails.adapter=adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
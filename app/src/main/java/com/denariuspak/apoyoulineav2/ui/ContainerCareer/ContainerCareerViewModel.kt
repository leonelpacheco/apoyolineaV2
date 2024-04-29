package com.denariuspak.apoyoulineav2.ui.ContainerCareer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContainerCareerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
       // value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}
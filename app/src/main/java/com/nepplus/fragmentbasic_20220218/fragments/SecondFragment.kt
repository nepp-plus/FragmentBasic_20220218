package com.nepplus.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.fragmentbasic_20220218.R

class SecondFragment : Fragment() {

//    1. 어떤 xml? - onCreateView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

//    2. 어떤 동작? - onActivityCreated

}
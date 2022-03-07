package com.example.navigationdemo.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_forget.view.*

class ForgetFragment: BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_forget
    }

    override fun initView(rootView: View) {
        rootView.backBtnView.setOnClickListener {
//            findNavController().popBackStack()
            findNavController().navigateUp()
        }
    }
}
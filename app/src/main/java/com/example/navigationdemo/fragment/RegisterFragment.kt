package com.example.navigationdemo.fragment

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_register
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.shared_image)
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toAvatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.to_verify_fragment)
        }
        val userName = arguments?.getString("userName")
        rootView.regUserNameInp.setText(userName)
    }
}
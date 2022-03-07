package com.example.navigationdemo.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_avatar_verify.view.*

class AvatarVerifyFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_avatar_verify
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.avatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.to_login_page)
        }
    }
}
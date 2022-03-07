package com.example.navigationdemo.fragment

import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_login
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toRegisterPage.setOnClickListener {
            //俩个共享元素
            //头像
            val imagePair = Pair<View, String>(userAvatarTv, "userAvatarTn")
            //用户名
            val userNamePair = Pair<View, String>(userNameInp, "userNameTn")
            val extras = FragmentNavigatorExtras(imagePair, userNamePair)
            //数据
            val bundle = Bundle()
            bundle.putString("userName", userNameInp.text.toString())
            //跳转到注册界面
            findNavController().navigate(
                R.id.to_register_page,
                bundle,
                null,
                extras
            )
        }
        rootView.toForgetPage.setOnClickListener {
            //跳转到找回密码界面
            findNavController().navigate(R.id.to_forget_page)
        }
        rootView.toAgreementPage.setOnClickListener {
            val imagePair = androidx.core.util.Pair<View, String>(userAvatarTv, "userAvatarTn")
            val userNamePair = androidx.core.util.Pair<View, String>(userNameInp, "userNameTn")
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                imagePair,userNamePair
            )
            val extras = ActivityNavigator.Extras.Builder()
                .setActivityOptions(options)
                .build()
            //数据
            val bundle = Bundle()
            bundle.putString("userName", userNameInp.text.toString())
            //跳转到观察协议界面
            findNavController().navigate(
                R.id.to_agreement_page,
                bundle, null, extras
            )
        }
    }
}
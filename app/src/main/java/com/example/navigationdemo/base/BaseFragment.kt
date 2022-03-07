package com.example.navigationdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(getLayoutResId(),container,false)
        //初始化view
        initView(rootView)
        return rootView
    }

    open fun initView(rootView: View) {

    }

    abstract fun getLayoutResId(): Int

}
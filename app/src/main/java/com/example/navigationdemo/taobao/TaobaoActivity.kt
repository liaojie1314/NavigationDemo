package com.example.navigationdemo.taobao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdemo.R
import kotlinx.android.synthetic.main.activity_taobao.*

class TaobaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taobao)
        initView()
    }

    private fun initView() {
        //方法一:去fragment管理器中通过id找到NavHostFragment 推荐
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navigate_host_fragment) as NavHostFragment
        bottomNavigationView.setupWithNavController(navHostFragment.navController)
        //方法二；需要把androidx.fragment.app.FragmentContainerView改为fragment
        //val findNavController = findNavController(R.id.navigate_host_fragment)
        //bottomNavigationView.setupWithNavController(findNavController)
    }
}
package com.loguito.clase6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.loguito.clase6.adapters.ViewPagerAdapter
import com.loguito.clase6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val titles = listOf("Todos", "Favoritos", "Favoritos","Favoritos","Favoritos","Favoritos","Favoritos","Favoritos","Favoritos")

    private lateinit var adapter: ViewPagerAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = titles[position]
        }.attach()
    }
}
package com.example.exercicio_coxinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val viewPager by lazy {
        findViewById<ViewPager>(R.id.viewPager)
    }
    private val tlBar by lazy {
        findViewById<TabLayout>(R.id.tlBar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
    }

    private fun initComponents() {
        viewPager.adapter = ViewPagerAdapter(
            listOf(
                getString(R.string.coxinha),
                getString(R.string.snacks),
                getString(R.string.drinks)
            ),
            listOf(
                CoxinhaFragment(),
                SnacksFragment(),
                DrinksFragment()
            ),
            supportFragmentManager
        )

        tlBar.setupWithViewPager(viewPager)
    }
}
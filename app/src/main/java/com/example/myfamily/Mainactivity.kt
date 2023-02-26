package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Mainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        val bottom = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottom.setOnItemSelectedListener { itemid ->
            when (itemid.itemId) {
                R.id.gaurd -> {
                    Inflatefragment(GuardFragment.newInstance())
                }
                R.id.home -> {
                    Inflatefragment(homefragment.newInstance())
                }
                R.id.Dashboard -> {
                    Inflatefragment(dashboard.newInstance())
                }
                R.id.profile -> {
                    Inflatefragment(profile.newInstance())
                }
            }


            true
        }
        bottom.selectedItemId = R.id.home
    }


    private fun Inflatefragment(newInstance:Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container ,newInstance)
        transaction.commit()
    }
}
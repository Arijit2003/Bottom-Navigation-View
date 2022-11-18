package com.example.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavView:BottomNavigationView=findViewById(R.id.bottomNavView)
        bottomNavView.setOnItemSelectedListener { item:MenuItem-> Boolean
            when(item.itemId){
                R.id.home->{
                    Toast.makeText(this,"Clicked Home",Toast.LENGTH_SHORT).show()
                }
                R.id.about->{
                    Toast.makeText(this,"Clicked About Us",Toast.LENGTH_SHORT).show()
                }
                R.id.contact->{
                    Toast.makeText(this,"Clicked Contact Us",Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}
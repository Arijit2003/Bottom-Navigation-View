package com.example.bottomnavigationview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.etebarian.meowbottomnavigation.MeowBottomNavigation


class MainActivity : AppCompatActivity() , ViewPager.OnPageChangeListener{
    private var bottomNavView: MeowBottomNavigation?=null
    private var viewPager:ViewPager?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        )


        bottomNavView=findViewById(R.id.bottomNavView)
        viewPager=findViewById(R.id.viewPager)
        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager!!.adapter=viewPagerAdapter


        bottomNavView!!.add(MeowBottomNavigation.Model(0,R.drawable.ic_home_item))
        bottomNavView!!.add(MeowBottomNavigation.Model(1,R.drawable.ic_contact_item))
        bottomNavView!!.add(MeowBottomNavigation.Model(2,R.drawable.ic_about_item))
        bottomNavView!!.show(0,true)

        viewPager!!.addOnPageChangeListener(this)



        bottomNavView!!.setOnClickMenuListener { listner->
            when(listner.id){
                0-> viewPager!!.currentItem=0
                1-> viewPager!!.currentItem=1
                2-> viewPager!!.currentItem=2
                else-> viewPager!!.currentItem=0
            }
        }
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        when(position){
            0->{
                bottomNavView!!.show(position,true)
            }
            1->{
                bottomNavView!!.show(position,true)
            }
            2->{
                bottomNavView!!.show(position,true)
            }
            else->{
                bottomNavView!!.show(0,true)
            }
        }

    }

    override fun onPageScrollStateChanged(state: Int) {

    }
}
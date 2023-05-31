package com.example.bottomnavigationview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->{

                return HomeFragment()
            }
            1->{

                return ContactFragment()
            }
            2->{

                return AboutFragment()
            }
            else-> {

                return HomeFragment()
            }
        }
    }
}
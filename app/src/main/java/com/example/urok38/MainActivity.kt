package com.example.urok38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.urok38.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),FragmentBListener,FragmentAListener {
  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    override fun setTextToFragmentA(text: String){
        (supportFragmentManager.findFragmentByTag(FragmentA.TAG) as FragmentA).setNewText(text)
    }
    override fun setTextToFragmentB(text: String) {
        (supportFragmentManager.findFragmentByTag(FragmentB.TAG) as FragmentB).setNewText(text)
    }


}
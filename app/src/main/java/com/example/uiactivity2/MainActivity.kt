package com.example.uiactivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.uiactivity2.databinding.ActivityMainBinding
import com.example.uiactivity2.databinding.ApplicationBinding
import com.example.uiactivity2.databinding.EmploymentApplicationBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: EmploymentApplicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EmploymentApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}
package com.example.uiactivity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uiactivity2.databinding.FirstPageBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: FirstPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this@MainActivity,Page2::class.java)
            startActivity(intent)

        }


    }
}
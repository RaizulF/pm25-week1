package com.example.tugasweek1mobile

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasweek1mobile.databinding.ActivityMainBinding
import kotlin.text.isNotEmpty
import kotlin.text.trim

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val name = binding.inputTxt.text.toString().trim()
            if (name.isNotEmpty()){
                binding.textView3.text = getString(R.string.welcome_message, name)
                binding.textView3.visibility = View.VISIBLE
            }else {
                binding.textView3.text = getString(R.string.error_message)
                binding.textView3.visibility = View.VISIBLE
            }
        }
    }
}
package com.example.hw2_month6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw2_month6.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
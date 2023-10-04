package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityNesnesi = this

        viewModel.islemSonuc.observe(this){
            binding.hesaplamaSonucu = it
        }

    }

    fun buttonToplamaTikla(alinanSayi1 : String, alinanSayi2 : String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
    }
    fun buttonCarpmaTikla(alinanSayi1 : String, alinanSayi2 : String){
        viewModel.carpmaYap(alinanSayi1, alinanSayi2)
    }
}
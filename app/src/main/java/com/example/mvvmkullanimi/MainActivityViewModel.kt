package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    var islemSonuc = MutableLiveData("0")
    var mRepo = MatematikRepository()
    fun toplamaYap(alinanSayi1 : String, alinanSayi2 : String){
        CoroutineScope(Dispatchers.Main).launch {       //Dispatchers.Main Arayüz işlemlerinde. : Dispatchers.IO Veritabanı işlemlerinde.
            islemSonuc.value = mRepo.toplamaYap(alinanSayi1,alinanSayi2)
        }
    }
    fun carpmaYap(alinanSayi1 : String, alinanSayi2 : String){
        CoroutineScope(Dispatchers.Main).launch {       //Dispatchers.Main Arayüz işlemlerinde. : Dispatchers.IO Veritabanı işlemlerinde.
            islemSonuc.value = mRepo.carpmaYap(alinanSayi1,alinanSayi2)
        }
    }
}
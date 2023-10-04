package com.example.mvvmkullanimi

class MatematikRepository {
    var mds = MatematikDataSource()

    suspend fun toplamaYap(alinanSayi1 : String, alinanSayi2 : String) : String{
        return mds.toplamaYap(alinanSayi1,alinanSayi2)
    }

    //Tek satırlık return işlemlerinde bunu kullan.
    suspend fun carpmaYap(alinanSayi1 : String, alinanSayi2 : String) : String = mds.carpmaYap(alinanSayi1,alinanSayi2)

}
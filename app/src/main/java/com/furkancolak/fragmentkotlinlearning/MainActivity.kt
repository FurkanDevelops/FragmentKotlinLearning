package com.furkancolak.fragmentkotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.furkancolak.fragmentkotlinlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            //Fragmenta ekleme islemi
            val fragmentManager = supportFragmentManager //  fragman yöneticisne erişim sağlanır
            val fragmentTransaction = fragmentManager.beginTransaction()//islem yapmaya baslıyorum

            val firsFragment= BlankFragment()//fragman adı tanımlandı
            fragmentTransaction.replace(R.id.frameLayout,firsFragment).commit()
            //Yukarıda id olmalı sonra neyi koymak istediğin olmalı add ile ekleme isşlemi yapılır
            // replace = mevcutta varsa onu kaldırır ve yeni fragmentı koyar
            // add = direkt üstüne ekleme yapar
        }
        binding.button2.setOnClickListener{

            val fragmentManager= supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val secondFragment= BlankFragment2()
            fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

        }
    }
}

package com.sohelrana1.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sohelrana1.practice.databinding.ActivityHobbiesBinding

class HobbiesActivity:AppCompatActivity() {
    private lateinit var binding: ActivityHobbiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHobbiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        binding.recyclerView.layoutManager=layoutManager
        val adapter=myAdapter(this,Supplier.hobbies)
        binding.recyclerView.adapter=adapter
    }
}
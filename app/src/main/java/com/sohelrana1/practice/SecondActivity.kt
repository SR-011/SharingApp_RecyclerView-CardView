package com.sohelrana1.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sohelrana1.practice.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle:Bundle?=intent.extras
        val msg=bundle!!.getString("user_Message")
        binding.etRecieveMessage.setText(msg)
    }
}
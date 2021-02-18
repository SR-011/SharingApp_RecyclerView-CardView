package com.sohelrana1.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sohelrana1.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*binding.buShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "It's Okay", Toast.LENGTH_SHORT).show()
        }
        binding.buPassData.setOnClickListener {
            val name:String=binding.etUserName.text.toString()
            val password:String=binding.etPassword.text.toString()
            if(name=="Sohel" && password=="1234") {
                binding.etUserName.setText("Welcome to second activity!")
                val message =binding.etUserName.text.toString()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("user_Message",message)
                startActivity(intent)
            }
        }*/
        binding.buShare.setOnClickListener{
            val msg:String=binding.etShare.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share to"))

        }
        binding.buRecycler.setOnClickListener {
            val intent=Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
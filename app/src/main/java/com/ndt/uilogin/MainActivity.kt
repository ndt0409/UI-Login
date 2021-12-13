package com.ndt.uilogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ndt.uilogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (binding.edtAccount1.text.toString()
                    .equals("Admin") && binding.edtPass1.text.toString().equals("123456")
            ) {
                intent = Intent(this, Secondary::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "sai tai khoan hoac mat khau", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
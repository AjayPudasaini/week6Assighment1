package com.example.softwarica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button
    private var username = "coventry"
    private var password = "softwarica"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            if (checkUserInput())
                {
                    if (etUsername.text.toString() == username && etPassword.text.toString() == password)
                        {
                            val intent = Intent(this, Dashboard::class.java)
                            intent.putExtra("username", username)
                            startActivity(intent)
                            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                        }
                    else
                    {
                        Toast.makeText(this, "invalid username and password", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                }
            else
            {
                return@setOnClickListener
            }


        }
    }



    private fun checkUserInput():Boolean
    {
        var flag = true
        if (TextUtils.isEmpty(etUsername.text))
        {
            etUsername.error = "Enter the username"
            etUsername.requestFocus()
            flag = false
        }
        else if (TextUtils.isEmpty(etPassword.text))
        {
            etPassword.error = "Enter the Password"
            etPassword.requestFocus()
            flag = false
        }

        return flag
    }
}
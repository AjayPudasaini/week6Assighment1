package com.example.softwarica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.softwarica.modal.Student

class Dashboard : AppCompatActivity() {
    private lateinit var btnHome:Button
    private lateinit var btnAddStudent:Button
    private lateinit var btnAbout:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnHome = findViewById(R.id.btnHome)
        btnAddStudent = findViewById(R.id.btnAddStudent)
        btnAbout = findViewById(R.id.btnAbout)


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.linearContainer, ListStudents_fragments())
            addToBackStack(null)
            commit()
        }

        btnHome.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, ListStudents_fragments())
                addToBackStack(null)
                commit()
            }
        }

        btnAddStudent.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, AddStudent_fragments())
                addToBackStack(null)
                commit()
            }
        }


        btnAbout.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, AboutApp_fragments())
                addToBackStack(null)
                commit()
            }
        }

    }



}
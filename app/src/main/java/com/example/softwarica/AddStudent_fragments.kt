package com.example.softwarica

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.softwarica.modal.Student

class AddStudent_fragments : Fragment() {

    private lateinit var etFullName:EditText
    private lateinit var etAge:EditText
    private lateinit var rdoGender:RadioGroup
    private lateinit var rdoMale:RadioButton
    private lateinit var rdoFemale:RadioButton
    private lateinit var rdoOther:RadioButton
    private lateinit var etImgURL: EditText
    private lateinit var etAddress:EditText
    private lateinit var btnSave:Button

    private var gender = ""

    private var listStudents = ArrayList<Student>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_add_student_fragments, container, false)
        etFullName = view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.etAge)
        rdoGender = view.findViewById(R.id.rdoGender)
        rdoMale = view.findViewById(R.id.rdoMale)
        rdoFemale = view.findViewById(R.id.rdoFemele)
        rdoOther = view.findViewById(R.id.rdoOther)
        etImgURL = view.findViewById(R.id.etImgURL)
        etAddress = view.findViewById(R.id.etAddress)
        btnSave = view.findViewById(R.id.btnSave)



        btnSave.setOnClickListener{
            rdoGender.setOnCheckedChangeListener { rdoGender, i ->
                if (i == R.id.rdoMale) {
                    gender = "Male"
                }
                if (i == R.id.rdoFemele) {
                    gender = "Female"
                }
                if (i == R.id.rdoOther) {
                    gender = "Others"
                }
            }

            val studentName = etFullName.text.toString()
            val studentAge = etAge.text.toString().toInt()
            val studentAddress = etAddress.text.toString()
            val studentImage = etImgURL.text.toString()

            val students = Student(studentImage, studentName, studentAge, studentAddress, gender)
            listStudents.add(students)
            Toast.makeText(context, "New Student added", Toast.LENGTH_SHORT).show()

        }




        return view


    }



    private fun checkFieldInput():Boolean
    {
        var flag = true

        when {
            TextUtils.isEmpty(etFullName.text) -> {
                etFullName.error = "Please enter full name"
                etFullName.requestFocus()
                flag=false
            }
            TextUtils.isEmpty(etAge.text) -> {
                etAge.error = "please enter age"
                etAge.requestFocus()
                flag=false
            }
            TextUtils.isEmpty(etImgURL.text) -> {
                etImgURL.error = "please enter image url"
                etImgURL.requestFocus()
                flag=false
            }
        }

        return flag
    }



    private fun radioGroupListner()
    {

    }

}
package com.example.softwarica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softwarica.adapter.StudentAdapter
import com.example.softwarica.modal.Student


class ListStudents_fragments : Fragment() {
    private var listStudents = ArrayList<Student>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list_students_fragments, container, false)
        recyclerView = view.findViewById(R.id.listUsers)



        staticStudent()

        val adapter = StudentAdapter(listStudents, view.context)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = adapter

        return view

    }


    private fun staticStudent()
    {
        listStudents.add(Student(studentName = "Ajay Pudasaini",
                studentImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwebmeup.com%2Fblog%2Fstock-images-to-avoid.html&psig=AOvVaw2S0fai9czf6FGkd2iyJGHl&ust=1609228529760000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCyjMuZ8O0CFQAAAAAdAAAAABAD",
                studentAddress = "Kathmandu", studentAge = 20, studentGender = "MALE"))


        listStudents.add(Student(studentName = "Bijay Pudasaini",
                studentImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwebmeup.com%2Fblog%2Fstock-images-to-avoid.html&psig=AOvVaw2S0fai9czf6FGkd2iyJGHl&ust=1609228529760000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCyjMuZ8O0CFQAAAAAdAAAAABAD",
                studentAddress = "Kathmandu", studentAge = 25, studentGender = "MALE"))


        listStudents.add(Student(studentName = "Hardik Gurung",
                studentImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwebmeup.com%2Fblog%2Fstock-images-to-avoid.html&psig=AOvVaw2S0fai9czf6FGkd2iyJGHl&ust=1609228529760000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCyjMuZ8O0CFQAAAAAdAAAAABAD",
                studentAddress = "Kathmandu", studentAge = 20, studentGender = "MALE"))


        listStudents.add(Student(studentName = "Jeniish Shrestha",
                studentImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwebmeup.com%2Fblog%2Fstock-images-to-avoid.html&psig=AOvVaw2S0fai9czf6FGkd2iyJGHl&ust=1609228529760000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCyjMuZ8O0CFQAAAAAdAAAAABAD",
                studentAddress = "Kathmandu", studentAge = 25, studentGender = "MALE"))


    }




}
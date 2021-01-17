package com.example.softwarica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.softwarica.ListStudents_fragments
import com.example.softwarica.R
import com.example.softwarica.modal.Student

class StudentAdapter(val listStudents:ArrayList<Student>, val context: Context):
        RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(view: View):RecyclerView.ViewHolder(view)
    {
        val imgProfile : ImageView
        val tvName : TextView
        val tvAge : TextView
        val tvAddress : TextView
        val tvGender : TextView
        val btnDelete : Button


        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAge = view.findViewById(R.id.tvAge)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvGender = view.findViewById(R.id.tvGender)
            btnDelete = view.findViewById(R.id.btnDelete)


        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student, parent, false)

        return StudentViewHolder(view)

    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val students = listStudents[position]
        holder.tvName.text = students.studentName
        holder.tvAge.text = students.studentAge.toString()
        holder.tvAddress.text = students.studentAddress
        holder.tvGender.text = students.studentGender


        Glide.with(context).load(students.studentImage).into(holder.imgProfile)



        holder.btnDelete.setOnClickListener{
            listStudents.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, listStudents.size)

        }


    }

    override fun getItemCount(): Int {

        return listStudents.size
    }


}
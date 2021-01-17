package com.example.softwarica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class AboutApp_fragments : Fragment() {

    var webView : WebView? = null
    private lateinit var showWebsite:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_about_app_fragments, container, false)
        showWebsite = view.findViewById(R.id.showWebsite)

        showWebsite.loadUrl("https://softwarica.edu.np")

        return view




    }





}
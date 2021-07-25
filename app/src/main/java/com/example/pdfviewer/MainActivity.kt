package com.example.pdfviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity()
{
    private lateinit var pdf : PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pdf = findViewById(R.id.pdfViewer)
        pdf.fromAsset("android.pdf").load()
    }
}
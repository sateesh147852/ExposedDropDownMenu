package com.exposeddropdownmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.exposeddropdownmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val days = arrayOf("Sunday","Monday","Tuesday","Wednesday","friday","saturday")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize() {

        val languages = resources.getStringArray(R.array.languages)
        val arrayAdapter = ArrayAdapter(this,R.layout.drop_down_layout,days)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
        binding.autoCompleteTextView.setOnItemClickListener { p0, p1, p2, p3 ->
            Toast.makeText(this,days[p2],Toast.LENGTH_SHORT).show()
        }
    }




}
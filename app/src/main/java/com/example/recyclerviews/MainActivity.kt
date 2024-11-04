package com.example.recyclerviews

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val names = listOf("Anne", "Bernice", "Caro", "Diana", "Edith", "Faith", "Gina", "Hellen",
            "Ivy", "Mitchell","Terry", "Amukoa","Fred","Francis","Cee","Kash","Trezah","Loise","Laura","Zuri","Wambo","Latifa","Megan","Bruce","Sir.Jay","Jacinta","Mwende","Genesis",
        "Nairat","Marsian","Tuukuo","Pinkie","Wason","West")
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter = namesAdapter
        }
    }

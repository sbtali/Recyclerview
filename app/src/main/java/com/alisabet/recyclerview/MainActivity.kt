package com.alisabet.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val models = ArrayList<Model>()

        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))
        models.add(Model("ali", "sabet"))
        models.add(Model("reza", "sabet"))
        models.add(Model("mohsen", "sabet"))
        models.add(Model("hasan", "sabet"))
        models.add(Model("mamad", "sabet"))

        var adapter = RecyclerViewAdapter(models)
        recyclerview.adapter = adapter

    }
}

package com.testapp.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val meals = listOf<Meals>(
        Meals("rice beef", "Mike"),
        Meals("Pilau", "Zavian"),
        Meals( "Ugali Managu", "Nicole"),
        Meals( "Fish", "Andrew"),
        Meals("Nyama choma", "Susan"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recycleView.setBackgroundColor(Color.LTGRAY)
        recycleView.layoutManager = LinearLayoutManager(this)
        // An adapter instance
        recycleView.adapter = MyRecyclerViewAdapter(meals)


    }
}
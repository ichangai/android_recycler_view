package com.testapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Adapter class
class MyRecyclerViewAdapter(val meals:List<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent, false)
        return MyViewHolder(listItem)
    }

    //These is where the data for the items is binded
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //We declared it inside the viewHolder class
        val meal = meals[position]
    holder.myTextView.text = meal
    }

    //These are the number of items to be displayed
    //This will call the onBindviewholder 5 times
    override fun getItemCount(): Int {
        return meals.size
    }

}

//view holder class
class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
    val myTextView = view.findViewById<TextView>(R.id.name)
}

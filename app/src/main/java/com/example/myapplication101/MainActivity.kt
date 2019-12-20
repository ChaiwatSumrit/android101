package com.example.myapplication101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items = ArrayList<String>()
    var adapter : ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add("Hello")
        items.add("World")

        adapter = ArrayAdapter<String>( this,
            android.R.layout.simple_list_item_1,
            items)

        itemListView.adapter = adapter
    }

    fun sayGoodBye(view: View) {
        textView.text = "Good bye Genesis"
//        val textView: TextView = findViewById(R.id.text_view)

//        textView.text = "Good bye Genesis"
        val msg = itemEditText.text.toString()
        itemEditText.text.clear()
        Toast.makeText(this,
                msg,
                Toast.LENGTH_LONG).show()
        adapter?.add(msg)
//        items.add(msg)
//        adapter?.notifyDataSetChanged()
//        adapter!!.notifyDataSetChanged()
    }
}

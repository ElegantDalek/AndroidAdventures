package com.example.androidadventures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.CollapsingToolbarLayout

class InfoActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val title = intent.getStringExtra(TITLE_INTENT)
        val toolbarLayout: CollapsingToolbarLayout = findViewById(R.id.collapsing_toolbar_layout)
        toolbarLayout.title = title

        val mDataset = listOf( "test", "test1", "test2", "testd", "test5", "test", "test", "test", "test", "test", "test", "test")

        viewManager = LinearLayoutManager(this)
        viewAdapter = MainAdapter(mDataset)

        recyclerView = findViewById<RecyclerView>(R.id.info_recyclerview).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}

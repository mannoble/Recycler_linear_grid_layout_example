package com.bk.recycler_linear_grid_layout_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bk.recycler_linear_grid_layout_example.dataSource.DataSource
import com.bk.recycler_linear_grid_layout_example.viewAdapter.RecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //GridLayout button
        val btnGridLayout: Button = findViewById(R.id.btn_grid_layout)
        btnGridLayout.setOnClickListener { getGridLayout(btnGridLayout) }

        //LinearLayout Vertical
        val btnLinearView:Button = findViewById(R.id.btn_linear_layout_vertical)
        btnLinearView.setOnClickListener { getLinearLayoutVertical(btnLinearView) }

        //LinearLayout Horizontal
        val btnLinearViewHorizontal: Button = findViewById(R.id.btn_linear_layout_horizontal)
        btnLinearViewHorizontal.setOnClickListener { getLinearLayoutHorizontal(btnLinearViewHorizontal) }

    }

    private fun getGridLayout(btnGridView: Button){
        println("You are in ger Gridlayout ---------")
        val gridData = DataSource().loadDataResource()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val lineContainerView = findViewById<LinearLayout>(R.id.liner_container_id)

        recyclerView.canScrollVertically(RecyclerView.VERTICAL)
        var gridLayoutManager:GridLayoutManager = GridLayoutManager(this, 2)
        gridLayoutManager.orientation = RecyclerView.VERTICAL


        recyclerView.adapter = RecyclerViewAdapter(this, gridData)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager=Grid
        btnGridView.visibility = View.INVISIBLE
        lineContainerView.visibility = View.INVISIBLE
    }
    private fun getLinearLayoutVertical(btnLinearView: Button){
        val linearData = DataSource().loadDataResource()
        val lineContainerView = findViewById<LinearLayout>(R.id.liner_container_id)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.canScrollVertically(RecyclerView.VERTICAL)
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL

        recyclerView.adapter = RecyclerViewAdapter(this, linearData)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.setHasFixedSize(true)

        lineContainerView.visibility = View.INVISIBLE
        btnLinearView.visibility = View.INVISIBLE


    }
    private fun getLinearLayoutHorizontal(btnLinearView: Button){
        val linearData = DataSource().loadDataResource()
        val lineContainerView = findViewById<LinearLayout>(R.id.liner_container_id)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.canScrollHorizontally(RecyclerView.HORIZONTAL)
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.HORIZONTAL

        recyclerView.adapter = RecyclerViewAdapter(this, linearData)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.setHasFixedSize(true)
        lineContainerView.visibility = View.INVISIBLE
        btnLinearView.visibility = View.INVISIBLE


    }


}
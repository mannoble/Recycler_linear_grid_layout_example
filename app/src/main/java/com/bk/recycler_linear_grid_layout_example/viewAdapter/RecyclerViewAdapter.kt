package com.bk.recycler_linear_grid_layout_example.viewAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bk.recycler_linear_grid_layout_example.R
import com.bk.recycler_linear_grid_layout_example.dataModel.DataModel

class RecyclerViewAdapter(
    private val context:Context,
    private val dataset:List<DataModel>
): RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder>(){
    /**
     * provide a reference to the views for each data item
     * complex data items may need more than one view per item, and
     * Provide an access to all the views for a data item in a view holder.
     * Each data item is just a DataModel object
     */

    class DataViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.txt_src_id)
        val imgView: ImageView = view.findViewById(R.id.img_rsc_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        //parent: the view list wil attached to which is [RecyclerView]
        //viewType: when you different view type
        //Create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_container_layout, parent, false)
        return DataViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
       val item = dataset[position]
        holder.textView.text = context.resources.getString(item.text_src_id)
        holder.imgView.setImageResource(item.image_src_id)
    }

    override fun getItemCount() = dataset.size

}
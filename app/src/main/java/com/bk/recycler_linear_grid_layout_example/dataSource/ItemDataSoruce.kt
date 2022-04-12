package com.bk.recycler_linear_grid_layout_example.dataSource

import com.bk.recycler_linear_grid_layout_example.R
import com.bk.recycler_linear_grid_layout_example.dataModel.DataModel

class DataSource() {
    fun loadDataResource(): List<DataModel> {
        return listOf<DataModel>(
            DataModel(R.drawable._img_1, R.string._rcs_1),
            DataModel(R.drawable._img_2, R.string._rcs_2),
            DataModel(R.drawable._img_3, R.string._rcs_3),
            DataModel(R.drawable._img_4, R.string._rcs_4),
            DataModel(R.drawable._img_5, R.string._rcs_5),
            DataModel(R.drawable._img_6, R.string._rcs_6),
            DataModel(R.drawable._img_7, R.string._rcs_7),
            DataModel(R.drawable._img_8, R.string._rcs_8),
            DataModel(R.drawable._img_9, R.string._rcs_9),
            DataModel(R.drawable._img_10, R.string._rcs_10),

            )
    }
}
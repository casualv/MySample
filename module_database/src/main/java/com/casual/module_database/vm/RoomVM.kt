package com.casual.module_database.vm

import com.casual.baseframe.base.BFModel
import com.casual.baseframe.utils.Utils
import com.casual.module_database.room.AppDatabase
import com.casual.module_database.room.RoomData
import com.casual.module_database.room.RoomDataDao

class RoomVM : BFModel() {
    var index = 0L
    val roomDataDao by lazy {
        AppDatabase.getInstance(context = Utils.getContext()).roomDataDao()
    }

    fun insertData() {
        roomDataDao.addItem(RoomData().apply {
            dataId = index
            this.dataContent = "新增数据-$index"
        })
        index++
    }
    fun getData(){
      val b=  roomDataDao.getAll()
        "aa"
    }
    fun deleteData(){
        roomDataDao.deleteALL()
        
    }

}
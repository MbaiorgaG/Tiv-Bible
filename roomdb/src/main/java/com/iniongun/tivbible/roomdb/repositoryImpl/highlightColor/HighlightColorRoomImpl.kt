package com.iniongun.tivbible.roomdb.repositoryImpl.highlightColor

import com.iniongun.tivbible.entities.HighlightColor
import com.iniongun.tivbible.repository.room.highlightColor.IHighlightColorRoom
import com.iniongun.tivbible.roomdb.dao.HighlightColorDao
import javax.inject.Inject

/**
 * Created by Isaac Iniongun on 2019-11-25
 * For Tiv Bible project
 */

class HighlightColorRoomImpl @Inject constructor(
    private val highlightColorDao: HighlightColorDao
): IHighlightColorRoom {

    override fun getAllHighlightColors() = highlightColorDao.getAllHighlightColors()

    override fun getHighlightColorById(highlightColorId: String) = highlightColorDao.getHighlightColorById(highlightColorId)

    override fun insertHighlightColors(highlightColors: List<HighlightColor>) = highlightColorDao.insertHighlightColors(highlightColors)

    override fun deleteHighlightColors(highlightColors: List<HighlightColor>) = highlightColorDao.deleteHighlightColors(highlightColors)

}
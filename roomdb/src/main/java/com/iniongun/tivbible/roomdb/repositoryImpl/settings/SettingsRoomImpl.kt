package com.iniongun.tivbible.roomdb.repositoryImpl.settings

import com.iniongun.tivbible.entities.Setting
import com.iniongun.tivbible.repository.room.settings.ISettingsRoom
import com.iniongun.tivbible.roomdb.dao.SettingDao
import javax.inject.Inject

/**
 * Created by Isaac Iniongun on 2019-11-25
 * For Tiv Bible project
 */

class SettingsRoomImpl @Inject constructor(
    private val settingDao: SettingDao
): ISettingsRoom {

    override fun getAllSettings() = settingDao.getAllSettings()

    override fun getSettingById(settingId: String) = settingDao.getSettingById(settingId)

    override fun insertSettings(settings: List<Setting>) = settingDao.insertSettings(settings)

    override fun deleteSettings(settings: List<Setting>) = settingDao.deleteSettings(settings)
}
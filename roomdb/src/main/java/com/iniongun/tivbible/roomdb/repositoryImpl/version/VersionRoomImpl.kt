package com.iniongun.tivbible.roomdb.repositoryImpl.version

import com.iniongun.tivbible.entities.Version
import com.iniongun.tivbible.repository.room.version.IVersionRoom
import com.iniongun.tivbible.roomdb.dao.VersionDao
import javax.inject.Inject

/**
 * Created by Isaac Iniongun on 2019-11-25
 * For Tiv Bible project
 */

class VersionRoomImpl @Inject constructor(
    private val versionDao: VersionDao
): IVersionRoom {

    override fun getAllVersions() = versionDao.getAllVersions()

    override fun getVersionById(versionId: String) = versionDao.getVersionById(versionId)

    override fun insertVersions(versions: List<Version>) = versionDao.insertVersions(versions)

    override fun deleteVersions(versions: List<Version>) = versionDao.deleteVersions(versions)

}
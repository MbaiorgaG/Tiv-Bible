package com.iniongun.tivbible.localdb.dao

import androidx.room.*
import com.iniongun.tivbible.entities.AudioSpeed
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by Isaac Iniongun on 2019-11-18
 * For Tiv Bible project
 */

@Dao
interface AudioSpeedDao {

    @Query("select * from AudioSpeed")
    fun getAllAudioSpeeds(): Observable<List<AudioSpeed>>

    @Query("select * from AudioSpeed where id = :audioSpeedId limit 1")
    fun getAudioSpeedById(audioSpeedId: String): Single<AudioSpeed>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAudioSpeeds(audioSpeeds: List<AudioSpeed>): Maybe<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAudioSpeeds(vararg audioSpeeds: AudioSpeed): Completable

    @Delete
    fun deleteAudioSpeeds(audioSpeeds: List<AudioSpeed>): Single<Int>

}
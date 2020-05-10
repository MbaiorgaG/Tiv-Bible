package com.iniongun.tivbible.reader.more.highlights

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.iniongun.tivbible.common.base.BaseViewModel
import com.iniongun.tivbible.common.utils.liveDataEvent.LiveDataEvent
import com.iniongun.tivbible.common.utils.rxScheduler.SchedulerProvider
import com.iniongun.tivbible.common.utils.rxScheduler.subscribeOnIoObserveOnUi
import com.iniongun.tivbible.entities.Highlight
import com.iniongun.tivbible.entities.Setting
import com.iniongun.tivbible.repository.preference.IAppPreferencesRepo
import com.iniongun.tivbible.repository.room.highlight.IHighlightRepo
import com.iniongun.tivbible.repository.room.settings.ISettingsRepo
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import javax.inject.Inject

/**
 * Created by Isaac Iniongun on 09/05/2020.
 * For Tiv Bible project.
 */

class HighlightsViewModel @Inject constructor(
    private val highlightsRepo: IHighlightRepo,
    private val settingsRepo: ISettingsRepo,
    private val appPreferencesRepo: IAppPreferencesRepo,
    private val schedulerProvider: SchedulerProvider
) : BaseViewModel() {

    private val _highlights = MutableLiveData<List<Highlight>>()
    val highlights: LiveData<List<Highlight>> = _highlights

    private val _settings = MutableLiveData<Setting>()
    val settings: LiveData<Setting> = _settings

    private val _showReaderModule = MutableLiveData<LiveDataEvent<Boolean>>()
    val showReaderModule: LiveData<LiveDataEvent<Boolean>> = _showReaderModule

    init {
        getBookmarksAndSettings()
    }

    private fun getBookmarksAndSettings() {
        postLoadingState()
        compositeDisposable.add(
            Observable.zip(
                settingsRepo.getAllSettings(),
                highlightsRepo.getAllHighlights(),
                BiFunction<List<Setting>, List<Highlight>, Pair<List<Setting>, List<Highlight>>> { settings, bookmarks -> Pair(settings, bookmarks) }
            ).subscribeOnIoObserveOnUi(schedulerProvider, {
                removeLoadingState()
                _settings.value = it.first.first()
                _highlights.value = it.second
            }) { removeLoadingState() }
        )
    }

    fun handleHighlightSelected(highlight: Highlight) {
        appPreferencesRepo.currentVerse = highlight.verse
        appPreferencesRepo.currentChapter = highlight.chapter
        appPreferencesRepo.currentBook = highlight.book
        _showReaderModule.value = LiveDataEvent(true)
    }

    override fun handleCoroutineException(throwable: Throwable) {
        postFailureNotification(throwable.message)
    }

}
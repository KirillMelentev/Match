package com.msuper.match.ui.main_screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.msuper.match.domain.models.AllData
import com.msuper.match.domain.usecases.GetAllDataUseCase
import com.msuper.match.utils.Event
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getAllDataUseCase: GetAllDataUseCase
) : ViewModel() {

    val allDataLiveData: LiveData<Event<AllData>> = liveData {
        val data = getAllDataUseCase.execute()
        emit(Event(data))
    }

}
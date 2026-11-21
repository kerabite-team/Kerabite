package io.github.kerabiteteam.kerabite.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.github.kerabiteteam.kerabite.data.settings.AppLanguage
import io.github.kerabiteteam.kerabite.data.settings.AppSettingsRepository
import kotlinx.coroutines.flow.StateFlow

class SettingsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = AppSettingsRepository.getInstance(application)

    val darkMode: StateFlow<Boolean> = repository.darkMode
    val language: StateFlow<AppLanguage> = repository.language

    fun setDarkMode(enabled: Boolean) = repository.setDarkMode(enabled)

    fun setLanguage(language: AppLanguage) = repository.setLanguage(language)
}

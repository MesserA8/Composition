package com.messer_amd.composition.domain.usecases

import com.messer_amd.composition.domain.entity.GameSettings
import com.messer_amd.composition.domain.entity.Level
import com.messer_amd.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
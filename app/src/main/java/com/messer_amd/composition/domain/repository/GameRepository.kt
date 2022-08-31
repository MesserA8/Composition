package com.messer_amd.composition.domain.repository

import com.messer_amd.composition.domain.entity.GameSettings
import com.messer_amd.composition.domain.entity.Level
import com.messer_amd.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
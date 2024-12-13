package com.sina.service.forground

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class Counter : ViewModel() {
    private var counterValue: Int = 0
    private var isRunning: Boolean = true

    fun start() = flow {
        while (isRunning) {
            emit(counterValue)
            delay(1000)
            counterValue++
        }
    }

    fun stop() {
        isRunning = false
        counterValue = 0
    }
}
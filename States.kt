package com.example.exui

data class State(val counter: Int = 0)

interface StateListener {
    fun onStateChanged(newState: State)
}

class StateManager(private val listener: StateListener) {
    var state: State = State()
        set(value) {
            field = value
            listener.onStateChanged(value)
        }
}

class CounterComponent(private val stateManager: StateManager) : Component() {
    override fun render(): String {
        return "<button onclick='increment()'>${stateManager.state.counter}</button>"
    }

    fun increment() {
        stateManager.state = stateManager.state.copy(counter = stateManager.state.counter + 1)
    }
}
package com.example.exui

interface EventHandler {
    fun handleEvent(event: Event)
}

sealed class Event {
    class ClickEvent(val target: Component) : Event()
    // Add other event types as needed
}

// Example usage:
class bbutton(val text: String, val onClick: EventHandler? = null) : Component() {
    override fun render(): String {
        return "<button onclick='${handleOnClick()}'>$text</button>"
    }

    private fun handleOnClick(): String {
        return "javascript:void(0);" // Handle click event here
    }
}

class MyEventHandler : EventHandler {
    override fun handleEvent(event: Event) {
        when (event) {
            is Event.ClickEvent -> println("Button clicked!")
            // Handle other event types
            is Event.ClickEvent -> TODO()
        }
    }
}

// ...

val buton = Button("Click me", onClick = MyEventHandler())

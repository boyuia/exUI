package com.example.exui

data class ComponentNode(val component: Component, val children: List<ComponentNode>)

open class Component {
    open fun render(): String {
        return ""
    }
}

class Button(val text: String) : Component() {
    override fun render(): String {
        return "<button>$text</button>"
    }
}

class TextField(val label: String) : Component() {
    override fun render(): String {
        return "<input type='text' placeholder='$label'>"
    }
}

// ... other components

// Rendering engine example (simplified)
fun renderComponentTree(root: ComponentNode): String {
    val html = StringBuilder()
    root.component.render().let { html.append(it) }
    root.children.forEach { child -> html.append(renderComponentTree(child)) }
    return html.toString()
}

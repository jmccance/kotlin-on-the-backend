package demo.domain

import java.time.Instant

data class Widget(
    val id: Long,
    val color: WidgetColor,
    val createdAt: Instant
)

enum class WidgetColor {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

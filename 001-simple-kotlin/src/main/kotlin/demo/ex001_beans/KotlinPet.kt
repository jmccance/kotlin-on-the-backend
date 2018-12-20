package demo.ex001_beans

import java.time.LocalDate

data class KotlinPet(
    val id: Long,
    val name: String,
    val lastVisit: LocalDate?
)


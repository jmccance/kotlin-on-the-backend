plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.1.0-alpha")
}

application {
    mainClassName = "demo.AppKt"
}

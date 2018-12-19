plugins {
    application

    kotlin("jvm")
}

application {
    mainClassName = "demo.AppKt"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

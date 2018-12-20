plugins {
    kotlin("jvm")
    application
}

dependencies {
    compile("io.dropwizard", "dropwizard-core", "1.3.7")
    // Doesn't seem to be needed
//    compile("com.fasterxml.jackson.module", "jackson-module-kotlin", "2.9.8")
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClassName = "demo.AppKt"
}

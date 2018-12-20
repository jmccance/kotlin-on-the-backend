plugins {
    application

    kotlin("jvm")
}

application {
    mainClassName = "io.ktor.server.netty.EngineMain"
}

dependencies {
    compile("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310", "2.9.8")
    compile("io.ktor", "ktor-jackson", "1.0.1")
    compile("io.ktor", "ktor-server-netty", "1.0.1")
    compile("org.apache.logging.log4j", "log4j-api", "2.11.1")
    compile("org.apache.logging.log4j", "log4j-core", "2.11.1")
    compile("org.apache.logging.log4j", "log4j-slf4j-impl", "2.11.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

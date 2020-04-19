import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

version = "1.0.0"

val ktorVersion = "1.2.3"

plugins {
    kotlin("jvm") version "1.3.41"
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-locations:$ktorVersion")
    implementation("io.ktor:ktor-jackson:$ktorVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

//tasks.named<JavaExec>("run") {
//    args = listOf("-config=src/main/resources/application-local.conf")
//}
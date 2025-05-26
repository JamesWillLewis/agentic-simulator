plugins {
    application
    id("java")
}

group = "org.agenticsim"
version = "1.0-SNAPSHOT"

application {
    mainClass = "com.agenticsim.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.17.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

plugins {
    application
}

group = "me.ananev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.6.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.getByName<Test>("test") {
    useTestNG()
}

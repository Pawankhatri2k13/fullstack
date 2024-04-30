plugins {
	java
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.asciidoctor.convert") version "1.5.3"
	id("org.hidetake.swagger.generator") version "1.4.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-integration")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.integration:spring-integration-http")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.integration:spring-integration-test")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.3")
	implementation("io.springfox:springfox-swagger2:2.8.0")
	implementation("io.springfox:springfox-swagger-ui:2.8.0")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
ext {
	//If i want to use database then will configure it here or we can do it into .properties file also
	//dbUrl = 'jdbc:mysql://localhost:3306/mydatabase'
	//dbUsername = 'myusername'
	//dbPassword = 'mypassword'
}

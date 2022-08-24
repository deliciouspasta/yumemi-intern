import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.6"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

//	implementation("org.mybatis:mybatis:3.5.6")
//	implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.2.1")
	implementation("mysql:mysql-connector-java:8.0.23")
//	mybatisGenerator("org.mybatis.generator:mybatis-generator-core:1.4.0")

//	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//
	implementation("mysql:mysql-connector-java:8.0.23")

	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-devtools")
	implementation("org.projectlombok:lombok")
	implementation("org.springframework.boot:spring-boot-starter-tomcat")

//
//	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.4")
//
//	implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.2.1")
//	mybatisGenerator("org.mybatis.generator:mybatis-generator-core:1.4.0")
//
//	implementation("org.springframework.boot:spring-boot-starter-security")
//
//
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

plugins {
    // https://kotlinlang.org/docs/gradle-configure-project.html
    kotlin("jvm") version "2.1.0"
    antlr
}

tasks.generateGrammarSource {
    // set output directory to some arbitrary location in `/build` directory.
    // by convention `/build/generated/sources/main/java/<generator name>` is often used
    outputDirectory = file("${project.buildDir}/generated/sources/main/java/antlr")

}

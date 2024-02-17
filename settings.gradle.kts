plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "spring-module"
include("module-api")
include("module-core")
include("module-domain")
include("module-utils")

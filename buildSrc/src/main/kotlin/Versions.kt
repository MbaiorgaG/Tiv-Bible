
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlinx_kotlinx_coroutines: String = "1.3.3"

    const val androidx_test_espresso: String = "3.2.0"

    const val androidx_databinding: String = "3.5.3"

    const val org_jetbrains_kotlin: String = "1.3.61"

    const val androidx_navigation: String = "2.1.0"

    const val com_google_dagger: String = "2.25.3"

    const val org_junit_jupiter: String = "5.5.2"

    const val androidx_room: String = "2.2.3"

    const val androidx_test: String = "1.2.0"

    const val android_arch_persistence_room_testing: String = "2.2.3"

    const val com_android_tools_build_gradle: String = "3.5.3"

    const val androidx_test_ext_junit: String = "1.1.1"

    const val androidx_core_core_ktx: String = "1.1.0"

    const val junit_junit: String = "4.12"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val constraintlayout: String = "1.1.3"

    const val org_jacoco_agent: String = "0.7.9"

    const val org_jacoco_core: String = "0.8.5"

    const val android_junit5: String = "1.5.1.0" // available: "1.5.2.0"

    const val org_jacoco_ant: String = "0.7.9" // available: "0.8.5"

    const val commons_lang3: String = "3.9"

    const val core_testing: String = "2.1.0"

    const val hamcrest_all: String = "1.3"

    const val javax_inject: String = "1"

    const val lint_gradle: String = "26.5.3"

    const val robolectric: String = "4.3.1"

    const val threetenabp: String = "1.2.1"

    const val jsr250_api: String = "1.0" // available: "1.0-20050927.133100"

    const val threetenbp: String = "1.4.0"

    const val appcompat: String = "1.1.0"

    const val rxandroid: String = "2.1.1"

    const val material: String = "1.1.0-alpha10"

    const val rxjava: String = "2.2.16"

    const val aapt2: String = "3.5.3-5435860"

    const val mockk: String = "1.9.3"

    const val gson: String = "2.8.6"

    /**
     * Current version: "6.0.1"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.0.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)

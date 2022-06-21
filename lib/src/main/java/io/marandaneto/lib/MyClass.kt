package io.marandaneto.lib

import java.nio.charset.StandardCharsets

object MyClass {
//    fun test(): String = "my test"

    // IDE shows:
    // Field requires API level 19 (current min is 16): java.nio.charset.StandardCharsets#UTF_8

    // Lint warns:
    // Warning: Lint will treat :lib as an external dependency and not analyze it.
    // * Recommended Action: Apply the 'com.android.lint' plugin to java library project :lib. to enable lint to analyze those sources.
    fun test(): String = StandardCharsets.UTF_8.toString()
}
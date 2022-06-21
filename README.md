# NewApiLintTest

Sample showing off the `NewApi` (AGP) bug with JVM dependencies.

Lint is enabled in the Android project, See [config](https://github.com/marandaneto/NewApiLintTest/blob/ad6ae35f92b581a25d7e6fc5074362d1e99c9c22/app/build.gradle#L32-L38).

Lint throws `NewApi` violation if it finds usage of new APIs in the Android project, See [code](https://github.com/marandaneto/NewApiLintTest/blob/ad6ae35f92b581a25d7e6fc5074362d1e99c9c22/app/src/main/java/io/marandaneto/newapilinttest/MainActivity.kt#L13-L15).

IDE warns that you're using a new API in the Java library, See [code](https://github.com/marandaneto/NewApiLintTest/blob/ad6ae35f92b581a25d7e6fc5074362d1e99c9c22/lib/src/main/java/io/marandaneto/lib/MyClass.kt#L8-L9).

Lint warns that the Java library has to apply the `Lint` plugin as well, See [code](https://github.com/marandaneto/NewApiLintTest/blob/ad6ae35f92b581a25d7e6fc5074362d1e99c9c22/lib/src/main/java/io/marandaneto/lib/MyClass.kt#L11-L14).

Lint is applied in the Java library as recommended, See [code](https://github.com/marandaneto/NewApiLintTest/blob/ad6ae35f92b581a25d7e6fc5074362d1e99c9c22/lib/build.gradle#L4-L20).

Running `./gradlew lint` is still not throwing because of `NewApi` violation in the Java library.

# Config

AGP: 7.2.1
Gradle: 7.3.3

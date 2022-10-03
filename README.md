```shell
./gradlew clean test
```

The issue only exists in kotlin 2.0.x with "-language-version=2.0" (default).

The issue DOES NOT present in kotlin compiler 1.9.x with "-language-version=2.0".

The issue DOES NOT present in kotlin compiler 2.0.x with "-language-version=1.9".

# Quarkus env var in application.properties with gradle reproducer


## Creating a native executable

You can create a native executable using: 
```shell script
unset BANNER # just to be sure
./gradlew build -Dquarkus.package.type=native
```

Run the application:
```shell script
./build/command-mode-quickstart-gradle-1.0.0-SNAPSHOT-runner
```

&rarr; header is NOT shown

Set env var `BANNER` and run the application:
```shell script
set BANNER=true
./build/command-mode-quickstart-gradle-1.0.0-SNAPSHOT-runner
```

&rarr; header is NOT shown although env var is set

### Cómo usar

1. Agregue maven a su proyecto, diríjase a su archivo settings.gradle.kts, haga que se vea similar a esto:

```
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven (url = "https://jitpack.io" )
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven (url = "https://jitpack.io" )
    }
}
```
2. Use la dependencia en su gradle a nivel de app, o donde necesite la dependencia:
```
implementation("com.github.compose-projects-android:CPA-Components:1.0.0-alpha")
```

3. Llame a nuestros componentes CPA:

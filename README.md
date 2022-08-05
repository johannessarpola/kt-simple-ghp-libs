# Useless libs to test Github packages

Utility of the libs is non-existent. Just a PoC to test how the GIthub packages work as a maven repository.

This is a simple repository to contain a multimodule build with Kotlin DSL
gradle to push libs to Github Packages Maven repository.

Modules are called `hash` and `strings` which use Guava and lang3. 

Authentication can use the ~HOME/.gradle/gradle.properties or just run on CI with
the inbuilt env token


```yaml
    env:
      GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
      GITHUB_USERNAME: johannessarpola
```

**CI is run with drafting a release on Github and versions should be manually updated to gradle.properties for now**
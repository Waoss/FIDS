# FIDS
## Functional Interfaces Don't Stop
This library is intended to provide utility functional interfaces similar to the ones in <code>java.util.function</code>.
It also contains a few classes that are just utility but not really *functional interfaces*
At present it contains the following :
* TriFunction
* TriConsumer
* TriPredicate
* Triplet
* QuadriFunction
* QuadriConsumer
* QuadriPredicate
* Pair
## Releases
Goto releases and see the latest release, or download it from [here](https://github.com/Waoss/FIDS/releases/download/1.1/util.fids-1.1.jar).
## What has been done?
- [x] Tri Consumers, Functions, Predicates
- [x] Quadri Consumers, Functions, Predicates
- [ ] Penta, Hexa, Septa, Octa, Nona, or Deca
## Building
Build it like any other gradle project, if you have gradle:
```
$ gradle build
```
Or, if you do not have Gradle
```
$ ./gradlew build
```
## Documentation
The Javadoc can be found https://waoss.github.io/FIDS/javadoc/
## Examples
See the "test" sources in src/test/java or [here](https://waoss.github.io/FIDS/examples/com/waoss/util/fids/index.html).

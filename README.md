# FindRandom

[![](https://jitpack.io/v/mohamadreza7565/FindRandom.svg)](https://jitpack.io/#mohamadreza7565/FindRandom)


# Gradle

## Dependency
```Gradle
dependencies {
    implementation 'com.github.mohamadreza7565:FindRandom:1.0.0'
}
```


## Maven
```Gradle
allprojects {
     repositories {
	...
     maven { url 'https://jitpack.io' }
	}
}
```

### Examples

```kotlin

 val count = 5
 val duplicate = false
 var from = 10
 var to = 50
 FindRandom(count,duplicate).findFromInteger(from,to)

```


```kotlin

val count = 5
val duplicate = false
     
var numbers  = ArrayList<Int>()
numbers.add(5)
numbers.add(7)
numbers.add(15)
numbers.add(25)
numbers.add(4)
numbers.add(3)
     
FindRandom(count,duplicate).findFromInteger(numbers)

```

```kotlin

 val count = 5
 val duplicate = false

 var strings  = ArrayList<String>()
 strings.add("Mohamad")
 strings.add("Ali")
 strings.add("Elahe")
 strings.add("Danial")
 strings.add("Aghil")

 FindRandom(count,duplicate).findFromString(strings)

```

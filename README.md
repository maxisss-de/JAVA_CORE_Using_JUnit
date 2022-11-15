(Практика: "Тестирование кода и Unit-тесты")

# Задача "Использование JUnit"

## Описание
В этом задании научимся писать тесты с использованием библиотеки для модульного тестирования **JUnit**  

Выберите одно или нескольколько ваших любимых домашних заданий, которые вы уже сделали  
Вспомните, как вы тестировали его работоспособность - наверняка просто запускали и вводили какие-то данные вручную?  

А теперь добавьте модульные тесты, которые проверят работоспособность автоматически.   
Тестов должно быть не менее трёх.  

П.С. После того, как тесты есть, вы можете попробовать улучшить (отрефакторить) ваш основной код. 
Поверьте, вы почувствуете это приятное ощущение уверенности в своём коде! 
И, изменив что-то, сможете в любой момент за пару секунд убедиться, что всё по-прежнему работает

## Реализация
Подключите зависимость к любимой системе сборки  
Maven:  
```xml
<dependency>
   <groupId>org.junit.jupiter</groupId>
   <artifactId>junit-jupiter-engine</artifactId>
   <version>5.1.0</version>
   <scope>test</scope>
</dependency>
```

Или Gradle:
```gradle
dependencies {
  // .. другие зависимости
  testImplementation('org.junit.jupiter:junit-jupiter:5.6.2')
}

test {
  useJUnitPlatform()
}
```

Создайте класс для тестов в папке `src/test/java` (можете также создать подпапки в соответствии с package'ом класса, который вы будете тестировать)  

В классе создайте методы вида  
```java
@org.junit.jupiter.api.Test
public void testConcat_validArgument_success() {
  // given:
  ...

  // when:
  ...    

  // then:
    Assertions.***;
}
```
где на месте `...` размещаете код подготовки к тестированию, а затем вызова целевого метода  
а набрав `Assertions.` выберите подходящий метод из подсказок IntelliJ IDEA.   
Таких методов (ассертов) можете сделать несколько в одном тестирующем методе

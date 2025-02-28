# Factory Pattern vs Abstract Factory Pattern

## Introduction
This project demonstrates the **Factory Pattern** and **Abstract Factory Pattern** in Java.

- **Factory Pattern**: Provides an interface for creating objects without specifying the exact class.
- **Abstract Factory Pattern**: Provides an interface for creating families of related objects without specifying concrete classes.

## Factory Pattern
### Concept
- A single factory class is responsible for creating different objects.
- Uses a method to return an instance based on a given input.

### Implementation in This Project
- `VehicleFactory.java` creates objects of **Car** and **Bike** based on user input.

## Abstract Factory Pattern
### Concept
- A factory of factories.
- Instead of creating objects directly, it delegates object creation to another factory.

### Implementation in This Project
- `FactoryProducer.java` decides which factory to use (**ElectricFactory** or **PetrolVehicleFactory**).
- These factories create **Tesla (Electric Car)** and **BMW (Petrol Car)**.

## How to Run the Program
### Compile the Project
```sh
javac -d bin src/abstractFactory/*.java src/factory/*.java src/Main.java
```

### Run the Program
```sh
cd bin
java Main
```

## Expected Output
```
Factory Pattern:
Driving a car
Riding a bike

Abstract Factory Pattern:
Driving a Tesla (Electric)
Driving a BMW (Petrol)
```

## Conclusion
- Use **Factory Pattern** when you need a simple object creation mechanism.
- Use **Abstract Factory Pattern** when you need multiple related factories.
- Abstract Factory is a higher-level pattern that builds on the Factory Pattern.


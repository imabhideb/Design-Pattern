# Decorator Design Pattern in Java

## Overview
The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. It is a flexible alternative to subclassing for extending functionality.

### Key Features of Decorator Pattern:
- Extends functionality dynamically at runtime.
- Follows the Open-Closed Principle (OCP) – you can add new functionality without modifying existing code.
- Uses composition instead of inheritance.
- Supports multiple decorators that can be stacked on top of each other.

## Folder Structure
The workspace contains the following folders:

- `src/components`: Contains the base component and concrete implementations.
- `src/decorators`: Contains the decorator abstract class and concrete decorators.
- `bin`: The folder where compiled output files are generated.

## Components in the Project

### Coffee Interface (Component) - `components/Coffee.java`
Defines the common interface for both the base coffee and decorators.

### SimpleCoffee (Concrete Component) - `components/SimpleCoffee.java`
- Implements `Coffee` and provides the base description and cost.

### CoffeeDecorator (Abstract Decorator) - `decorators/CoffeeDecorator.java`
- Implements `Coffee`.
- Stores a reference to a `Coffee` object.
- Delegates existing behavior to the wrapped coffee object.

### Concrete Decorators (Milk, Sugar)
Each decorator extends `CoffeeDecorator` and adds additional functionality:
- **Milk Decorator** - `decorators/Milk.java`
- **Sugar Decorator** - `decorators/Sugar.java`

### CoffeeShop (Main Class) - `CoffeeShop.java`
Demonstrates how decorators can be dynamically added to the base coffee.

## Running the Project

### Compile the Code
Navigate to the `src/` folder and run:
```sh
javac -d ../bin components/*.java decorators/*.java CoffeeShop.java
```

### Run the Main Class
```sh
cd ../bin
java CoffeeShop
```

## Expected Output
```
Here's your simple coffee -> $5.0
Here's your simple coffee, with Milk -> $6.5
Here's your simple coffee, with Milk, and added Sugar -> $7.0
Here's your simple coffee -> $5.0
```

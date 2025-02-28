Decorator Design Pattern in Java

Overview

The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. It is a flexible alternative to subclassing for extending functionality.

Key Features of Decorator Pattern:

Extends functionality dynamically at runtime.

Follows the Open-Closed Principle (OCP) – you can add new functionality without modifying existing code.

Uses composition instead of inheritance.

Supports multiple decorators that can be stacked on top of each other.

Implementation in This Project

This project demonstrates the Decorator Design Pattern by simulating a coffee shop, where different types of add-ons (Milk, Sugar, etc.) can be added to a base coffee dynamically.

Components in the Project

1. Coffee Interface (Component) [components/Coffee.java]

Defines the common interface for both the base coffee and decorators.

2. SimpleCoffee (Concrete Component) [components/SimpleCoffee.java]

Implements Coffee and provides the base description and cost.

3. CoffeeDecorator (Abstract Decorator) [decorators/CoffeeDecorator.java]

Implements Coffee.

Stores a reference to a Coffee object.

Delegates existing behavior to the wrapped coffee object.

4. Concrete Decorators (Milk, Sugar)

Each decorator extends CoffeeDecorator and adds additional functionality:

Milk Decorator [decorators/Milk.java]

Sugar Decorator [decorators/Sugar.java]

5. CoffeeShop (Main Class) [CoffeeShop.java]

Demonstrates how decorators can be dynamically added to the base coffee.


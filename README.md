# 🌙 MoonBeam Cafe

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![OOP](https://img.shields.io/badge/Paradigm-Object%20Oriented%20Programming-purple)
![Build](https://img.shields.io/badge/Build-Maven-orange)
![Status](https://img.shields.io/badge/Status-Capstone%20Project-brightgreen)

---

## ✨ Overview

**MoonBeam Cafe** is a Java-based console application that simulates a fully interactive cafe ordering system. Users can build custom drinks, select themed desserts and sides, and complete orders with dynamically calculated pricing.

The project demonstrates strong object-oriented programming principles including:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

As well as receipt generation and file writing functionality.

---

## ☕ Features

### 🧋 Drink Customization
- Select drink label (Small, Medium, Large)
- Choose base drink (Latte, Espresso, Tea, etc.)
- Add multiple topping categories:
    - Regular
    - Premium
    - Booster
- Apply themed specializations (e.g., Moon Foam, Galaxy Swirl)

### 🍰 Sides & Desserts
- Complimentary themed items
- Main dessert menu
- Space-inspired food options

### 🧾 Order System
- Add / remove / clear items
- Calculate total price dynamically
- Supports multiple item types via polymorphism

### 💳 Receipt Generation
- Fully formatted receipt output
- Itemized breakdown
- Saved to file system automatically

---

## 🧠 Tech Stack

- Java 17+
- Object-Oriented Design
- Enums for structured option systems
- File I/O (BufferedWriter / FileWriter)
- Collections (ArrayList, List)
- Streams (for formatting output)

---

## 🧩 Project Structure

```text
src/main/java
│
├── com.cafeapp
│   │
│   ├── application
│   │   └── Main
│   │
│   ├── enums
│   │   ├── drink
│   │   ├── menus
│   │   └── side
│   │
│   ├── interfaces
│   │   └── Displayable
│   │
│   ├── models
│   │   ├── Drink
│   │   ├── MenuItem
│   │   ├── Order
│   │   ├── SeasonalDrinkModel
│   │   └── Side
│   │
│   ├── services
│   │   ├── DrinkBuilderService
│   │   ├── SeasonalDrinkService
│   │   └── SideService
│   │
│   ├── ui
│   │   ├── CheckoutScreen
│   │   ├── HomeScreen
│   │   └── OrderScreen
│   │
│   └── utils
│       ├── Color
│       ├── DateUtils
│       ├── FileUtils
│       ├── InputHelper
│       ├── ListUtils
│       └── UIHelper
│
└── data
    └── receipts
```

### 📦 Architecture Notes

* `models` contains domain objects and business data
* `services` contains business logic and builders
* `ui` handles console rendering and interaction
* `utils` contains reusable helper utilities
* `enums` provides strongly typed menu configurations

## 📊 UML Diagram

The UML diagram below represents the structure of the application and relationships between core classes.

- `MenuItem` acts as the base class
- `Drink` and `Side` extend `MenuItem`
- `Order` aggregates `MenuItem` objects
- Enums define fixed configuration sets

![UML Diagram](src/main/assets/diagram.png)

---

## 📸 Screenshots

### 🏠 Main Menu
![Main Menu](src/main/assets/mainMenuScreen.png)

### ☕ Drink Builder
![Drink Builder](src/main/assets/drinkBuilderScreen.png)

### 🧾 Order Summary
![Order Summary](src/main/assets/ReceiptUI.png)

### 💳 Receipt Output
![Receipt Output](src/main/assets/receiptOutput.png)

---

## 🧮 Key Design Concepts

### 🔹 Polymorphism
Orders store items as `MenuItem`, allowing both `Drink` and `Side` objects to be processed uniformly.

### 🔹 Encapsulation
Each class handles its own internal state and pricing logic.

### 🔹 Enum-Based Design
Menus, toppings, and sizes are strongly typed using enums to prevent invalid inputs.

---

## 🚀 How to Run

1. Clone the repository
2. Open in IntelliJ IDEA (or any Java IDE)
3. Ensure Java 17+ is installed
4. Run the main application class
5. Follow the console prompts

---

## 📈 Future Improvements

- GUI version (JavaFX or Swing)
- Persistent database storage
- Inventory tracking system
- User accounts and order history
- Expanded unit test coverage

---

## 👨‍💻 Blaine Anthony Bell

Capstone project demonstrating Java OOP design, system architecture, and real-world application structure.

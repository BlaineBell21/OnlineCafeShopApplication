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

It also includes receipt generation and file writing functionality.

---

## ☕ Features

### 🧋 Drink Customization
- Select drink size (Small, Medium, Large)
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
- View current order
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
com.cafeapp
│
├── models
│ ├── MenuItem
│ ├── Drink
│ ├── Side
│ └── Order
│
├── enums
│ ├── DrinkSize
│ ├── DrinkBase
│ ├── DrinkSpecialization
│ ├── ToppingType
│ ├── ToppingCategory
│ └── SideType
│
├── ui
│ ├── OrderScreen
│ ├── DrinkBuilderScreen
│ ├── SideScreen
│ └── CheckoutScreen
│
└── utils
├── InputHelper
├── ReceiptWriter
└── DateUtils
## 📊 UML Diagram

The UML diagram below represents the structure of the application and relationships between core classes.

- `MenuItem` acts as the base class
- `Drink` and `Side` extend `MenuItem`
- `Order` aggregates `MenuItem` objects
- Enums define fixed configuration sets

📌 *Insert UML image here: `assets/uml-diagram.png`*

---

## 📸 Screenshots

### 🏠 Main Menu
📌 *Insert: `assets/main-menu.png`*

### ☕ Drink Builder
📌 *Insert: `assets/drink-builder.png`*

### 🧾 Order Summary
📌 *Insert: `assets/order-summary.png`*

### 💳 Receipt Output
📌 *Insert: `assets/receipt.png`*

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

## 👨‍💻 Author

Capstone project demonstrating Java OOP design, system architecture, and real-world application structure.

---

## ⭐ Acknowledgements

Special focus on applying:
- Clean OOP architecture
- Realistic business logic modeling
- Maintainable Java project structure

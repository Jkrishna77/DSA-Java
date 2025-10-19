# Introduction to Programming

This section covers the basic concepts of programming languages and how programs manage memory. These ideas form the foundation for understanding how Java works internally.

---

## 1. Types of Programming Languages

Programming languages can be classified based on how they structure and execute code.

### 🧮 Procedural Languages
- **Definition:** Follow a step-by-step approach using procedures (functions).
- **Focus:** Sequence of actions to be performed.
- **Examples:** C
- **In Java:** Although Java is primarily object-oriented, you can still write procedural-style code using static methods.

### 🧠 Functional Languages
- **Definition:** Emphasize functions, immutability, and avoiding side effects.
- **Focus:** *What to do* instead of *how to do it*.
- **Examples:** JavaScript (functional style), Java (since Java 8 supports lambdas and streams).
- **In Java:** Functional programming is achieved using lambdas, `Stream API`, and higher-order functions.

### 🏛️ Object-Oriented Languages
- **Definition:** Organize code around objects and classes that encapsulate state and behavior.
- **Focus:** Modeling real-world entities using classes, objects, and relationships (inheritance, polymorphism, encapsulation).
- **Examples:** Java, C++, C#
- **In Java:** Java is primarily object-oriented — you use classes and objects, and features like inheritance, interfaces, encapsulation, and polymorphism are core to design.

---

## 2. Static vs Dynamic Languages

| Feature | Static Languages | Dynamic Languages |
|----------|------------------|------------------|
| **Type Checking** | At compile-time | At runtime |
| **Error Detection** | Early (before execution) | Late (during execution) |
| **Performance** | Generally faster | Slower due to runtime checks |
| **Examples** | Java, C, C++ | Python, JavaScript |

**In Java:**  
Java is a **statically typed** language. You must declare variable types before use, and they cannot change at runtime.

```java
int x = 10;  // static typing
x = "Hello"; // ❌ compile-time error
```

---

## 3. Memory Management

Memory in programming is mainly divided into **Stack** and **Heap**.

### 🧱 Stack Memory

* Used for **static memory allocation**.
* Stores:

  * Method calls
  * Local variables
  * Function parameters
* Follows **LIFO (Last In, First Out)**.
* Memory is **automatically freed** when a method ends.

### 🧩 Heap Memory

* Used for **dynamic memory allocation**.
* Stores **objects** and **class instances**.
* Accessed via references.
* Managed by **Garbage Collector (GC)** in Java.

```bash
In simple when you do a=10, a(variable) stored in stack and its object(value) is stored in Heap 
```

---

## 4. Garbage Collection

* **Definition:** Process by which Java automatically frees memory occupied by objects that are no longer referenced.
* **When does it happen?**
  When an object **has no active references**, it becomes *eligible for garbage collection*.

**Why it matters:** Prevents memory leaks and improves performance.

---

## ✅ Summary

| Concept                | Key Idea                        |
| ---------------------- | ------------------------------- |
| **Procedural**         | Step-by-step instructions       |
| **Functional**         | Functions and immutability      |
| **Object-Oriented**    | Classes, objects, encapsulation |
| **Static**             | Types checked at compile-time   |
| **Stack**              | Stores local data, method calls |
| **Heap**               | Stores objects, managed by GC   |
| **Garbage Collection** | Removes unreferenced objects    |

---

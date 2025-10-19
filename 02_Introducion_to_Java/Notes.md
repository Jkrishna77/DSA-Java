# Introduction to Java

This page explains how Java runs, why it is platform independent, and the roles of the JDK, JRE, JVM, and JIT. The goal is a simple, clear overview from source code to execution.

---

## 1. How Java Code Executes

### Step-by-step flow

Source Code (.java) → Compilation (.class bytecode) → Execution (machine code)

1. **Source Code**
   - You write Java code in a `.java` file.
   - Example:
     ```java
     public class Hello {
         public static void main(String[] args) {
             System.out.println("Hello World");
         }
     }
     ```

2. **Compilation**
   - The Java compiler (`javac`) converts `.java` files into **bytecode** (`.class`).
   - Bytecode is platform-independent (not tied to OS or CPU).
   - Example:
     ```powershell
     javac Hello.java
     ```
     Produces `Hello.class`.

3. **Execution**
   - The **JVM** (Java Virtual Machine) loads the `.class` file and runs it.
   - The JVM either interprets bytecode or uses the JIT to compile hot code to native machine code.
   - Example:
     ```powershell
     java Hello
     ```

---

## 2. Platform Independence

- Java is called *platform independent* because compiled bytecode runs on any machine that has a compatible JVM.
- You compile once to bytecode and run that bytecode on Windows, Linux, or macOS without recompiling.

Java source → Bytecode → JVM (OS-specific) → Machine code

> WORA — Write Once, Run Anywhere.

---

## 3. JDK, JRE, JVM, and JIT Explained

### JDK (Java Development Kit)
- Complete package for developing Java programs.
- Contains the JRE plus development tools (compiler `javac`, `javadoc`, `jar`, debugger, etc.).
- Used by developers.

Example install path (Windows):
```text
C:\Program Files\Java\jdk-21\
```

### JRE (Java Runtime Environment)
- Used to run Java applications (does not include development tools).
- Contains the JVM and standard libraries.
- If you only want to run Java programs, the JRE is enough.

### JVM (Java Virtual Machine)
- The engine that executes Java bytecode.
- Responsibilities: load classes, verify bytecode, manage memory, and execute code.

Simplified JVM components:
```text
┌────────────────────────┐
│      Class Loader      │
├────────────────────────┤
│     Memory Areas       │
│  (Heap, Stack, PC, ...)│
├────────────────────────┤
│   Execution Engine     │
│ (Interpreter + JIT)    │
├────────────────────────┤
│  Native Method Support │
└────────────────────────┘
```

### JIT (Just-In-Time Compiler)
- Part of the JVM execution engine.
- Compiles frequently executed (hot) bytecode into native machine code at runtime.
- Improves performance by avoiding repeated interpretation.

How JIT works (simple):
1. JVM interprets bytecode.
2. JIT detects hot spots.
3. JIT compiles hot spots to native code.
4. Native code runs faster on subsequent executions.

---

## 4. Relationship between JDK, JRE, and JVM

```text
JDK
├─ JRE
│  ├─ JVM
│  └─ Java Libraries
└─ Development Tools (javac, javadoc, jar, ...)
```

### Summary Table

| Component | Purpose | Contains | Used by |
|---|---|---|---|
| **JDK** | Develop + run Java programs | JRE + tools | Developers |
| **JRE** | Run Java programs | JVM + libraries | End users |
| **JVM** | Execute bytecode | Part of JRE | All Java apps |
| **JIT** | Optimize runtime performance | Inside JVM | Runtime engine |

---

## ✅ Quick Recap

| Step | What it means |
|---|---|
| Source (.java) | Human-readable Java code |
| Compiler (javac) | Produces platform-independent bytecode |
| Bytecode (.class) | Input for the JVM |
| JVM | Loads bytecode and runs it (interprets or JIT-compiles) |
| JIT | Speeds up frequently-run code |

---


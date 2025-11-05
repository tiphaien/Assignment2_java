#  Java Lab Assignment #2 – Toronto Blue Jays Project

##  Introduction
This project demonstrates key **Object-Oriented Programming (OOP)** principles and **advanced Java concepts** through a creative theme based on the **Toronto Blue Jays baseball team**.

It is divided into two main packages:
1. **`bluejays_team`** → Demonstrates core OOP features (*inheritance, polymorphism, encapsulation, static methods*)
2. **`bluejays_stats`** → Demonstrates team management concepts (*interfaces, ArrayList, file handling, exceptions*)


##  Learning Objectives
The goal of this lab is to:
- Apply **Object-Oriented Programming principles** in a real-world inspired context  
  (*classes, subclasses, overriding methods, constructors*)
- Use **interfaces** to define and implement reusable behaviors  
- Manage collections of data using **ArrayLists**
- Handle potential errors using **try/catch blocks** (*exceptions handling*)
- Read from and write to **text files** using the Java I/O package (*FileReader, FileWriter, BufferedReader, BufferedWriter*)
- Organize the project into clear **packages and entry points**


##  Project Structure
Java-Assignment2/
└── src/
  ├── bluejays_team/
     ├── Player.java
     ├── Pitcher.java
     └── BlueJaysApp.java
 └── bluejays_stats/
     ├── TeamOperation.java
     ├── TeamManager.java
     └── StatsApp.java


##  Package 1: `bluejays_team`
Demonstrates the main **Object-Oriented Programming (OOP)** principles through examples based on the Toronto Blue Jays players.

- **`Player.java`** → Superclass containing shared attributes and methods *(encapsulation, constructors, static method)*  
- **`Pitcher.java`** → Subclass extending `Player` and redefining one method *(inheritance, polymorphism)*  
- **`BlueJaysApp.java`** → Main class creating objects and calling methods *(includes try/catch example)*  


##  Package 2: `bluejays_stats`
Focuses on **data management**, **interfaces**, and **file handling operations**.

- **`TeamOperation.java`** → Interface defining actions for managing the team *(abstraction)*  
- **`TeamManager.java`** → Implements the interface, uses an `ArrayList` to store players, and manages file writing and reading *(interfaces, ArrayList, file I/O, exceptions)*  
- **`StatsApp.java`** → Main class adding players, saving data to a text file, and reading it back *(try/catch example)*  


## Project Information

**Project Title:** Toronto Blue Jays – Java OOP Lab #2  
**Course:** ILAC & EFREI – Java Programming  
**Instructor:** Anmar Jarjees  
**Students:**  
- Chloé Hurbain
- Tiphaine Peran 




#  Java Lab Assignment #2 – Toronto Blue Jays Project

##  Introduction
This project demonstrates key **Object-Oriented Programming (OOP)** principles and **advanced Java concepts** through a creative theme based on the **Toronto Blue Jays baseball team**.

It is divided into two main packages:
1. **`bluejays_team`** → Demonstrates core OOP features (*inheritance, polymorphism, encapsulation, static methods*)
2. **`bluejays_stats`** → Demonstrates team management concepts (*interfaces, file handling, exceptions*)


##  Learning Objectives
The goal of this lab is to:
- Apply **Object-Oriented Programming principles** in a real-world inspired context  
  (*classes, subclasses, overriding methods, constructors*)
- Use **interfaces** to define and implement reusable behaviors  
- Manage collections of data using **ArrayLists**
- Handle potential errors using **try/catch blocks** (*exceptions handling*)
- Read from and write to **text files** using the Java I/O package (*FileReader, FileWriter, BufferedReader, BufferedWriter*)
- Organize the project into clear **packages and entry points**

##  Package 1: `bluejays_team`
Demonstrates the main **Object-Oriented Programming (OOP)** principles through examples based on the Toronto Blue Jays players.

- **`Player.java`** → Superclass containing shared attributes and methods *(encapsulation, constructors, static method)*  
- **`Pitcher.java`** → Subclass extending `Player` and redefining one method *(inheritance, polymorphism)*
- **`Batter`** → another subclass extending `Player` with its own attributes and behavior
- **`BlueJaysApp.java`** → Main class creating objects and calling methods *(includes try/catch example)*  


##  Package 2: `bluejays_stats`
This package focuses on **team statistics management**, showing how to use **interfaces**, **file operations**, and **exception handling**.

- **`TeamOperations.java`** → Interface defining required actions for managing team statistics *(abstraction)*  
- **`TeamManager.java`** → Implements `TeamOperations`, stores data about the team’s wins and losses, and saves statistics to a text file *(interfaces, file I/O, exceptions)*  
- **`StatsApp.java`** → Main application that creates a `TeamManager`, displays the stats, and writes them to a file *(try/catch example)*  

## Project Information

**Project Title:** Toronto Blue Jays – Java OOP Lab #2  
**Course:** ILAC & EFREI – Java Programming  
**Instructor:** Anmar Jarjees  
**Students:**  
- Chloé Hurbain
- Tiphaine Peran 




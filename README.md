# 🎨 OOP Shapes Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Stable%20v1.0-green?style=for-the-badge)

A robust Java application demonstrating **Object-Oriented Programming (OOP)** principles. This project allows users to load geometric shape data from files, visualize them dynamically on a responsive interface, and perform calculations like surface area reporting.

---

## 🔑 Key Features

* **📌Dynamic Visualization:**
    * Shapes are drawn on a custom `DrawingPanel`.
    * **Responsive Layout:** Shapes automatically wrap to new lines and center themselves based on the window size.
    * **Scroll Support:** Handles large numbers of shapes using a smooth scroll view.
* **📌File Processing:**
    * Parses text files to load shape data (Circles, Cubes, etc.).
    * Generates and saves detailed text reports for area calculations.
* **📌OOP Design:**
    * Utilizes **Polymorphism** and **Interfaces** (`Drawable`) to manage different shapes uniformly.
    * Clean separation of concerns between Logic and GUI.
* **📌User Interface:**
    * Interactive Dashboard with options to Load, Calculate, Save, and View.
    * Real-time feedback and validation messages.

---

## ⚙️ Technologies Used

* **Language:** Java (JDK 17+)
* **GUI Framework:** Java Swing (JFrame, JPanel, Graphics)
* **Concepts:**
    * Inheritance & Polymorphism
    * Interfaces (`Drawable`)
    * File I/O (Reading/Writing streams)
    * Layout Managers

---
## 🧬 Project Structure

Here's an overview of the project's file organization:

```bash
OOP_Project_2026/
├── src/
│   ├── interfaces/
│   │   └── Drawable.java       # Interface defining common behavior (draw, getArea)
│   │
│   ├── Circle.java             # Concrete class representing a 2D Circle
│   ├── Cube.java               # Concrete class representing a 3D Cube
│   │
│   ├── DrawingPanel.java       # Custom JPanel logic for dynamic rendering & scrolling
│   └── MainMenu.java           # Main entry point (GUI Dashboard & File Handling)
│
├── assets/                     # Images and GIFs used in this README
├── input.txt                   # Sample input file for testing
├── sumAreas.txt                # print sum of all shapes areas
└── README.md                   # Project documentation
```

## 🚀 How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/0xezzdev/OOP_Project_2026.git
    ```
2.  **Open in IDE:**
    * Open IntelliJ IDEA (or Eclipse/NetBeans).
    * Import the project folder.
3.  **Run the App:**
    * Locate the `Main.java` file.
    * Right-click and select **Run**.

---

## 📝 Input File Format

To test the application, create a text file (e.g., `shapes.txt`) with the following format (adjust based on your parser logic):

```text
Circle 50
Cube 100
Circle 75
Cube 60
```
---

## 🔮 Future Improvements
1.  **Add support for more shapes (Triangles, Rectangles).**
  
2.  **Implement color customization for each shape.**
    
3.  **Database integration for saving shape history.**

---

## 👤 Author
* **📌Omar Adel Abouzeid**

---


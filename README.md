# 🧊 3D Geometric Visualization System (v2.0)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Release-v2.0-purple?style=for-the-badge)

An advanced version of the OOP Shapes project, featuring **simulated 3D rendering** and **gradient shading** for a realistic visualization experience. This version introduces complex shapes like Cones and Spheres with a monochromatic aesthetic.

---

## 🚀 What's New in v2.0?

* **🔮 3D Shape Support:**
    * **Spheres:** Rendered with radial gradient shading to simulate depth and lighting.
    * **Cones:** Implemented with linear gradients and oval bases for a realistic 3D look.
    * **Solid Cubes:** Now rendered with shaded faces (Top, Front, Side) instead of wireframes.
* **🎨 Visual Upgrade:**
    * **Monochromatic Theme:** A sleek Black & White design with metallic gradients.
    * **Lighting Simulation:** Highlights and shadows applied to all shapes.
* **🛡️ Robust Error Handling:**
    * Automatically detects and skips invalid inputs (e.g., negative dimensions) without crashing.

---

## 🛠️ Updated Class Structure

| Class | Type | Description |
| :--- | :--- | :--- |
| `Sphere` | 3D Shape | Uses `RadialGradientPaint` for 3D lighting effects. |
| `Cone` | 3D Shape | Uses `LinearGradientPaint` and polygon mapping. |
| `Cube` | 3D Shape | Draws 3 distinct faces with different gray levels for depth. |
| `Panel` | GUI | Smart layout engine adapted for larger 3D shapes. |

---

## 📝 Input Format (v2.0)

The system now supports 4 shapes. Ensure `Cone` has **two** parameters (Radius, Height).

```text
4
Sphere 60
Cube 100
Cone 50 120
Sphere 75
```
---

## 🔮 Future Improvements

- [ ] **Interactive Toolbar:** Add a GUI side-panel to allow users to add/remove shapes dynamically at runtime without editing the text file.
- [ ] **Design Pattern Integration:** Refactor the shape creation logic to implement the **Factory Design Pattern** for cleaner and more scalable code.
- [ ] **Data Persistence:** Implement **JSON or XML serialization** to save and load drawing sessions (exporting the current state).
- [ ] **Sorting Algorithms:** Add functionality to sort displayed shapes by Area or Volume (Ascending/Descending).
- [ ] **Z-Axis Management:** Implement a layering system to handle overlapping shapes (bring to front/send to back).

---

## 👤 Author
* **📌Omar Adel Abouzeid**

---


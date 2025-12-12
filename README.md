# Object Oriented Programming Project - Assiut University

## Project Overview
[cite_start]This project is an Object Oriented Programming assignment for the Faculty of Computers & Information at Assiut University[cite: 2, 3]. [cite_start]The objective is to convert a specific UML diagram into Java classes and implement a driver program that handles file I/O and GUI visualization[cite: 4, 12].

## Class Structure
[cite_start]The project implements the following class hierarchy based on the provided UML design[cite: 4]:

### Interface
* [cite_start]**`Drawable`**: Defines the contract for drawable objects with the method `howToDrwa()`[cite: 14, 15].

### Abstract/Base Class
* [cite_start]**`Shape`**: Represents a generic shape[cite: 16].
    * [cite_start]**Attributes**: `dateCreated` (Date), `color` (String)[cite: 17, 18].
    * [cite_start]**Methods**: `getArea()`, `getPerimeter()`, `getDateCreated()`[cite: 19, 20, 21].

### Concrete Classes
* **`Circle`** (Extends `Shape`):
    * [cite_start]**Attributes**: `raduis` (double)[cite: 25].
    * [cite_start]**Methods**: Includes getters, setters, and `toString()` implementation[cite: 26, 27, 28].
* **`ThreeDShape`** (Extends `Shape`):
    * [cite_start]**Methods**: Adds functionality for 3D calculations like `getVolume()`[cite: 32, 33].
* **`Cube`** (Extends `ThreeDShape`):
    * [cite_start]**Attributes**: `side` (double)[cite: 35].
    * [cite_start]**Methods**: Includes getters, setters, and `toString()` implementation[cite: 36, 37, 38].

## Features & Functionality

### 1. Data Processing
[cite_start]The application creates an array of `Drawable` objects (minimum size 2) populated via file input[cite: 5].

### 2. File Input (`input.txt`)
[cite_start]The program reads from a file named `input.txt` to instantiate shapes[cite: 7]. The file format is as follows:
* **Line 1**: Number of shapes (Array size).
* **Subsequent Lines**: The shape type followed by its dimension.

**Example Input:**
```text
2
circle 22.5
cube 23.6

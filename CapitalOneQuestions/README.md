# Practice & Solutions

This repository contains my implementations of coding challenges I encountered or reconstructed from Online Assessments or technical interviews.  
I use this repo to document interesting or tricky problems that either stumped me at first glance or that I found worth practicing again.  

---

## Problem Descriptions

### Q2 – Highlight Removal
**Description:**  
Given an array of unique positive integers (heights), repeatedly find the smallest "highlight" and remove it until only two elements remain.  
- A highlight is an element strictly greater than its immediate neighbor(s).  
- After each removal, append the removed element to the result list.  
- When only two elements remain, append the larger one first, then the smaller.  

**Key Points:**  
- Uniqueness ensures at least one highlight always exists.  
- Edge cases occur at the first and last positions.  
- Complexity is `O(n²)` due to repeated scanning and removal.

---

### Q3 – Y-Shape Majority in a Matrix
**Description:**  
Given an odd-dimensioned `n × n` matrix (n ≥ 3) with values in {0, 1, 2}, determine the minimum changes needed to make:  
- All Y-shape cells have the same value,  
- All non-Y (background) cells have another uniform value.  

The Y-shape is defined as:  
- Left diagonal from top-left to the center,  
- Right diagonal from top-right to the center,  
- Vertical line down from the center to the bottom.  

**Key Points:**  
- The matrix center cell is part of the Y and is only counted once.  
- Count frequencies of values separately for Y-cells and background.  
- Choose the majority value in each region and compute required changes.  
- Complexity is `O(n²)` with fixed extra space.

---

## Notes
- These problems are reconstructed from memory and my understanding of what the problem asked for.  
- My focus is not just solving, but documenting thought process and edge cases.  
- Future problems I find interesting or difficult will also be added here.  

---

## Run Instructions
Compile and run any problem directly with `javac` and `java`:


javac main.java
java main


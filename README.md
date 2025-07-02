# BarChartRacer

A Java program that animates a **bar chart race** using `StdDraw` and input data.

---

## 📄 Description

This project visualizes ranked data that changes over time by displaying it as an animated bar chart.  
It reads data from a file (CSV-style) and shows how the top categories move up or down the ranks over time.

---

## 🚀 Features

- Reads a time series data file.
- Displays the top `k` bars for each time frame.
- Uses Princeton's `StdDraw` for simple graphics and smooth animation.
- Easy to customize and run with different datasets.

---

## 📁 Files

- `Bar.java` — Defines a `Bar` with a name, value, and category.
- `BarChartRacer.java` — The main class that reads the data and runs the animation.
- *(Optional)* `BarChart.java` — Helper class for drawing the chart if needed.

---

## 🗂️ Requirements

- Java 8+
- `algs4.jar` library (for `StdDraw` and `In`)

---

## ⚙️ How to Run

1. **Compile the code:**

   ```bash
   javac -cp .:algs4.jar Bar.java BarChartRacer.java
java -cp .:algs4.jar BarChartRacer <data-file.txt>

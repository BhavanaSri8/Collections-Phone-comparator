# 📱 Phone Management System (Java Collections Project)

## 📌 Overview

This project is a simple **Phone Management System** built using Java.  
It demonstrates the use of:

- Object-Oriented Programming (OOP)
- Java Collections Framework
- LinkedList
- Iterator
- Comparator
- Sorting (Ascending & Descending)
- Filtering
- Custom Date Sorting (DD-MM-YYYY format)

The system manages a list of `Phone` objects and performs multiple operations like adding, removing, filtering, and sorting.

---

## 🏗 Project Structure

<img width="259" height="135" alt="image" src="https://github.com/user-attachments/assets/a0b9128d-351d-4c68-85c7-a68a660ae8ea" />

---

## 📦 Phone Class

The `Phone` class contains the following attributes:

| Field               | Type    | Description                  |
|---------------------|---------|------------------------------|
| id                  | int     | Unique phone ID              |
| name                | String  | Phone model name             |
| brand               | String  | Brand of the phone           |
| cost                | double  | Price of the phone           |
| cameraPx            | int     | Camera resolution (MP)       |
| dateOfManufacture   | String  | Format: DD-MM-YYYY           |

### Includes:
- Parameterized Constructor
- Getters and Setters
- Overridden `toString()` method

---

## ⚙ Functionalities Implemented

### ✅ Add Phone
Adds a phone object to the LinkedList.

## ✅ Remove Phone by ID

Removes a phone safely using `Iterator`.

```java
removeById(int id)

✅ Filter by Brand

Displays phones of a specific brand (case-insensitive).

filterByBrand(String brand)

🔤 Sorting Features
➤ Sort by Name (Ascending)
sortByName()

➤ Sort by Name (Descending)
sortByNameDescending()

➤ Sort by Cost (Ascending)
sortByCost()

➤ Sort by Cost (Descending)
sortByCostDescending()

➤ Sort by Date (Ascending)

Date format used: DD-MM-YYYY

Sorting logic:

Compare Year

If same → Compare Month

If same → Compare Day

sortByDate()

➤ Sort by Date (Descending)

Newest dates first.

sortByDateDescending()

<img width="1246" height="542" alt="image" src="https://github.com/user-attachments/assets/e9aac5dc-94a3-405f-b8a3-972624b2f07e" />
<img width="1222" height="616" alt="image" src="https://github.com/user-attachments/assets/474375b2-8466-47cf-8bac-9088aa3c75c7" />
<img width="1230" height="543" alt="image" src="https://github.com/user-attachments/assets/aca68376-599c-4809-ad42-20df894193f1" />
<img width="1194" height="566" alt="image" src="https://github.com/user-attachments/assets/1cd3193f-8d51-44e7-9bcf-2a89e71cf7aa" />



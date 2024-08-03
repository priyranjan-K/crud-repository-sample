# 🚀 CRUD Repository Sample

Welcome to the **CRUD Repository Sample** project! This application demonstrates basic CRUD operations with a MySQL database and features two key API endpoints: `save` and `deleteById`.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
    - [Save Data](#save-data)
    - [Delete Data by ID](#delete-data-by-id)
- [Database Schema](#database-schema)
---

## 📌 Overview

The **CRUD Repository Sample** project provides a basic framework for performing CRUD operations with a MySQL database. It includes simple REST API endpoints to save and delete data.

---

## 🌟 Features

- **REST API** for managing data.
- **MySQL** integration for data persistence.
- Basic **validation** and **error handling**.

---

## 🚀 Getting Started

To set up and run this project locally, follow these steps:

1. **Clone the repository:**

    ```bash
    git https://github.com/priyranjan-K/crud-repository-sample.git
    cd crud-repository-sample
    ```

2. **Install dependencies:**

    ```bash
    mvn clean install
    ```

3. **Configure the database:**

    - install  MySQL workbench/server.


4. **Start the server:**

    ```bash
    mvn spring-boot:run
    ```

---

## 🛠️ Usage

Once the server is running, you can interact with the API endpoints described below.

---

## 📡 API Endpoints

### Save Data

- **Endpoint:** `POST /v1/form/save`
- **Description:** Saves data to the database.
- **Request Body:**

    ```json
    {
      "firstName": "Example firstName",
      "lastName": "Example lastName",
      "age": "Example age"
    }
    ```

- **Response:**

    ```json
     {
      "id": "index value",
      "firstName": "inserted firstName",
      "lastName": "inserted lastName",
      "age": "inserted age"
    }
    ```

### Delete Data by ID

- **Endpoint:** `DELETE v1/form/delete/{id}`
- **Description:** Deletes data from the database by the specified ID.
- **Parameters:**

    - `id` (path parameter) - The ID of the data to delete.

- **Response:**

    ```string
   Successfully deleted.
    ```

---

## 🗃️ Database Schema

The database schema for this project is:

```sql
used CRUDRespository

# In-Memory POS System API

## Overview

The In-Memory POS System API is designed to provide comprehensive backend support for the existing front-end of the Point of Sale system. This Java EE-based API leverages Servlet, JSON, and JNDI to handle various functionalities seamlessly.

## Features

- CRUD operations for products, orders, and customers.
- In-memory storage for fast and efficient data access.
- JSON format for data exchange.
- JNDI for resource lookup and connection pooling.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 11 or higher installed.
- Apache Tomcat 10.0 or a compatible servlet container.
- Maven for building and managing dependencies.

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/IroshPerera/assignment-11-back-end.git
    ```

2. **Build the project using Maven:**

    ```bash
    cd assignment-11-back-end
    mvn clean install
    ```

3. **Deploy the generated WAR file to your servlet container (e.g., Tomcat).**

## Usage

To use the In-Memory POS System API, follow these steps:

1. Start your servlet container.
2. Access the API using the base URL (e.g., http://localhost:8080/pos).

## Endpoints

- **GET /products:** Retrieve a list of all products.
- **GET /products/{id}:** Retrieve details of a specific product.
- **POST /products:** Add a new product.
- **PUT /products/{id}:** Update an existing product.
- **DELETE /products/{id}:** Delete a product.

Similar endpoints exist for orders and customers.


## License
This project is licensed under the MIT License.



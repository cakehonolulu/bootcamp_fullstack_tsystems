# Simple API using Java's Spring

![Backend is fun!](https://user-images.githubusercontent.com/16636086/167956445-d3cd7afb-8d0b-4fc5-be87-96c4613d5f43.png)

## ✨ Features

* Built using Java 8, Spring Framework and Maven
* Multiple API Endpoints
* Wide range of HTTP Request types supported (GET, POST, PUT, DELETE...)
* CORS-protected REST API

## 📃 Documentation

<details>
  <summary>API GET Requests</summary>
  

#### GET /departments

Returns a comma-separated string with the available departments

---

#### GET /departments/{id}

Returns a JSON-formatted object containing the department selected with the id assignation on the request

---

#### GET /employees

Returns a comma-separated string with the available employees

---

#### GET /employees/{id}

Returns a JSON-formatted object containing the employee selected with the id assignation on the request

---



  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /employees

Saves a employee to the API Database specified as a JSON object on the Request's body


#### POST /departments

Saves an department to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /employees/{id}

Updates an already-existing employee inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /departments/{id}

Updates an already-existing department inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /employees/{id}

Deletes a employee (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /departments/{id}

Deletes an department (Using it's id) from the API's Database specified by the request's id parameter

  
</details>

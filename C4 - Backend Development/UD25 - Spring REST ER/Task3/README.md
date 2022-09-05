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
  

#### GET /storages

Returns a comma-separated string with the available storages

---

#### GET /storages/{id}

Returns a JSON-formatted object containing the storage selected with the id assignation on the request

---

#### GET /boxes

Returns a comma-separated string with the available boxes

---

#### GET /boxes/{id}

Returns a JSON-formatted object containing the box selected with the id assignation on the request

---



  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /boxes

Saves a box to the API Database specified as a JSON object on the Request's body


#### POST /storages

Saves an storage to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /boxes/{id}

Updates an already-existing box inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /storages/{id}

Updates an already-existing storage inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /boxes/{id}

Deletes a box (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /storages/{id}

Deletes an storage (Using it's id) from the API's Database specified by the request's id parameter

  
</details>

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
  

#### GET /rooms

Returns a comma-separated string with the available rooms

---

#### GET /rooms/{id}

Returns a JSON-formatted object containing the room selected with the id assignation on the request

---

#### GET /films

Returns a comma-separated string with the available films

---

#### GET /films/{id}

Returns a JSON-formatted object containing the film selected with the id assignation on the request

---



  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /films

Saves a film to the API Database specified as a JSON object on the Request's body


#### POST /rooms

Saves an room to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /films/{id}

Updates an already-existing film inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /rooms/{id}

Updates an already-existing room inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /films/{id}

Deletes a film (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /rooms/{id}

Deletes an room (Using it's id) from the API's Database specified by the request's id parameter

  
</details>

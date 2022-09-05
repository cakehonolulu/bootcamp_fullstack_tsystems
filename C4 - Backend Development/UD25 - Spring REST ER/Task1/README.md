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
  

#### GET /items

Returns a comma-separated string with the available items

---

#### GET /items/{id}

Returns a JSON-formatted object containing the item selected with the id assignation on the request

---

#### GET /makers

Returns a comma-separated string with the available makers

---

#### GET /makers/{id}

Returns a JSON-formatted object containing the maker selected with the id assignation on the request

---



  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /makers

Saves a maker to the API Database specified as a JSON object on the Request's body


#### POST /items

Saves an item to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /makers/{id}

Updates an already-existing maker inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /items/{id}

Updates an already-existing item inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /makers/{id}

Deletes a maker (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /items/{id}

Deletes an item (Using it's id) from the API's Database specified by the request's id parameter

  
</details>

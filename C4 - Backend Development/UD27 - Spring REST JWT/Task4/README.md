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
  

#### GET /pieces

Returns a comma-separated string with the available pieces

---

#### GET /pieces/{id}

Returns a JSON-formatted object containing the piece selected with the id assignation on the request

---

#### GET /providers

Returns a comma-separated string with the available providers

---

#### GET /providers/{id}

Returns a JSON-formatted object containing the provider selected with the id assignation on the request

---

#### GET /supplies

Returns a comma-separated string with the available supplies

---

#### GET /supplies/{id}

Returns a JSON-formatted object containing the supplies selected with the id assignation on the request

---


</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /providers

Saves a provider to the API Database specified as a JSON object on the Request's body


#### POST /pieces

Saves an piece to the API Database specified as a JSON object on the Request's body


#### POST /supplies

Saves a supplies to the API Database specified as a JSON object on the Request's body


</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /providers/{id}

Updates an already-existing provider inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /pieces/{id}

Updates an already-existing piece inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
#### PUT /supplies/{id}

Updates an already-existing supplies inside the API Database specified by it's id on the request w/the JSON-object in the request's body

</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /providers/{id}

Deletes a provider (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /pieces/{id}

Deletes an piece (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /supplies/{id}

Deletes an supplies (Using it's id) from the API's Database specified by the request's id parameter


</details>

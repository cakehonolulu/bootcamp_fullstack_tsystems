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
  

#### GET /proveedores

Returns a comma-separated string with the available proveedores

---

#### GET /proveedores/{id}

Returns a JSON-formatted object containing the proveedor selected with the id assignation on the request

---

#### GET /piezas

Returns a comma-separated string with the available piezas

---

#### GET /piezas/{id}

Returns a JSON-formatted object containing the pieza selected with the id assignation on the request

---

#### GET /suministracion

Returns a comma-separated string with the available suministracion

---

#### GET /suministracion/{id}

Returns a JSON-formatted object containing the suministracion selected with the id assignation on the request

---

  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /piezas

Saves a pieza to the API Database specified as a JSON object on the Request's body


#### POST /proveedores

Saves an proveedor to the API Database specified as a JSON object on the Request's body


#### POST /suministracion

Saves a suministracion to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /piezas/{id}

Updates an already-existing pieza inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /proveedores/{id}

Updates an already-existing proveedor inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
#### PUT /suministracion/{id}

Updates an already-existing suministracion inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  

</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /piezas/{id}

Deletes a pieza (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /proveedores/{id}

Deletes an proveedor (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /suministracion/{id}

Deletes an suministracion (Using it's id) from the API's Database specified by the request's id parameter

  

</details>

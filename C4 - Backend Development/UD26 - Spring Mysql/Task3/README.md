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
  

#### GET /cashiers

Returns a comma-separated string with the available cashiers

---

#### GET /cashiers/{id}

Returns a JSON-formatted object containing the cashier selected with the id assignation on the request

---

#### GET /machines

Returns a comma-separated string with the available machines

---

#### GET /machines/{id}

Returns a JSON-formatted object containing the machine selected with the id assignation on the request

---

#### GET /products

Returns a comma-separated string with the available products

---

#### GET /products/{id}

Returns a JSON-formatted object containing the products selected with the id assignation on the request

---

  
#### GET /sales

Returns a comma-separated string with the available sales

---

#### GET /sales/{id}

Returns a JSON-formatted object containing the sale selected with the id assignation on the request

---

</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /machines

Saves a machine to the API Database specified as a JSON object on the Request's body


#### POST /cashiers

Saves an cashier to the API Database specified as a JSON object on the Request's body


#### POST /products

Saves a products to the API Database specified as a JSON object on the Request's body

#### POST /sales

Saves a sale to the API Database specified as a JSON object on the Request's body


</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /machines/{id}

Updates an already-existing machine inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /cashiers/{id}

Updates an already-existing cashier inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
#### PUT /products/{id}

Updates an already-existing products inside the API Database specified by it's id on the request w/the JSON-object in the request's body

#### PUT /sales/{id}

Updates an already-existing sale inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  

</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /machines/{id}

Deletes a machine (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /cashiers/{id}

Deletes an cashier (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /products/{id}

Deletes an products (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /sales/{id}

Deletes a sale (Using it's id) from the API's Database specified by the request's id parameter

  

</details>

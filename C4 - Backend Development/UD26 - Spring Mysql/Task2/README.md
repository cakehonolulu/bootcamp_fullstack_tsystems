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
  

#### GET /assigned

Returns a comma-separated string with the available assigned

---

#### GET /assigned/{id}

Returns a JSON-formatted object containing the assigned selected with the id assignation on the request

---

#### GET /scientifics

Returns a comma-separated string with the available scientifics

---

#### GET /scientifics/{id}

Returns a JSON-formatted object containing the scientist selected with the id assignation on the request

---

#### GET /projects

Returns a comma-separated string with the available projects

---

#### GET /projects/{id}

Returns a JSON-formatted object containing the projects selected with the id assignation on the request

---

  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /scientifics

Saves a scientist to the API Database specified as a JSON object on the Request's body


#### POST /assigned

Saves an assigned to the API Database specified as a JSON object on the Request's body


#### POST /projects

Saves a projects to the API Database specified as a JSON object on the Request's body



</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /scientifics/{id}

Updates an already-existing scientist inside the API Database specified by it's id on the request w/the JSON-object in the request's body


#### PUT /assigned/{id}

Updates an already-existing assigned inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  
#### PUT /projects/{id}

Updates an already-existing projects inside the API Database specified by it's id on the request w/the JSON-object in the request's body

  

</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /scientifics/{id}

Deletes a scientist (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /assigned/{id}

Deletes an assigned (Using it's id) from the API's Database specified by the request's id parameter

#### DELETE /projects/{id}

Deletes an projects (Using it's id) from the API's Database specified by the request's id parameter

  

</details>

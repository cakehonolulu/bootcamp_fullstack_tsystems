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
  

#### GET /jobs

Returns a comma-separated string with the available jobs

---

#### GET /employers

Returns a JSON-formatted object containing all the employers in the database

---

#### GET /employers/{id}

Returns a JSON-formatted object containing the employer selected with the id assignation on the request

---

#### GET /employers/name/{name}

Returns a JSON-formatted object containing the employer selected with the name assignation on the request
	
---

#### GET /employers/surname/{surname}

Returns a JSON-formatted object containing the employer selected with the surname assignation on the request
	
---

#### GET /employers/job/{job}

Returns a JSON-formatted object containing the employer selected with the job assignation on the request

  
</details>



<details>
  <summary>API POST Requests</summary>
  

#### POST /employers

Saves an employer to the API Database specified as a JSON object on the Request's body

Example:

Employer named John Doe, programmer.

```bash
$ curl --location --request POST 'deploy.page/api/employers' \
                      --header 'Content-Type: application/json' \
                      --data-raw '{
                                    "name": "John",
                                    "surname": "Doe",
                                    "job": "programmer"
                                  }'
  ```
  
Example return:

```json
{
    "id": 1,
    "name": "John",
    "surname": "Doe",
    "salary": 20000.0,
    "job": "programmer"
}
  ```
  
</details>



<details>
  <summary>API PUT Requests</summary>
  

#### PUT /employers/{id}

Updates an already-existing employer inside the API Database specified by it's id on the request w/the JSON-object in the request's body

*Pre-update*

Employer named John Doe, programmer, id = 1.

*Post-update*

Employer named Jane Doe, threathunter, id = 1.

```bash
$ curl --location --request PUT 'localhost:8080/api/employers/1' \
                       --header 'Content-Type: application/json' \
                       --data-raw '{
                                      "name": "Jane",
                                      "surname": "Doe",
                                      "job": "threathunter"
                                   }'
  ```
  
Example return:

```json
{
    "id": 1,
    "name": "Jane",
    "surname": "Doe",
    "salary": 19000.0,
    "job": "threathunter"
}
  ```
  
</details>



<details>
  <summary>API DELETE Requests</summary>
  

#### DELETE /employers/{id}

Deletes an employer (Using it's id) from the API's Database specified by the request's id parameter

  
</details>

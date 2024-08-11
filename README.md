# dscatalog

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

Este projeto é uma APIRest monolítica, construída usando Java, Spring, H2 como banco de dados.

This project is a monolithic APIRest, built using Java, Spring, H2 as the database.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [Observation](#observation)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/IgorTecnologia/dscatalog-devsuperior-aula.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## Collection Postman

Import this URL into your Postman to use the ready-made HTTP methods to make requests/responses:
```
https://api.postman.com/collections/30344579-59501f7a-d2c3-4c9a-8e42-0395485c7135?access_key=PMAT-01J50Z87Q6ZWM1HD2SAA7DJ6XZ
```

# Important
first and important step logging into the application on the route:
POST /oauth/token
Basic Auth type variable data:

{{client-id}} value: dscatalog

{{client-secret}} value: dscatalog123

and body:

{{username}} value: maria@gmail.com

{{password}} value: 123456

{{grant_type}} value name: password

This way you will have access to all the application's resources, because Maria has the role of admin.

## API Endpoints
The API provides the following endpoints:

**POST OAUTH/TOKEN**
```markdown
POST /oauth/token - Request login to the application

Configure the variables presented above #Important
```
```json
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MjM0NzcxMzksInVzZXJfbmFtZSI6Im1hcmlhQGdtYWlsLmNvbSIsImF1dGhvcml0aWVzIjpbIlJPTEVfT1BFUkFUT1IiLCJST0xFX0FETUlOIl0sImp0aSI6IjlmNDA1MGJkLTgxMTMtNDRmYi1hOGNiLTBkNjk2NThiMjA3NCIsImNsaWVudF9pZCI6ImRzY2F0YWxvZyIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdfQ.CkMY93f853NITrhhzqD40XxKzBSlQ8_x9WSlVTMfEkA",
    "token_type": "bearer",
    "expires_in": 86399,
    "scope": "read write",
    "userFirstName": "Maria",
    "userId": 2
}
```

**GET USERS**
```markdown
GET /users - Retrieve a pagination of users.
```
```json
   {
    "content": [
        {
            "id": 1,
            "firstName": "Alex",
            "lastName": "Brown",
            "email": "alex@gmail.com",
            "roles": [
                {
                    "id": 1,
                    "authority": "ROLE_OPERATOR"
                }
            ]
        },

```
**GET USERS/ID**
```markdown
GET /users/id - Retrieve a single user by id.
```

```json
{
    "id": 2,
    "firstName": "Maria",
    "lastName": "Green",
    "email": "maria@gmail.com",
    "roles": [
        {
            "id": 1,
            "authority": "ROLE_OPERATOR"
        },
        {
            "id": 2,
            "authority": "ROLE_ADMIN"
        }
    ]
}
```

**POST USERS**
```markdown
POST /users - Register a new user into the App
```
```json
{
    "firstName": "Amanda",
    "lastName": "Lírio",
    "email": "amanda@gmail.com",
    "password": "1234567",
    "roles": [
        {
            "id": 1
        }
    ]
}
```
**PUT USERS**
```markdown
PUT/users/id - Update a user in the application by id.
```
```json
{
    "firstName": "Paula",
    "lastName": "Souza",
    "email": "paula@gmail.com",
    "password": "1234567",
    "roles": [
        {
            "id": 1
        },
        {
            "id": 2
        }
    ]
}
```
**DELETE USERS**
```markdown
DELETE/users/id - Delete a user in the application by id.
return HTTP status: 204 NO CONTENT

```
## Database
The project utilizes [H2 Database](https://www.h2database.com/html/tutorial.html) as the database.

There are settings for PostgreSQL, you can use them by changing the application.properties file.

The application comes with the H2 database as standard.

## Technologies Used

- JDK 11
- Spring Boot
- Maven
- H2 Database
- PostgreSQL
- Spring Tool Suite 4
- Postman

## Observation
This APIRest provides other endpoints besides users, such as:
/categories
/products
Located in the Application resources layer.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://medium.com/linkapi-solutions/conventional-commits-pattern-3778d1a1e657), e envie suas alterações em uma branch separado.

![imagem 1](https://miro.medium.com/v2/resize:fit:720/format:webp/1*Uvcb1Vfw2xUDere7KJqOUg.jpeg)

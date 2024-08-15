# DSCatalog - Sistema de Catálogo de Produtos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

DSCatalog é uma aplicação backend desenvolvida utilizando o modelo arquitetural monolítico, projetada para gerenciar catálogos de produtos de forma eficiente e segura.

- Segurança e Autenticação

A aplicação implementa Security/OAuth para gerenciar o login dos usuários, garantindo que o acesso aos recursos do sistema seja seguro e restrito a usuários autenticados.

- Funcionalidades Principais

DSCatalog oferece três APIs REST que permitem a interação com os principais recursos da aplicação:

Categorias de Produtos: API para gerenciar e consultar as categorias dos produtos disponíveis no catálogo.

Produtos: API dedicada ao gerenciamento dos produtos, permitindo criar, atualizar, excluir e consultar informações detalhadas sobre cada item no catálogo.

Usuários: API para gerenciar os usuários da plataforma, incluindo operações de criação, atualização, e consulta de perfis de usuário.

- O que a aplicação proporciona?

DSCatalog é projetada para oferecer uma solução completa para a gestão de catálogos de produtos. Com uma arquitetura monolítica, a aplicação integra de forma coesa todas as funcionalidades necessárias para o gerenciamento de categorias de produtos, produtos e usuários, garantindo uma experiência unificada e eficiente.


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

Download these files and import them into your Postman to use the ready-made HTTP methods along with the already configured environment variables, to perform the requests/responses

[Download Collections](https://github.com/IgorTecnologia/dscatalog-devsuperior-aula/blob/docs-postman/dscatalog-collections.json)

[Download Environment Variables](https://github.com/IgorTecnologia/dscatalog-devsuperior-aula/blob/docs-postman/dscatalog-local-environment.json)

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

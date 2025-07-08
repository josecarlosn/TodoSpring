# To Do List - Backend (Java/Spring Boot)

API RESTful para gerenciar tarefas, desenvolvida com Spring Boot e PostgreSQL.

## Tecnologias Utilizadas

*   Java 17
*   Spring Boot 3.5.0
*   Spring Data JPA
*   PostgreSQL
*   Maven

## Funcionalidades da API

*   **GET /todo/tasks**: Retorna todas as tarefas.
*   **POST /todo/create**: Cria uma nova tarefa.
*   **PUT /todo/update/{id}**: Atualiza uma tarefa existente.
*   **DELETE /todo/delete/{id}**: Exclui uma tarefa.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

*   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/ ) (versão 17 ou superior)
*   [Maven](https://maven.apache.org/download.cgi )
*   [PostgreSQL](https://www.postgresql.org/download/ ) (instalado e rodando)

## Configuração do Banco de Dados

As configurações do banco de dados são definidas no arquivo `src/main/resources/application.properties`.
Você pode ajustar as credenciais e a URL do banco de dados conforme sua configuração local:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
spring.datasource.username=seu_usuario_postgres
spring.datasource.password=sua_senha_postgres
spring.jpa.hibernate.ddl-auto=update # ou create, dependendo da sua estratégia
spring.jpa.show-sql=true

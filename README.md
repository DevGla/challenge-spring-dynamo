# challenge-spring-dynamo

## 📋 Prerequisite
- SDK Java, Version 17
- Docker

## 🚀 Getting Started

### 1 - Clone the Project:

-- In your terminal, type:

-   `git clone git@github.com:DevGla/challenge-spring-dynamo.git`

### 2 - To rise the aplication containers

-- In your terminal, type:

-   `make docker-start` - to start containers
-   `make docker-stop` - to stop containers
-   `make docker-remove-all` - to remove all containers

### 3 Create Table

-- In your terminal, type:

- chmod +x ./scripts/create-dynamodb-table.sh

-- After type:

- ./scripts/create-dynamodb-table.sh

### 4 -- Run the "main" function

### 5 - Insert Some Values in Table

<details>
  <summary>
    Command to send the message
  </summary><br>

- `curl --request POST \
  --url http://localhost:8080/posts \
  --header 'Content-Type: application/json' \
  --data '{
  "title": "The Lord of the Rings: The Fellowship of the Ring",
  "authorId": "1",
  "bookId": "1",
  "authorName": "J. R. R. Tolkien"
  }'`

</details>

### 6 Verify Values Created

-- In your terminal, type:

- aws dynamodb scan --endpoint-url http://localhost:11000 --table-name books

## ✒️ Authors

-   George Lucas

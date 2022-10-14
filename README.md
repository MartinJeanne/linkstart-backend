# Linkstart-backend
Back-end web services (REST API + DB) developped with Spring Boot, mysql and Docker for a Discord bot !  

## Setup
Rename the file .env.example to .env and set the variables in it to whatever you want

## Run
Run the whole infrastructure:
```
docker-compose up
```

## Test the project
Make request with Postman, curl, or other tool to test the API.<br>

Add a member with this HTTP POST method:
```
http://localhost:8001/api/members
```
And this body:
```
{
    "username": "Martin",
    "honor": 1
}
```
<br>

Retrieve the members with HTTP GET method:
```
http://localhost:8001/api/members
```

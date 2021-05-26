# Login Registration Backend 

Complete login registration backend system using Spring Boot.

- [x] Spring Boot
- [x] Spring Security
- [x] Java Mail Sender
- [x] Email verification with expiry
- [x] Lombok
- [x] MySQL Driver
- [x] Spring Data JPA

## Diagram
![Screenshot Diagram](https://user-images.githubusercontent.com/40702606/104789980-15581a00-578e-11eb-998d-30f2e6a9f461.png)

## Email verification link with expiry
![Screenshot Email](https://raw.githubusercontent.com/philemongloblehi/identity-api-springboot/master/images/email.png)

## Example requests
### Postman
![Screenshot Postman](https://raw.githubusercontent.com/philemongloblehi/identity-api-springboot/master/images/postman.png)

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Philémon",
    "lastName": "Globléhi",
    "email": "philemon.globlehi@gmail.com",
    "password": "password"
}'
```

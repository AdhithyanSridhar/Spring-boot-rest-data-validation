# Spring-boot-rest-data-validation

Spring boot rest service data validation - live coding
======================================================

- start.spring.io
- web, jpa, mysql

- controller, repository, entity
- add validations to entity
- create a customer

{ 
  "name": "techprudent",
  "age": 18,
  "email": "techprudent91@gmail.com",
  "contact": "1234567890",
  "gender": "male"  
}

@NotNull(message="enter name") @Size(min=2, max=50)
@Min(value=18, message="age should be more than 18")
@Email(message="Email id is not valid")
@Size(min=10, max=10)
@NotEmpty(message="enter gender data")

create customer  url 

POST: http://localhost:8080/customer/create

Change the data in the above json and play around with it to see how @valid functionality behaves.

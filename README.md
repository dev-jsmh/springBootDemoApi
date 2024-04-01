
# Demo Api 
Spring boot 3.2.2
java openJdk 17

# How to run

Enter the root folder and then go to the "target" folder. There, you will open a command line prompt and 
type " java -jar demo-0.0.1-SNAPSHOT.jar" to run the spring boot project.

![initialization](https://github.com/dev-jsmh/springBootDemoApi/assets/112201008/5af7e701-4df8-4884-856b-3748dcbc8685)


# Enpoints of the project

* Create a new provider in the data base

POST http://Api/v1/providers 

Example of how to crea a new provider: 

![POST clients](https://github.com/dev-jsmh/springBootDemoApi/assets/112201008/77543a0e-476e-4801-8900-143cb49dd2eb)


* Returns a list of all the registered provider in the data base

GET http://Api/v1/providers


* Gets an specific provider by its id number

GET http://Api/v1/providers/{id}

example: 

![getById](https://github.com/dev-jsmh/springBootDemoApi/assets/112201008/9d7a9fb6-82d3-49cb-af01-209fbe1efe51)


* Modify provider registered contact information
    
PUT http://Api/v1/providers/{id}


* Deletes a provider passing its corresponding it as an argument

DELETE http://Api/v1/providers/{id}

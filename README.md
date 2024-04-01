
# Demo Api 
Spring boot 3.2.2
java openJdk 17

# Enpoints for http requests



# ----- Create a new provider in the data base --------------------------

POST http://Api/v1/providers 

example: 

{
  
  "name":"Miguel",
  "phone":"308888329",
  "address": "calle 23 #4"
}
 
# ----- Returns a list of all the registered provider in the data base ---

GET http://Api/v1/providers

example: 

[
  {
    "id_provider": 1,
    "name": "jhonatan",
    "phone": "3159384893",
    "address": "calle 13 #16"
  },
  {
    "id_provider": 2,
    "name": "Angelica",
    "phone": "3159384893",
    "address": "calle 10 #26"
  },
  {
    "id_provider": 3,
    "name": "Juana",
    "phone": "30459384999",
    "address": "calle 10 #2"
  },
  {
    "id_provider": 4,
    "name": "Carlos",
    "phone": "3000003239",
    "address": "calle 34 #9"
  },
  {
    "id_provider": 5,
    "name": "Miguel",
    "phone": "308888329",
    "address": "calle 23 #4"
  }
]

#  ---- Gets an specific provider by its id number -----------------------

GET http://Api/v1/providers/{id}

example: 

{
  "id_provider": 3,
  "name": "Juana",
  "phone": "30459384999",
  "address": "calle 10 #2"
}

# ------- Modify provider registered contact information ------------------
    
PUT http://Api/v1/providers/{id}

Example: 

Before

{
  "id_provider": 3,
  "name": "Juana",
  "phone": "30459384999",
  "address": "calle 10 #2"
}

After

{
  "id_provider": 3,
  "name": "Juana Isabell",
  "phone": "30459384999",
  "address": "calle 123 #45"
}

# ------- Deletes a priver passing its corresponding it as an argument -----

DELETE http://Api/v1/providers/{id}

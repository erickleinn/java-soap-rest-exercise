-----------------PROJECT SETUP INSTRUCTIONS-----------------

1- run "docker-compose up" on the project root directory, to create the database instance;
2- run "mvn clean install" on the project root directory, to build the project;
3- run the project trough the IDE on the ExercisesApplication.java class;

**Once the application is up and running, the WSDL to execute the SOAP requests will be avaiable on the following link:
http://localhost:8080/ws/exercises.wsdl
That is also avaiable on the application.properties file, as APPLICATION_WSDL_LINK value.
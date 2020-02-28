# Demo project
This project is to show you how you can build a project in an agile manner

# Getting started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisite
You will need to download and install the following pieces of software:
* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - version 8 is recommended
* [Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)
* [MySQL](https://www.mysql.com/) 

## Installation
To run the application backend you will need to run the following lines of code
```sh
git clone https://github.com/christophperrins/ims-server
cd ims-server/server
mvn spring-boot:run
```

To check that it is running you should navigate to:
http://localhost:8080/swagger-ui.html

## Production
To change the configuration for this application, check the server/src/main/resources/application.properties.

The default configuration uses port 8080 and connects to a mysql database called ims.
The application will automatically generate the schema necessary for the application to work.

The default configuration uses the username and password for the database as "root" and "root"

## Built with
* [SpringBoot](https://spring.io/projects/spring-boot)

## Versioning
We use SemVer for versioning. For the versions available, see the tags on this repository.

## Authors
* Chris Perrins - Project lead

## License
This project is licensed under the GPL-v3 License - see the LICENSE file for details


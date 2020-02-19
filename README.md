# NORWIND Application

## This project simulate Northwind database exam of Microsoft by using:

    Restful
    Spring boot
    VAMK's MySQL: https://mysql.cc.puv.fi

## Features

    GET, POST, PUT, DELETE method
    Swagger for user interface
    Auto generates entities class, controllers & repositories

## Tool

    git/github : using git for managing ,editing and updating
    mvn : build automation tool used primarily for Java projects
    VSCode : providing java extendsive package supporting Spring Boot application

## Installation, COngiguration and Usage:
### Step 1: *Create a project from "https://start.spring.io/". And you need to add Spring Web, Spring Security, Spring Data JPA, Lombok and MySQL driver dependencies.*

### Step 2: *Config application.properties file for connecting to VAMK's database(in my case), creating PKCS12 key ,enabling https, changing port , adding swagger,and so far*

### Step 3: *Using Lombok-wired JPA, we can easilly generate entities from an existing database by running command:*

    mvn jpa-entity-generator:generateAll

### Step 4: *Create a auto-generate class for generate all the Controllers and Repositories files. Name it as generateControllerandRepository.java*

### Step 5: *Create PKCS12 Key and add that key into keystore folder after using command:

keytool -genkeypair -alias name_1 -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore name_2.p12 -validity 3650

### Step 6: *Enable HTTPS, by adding into application.properties:*


        #The format used for the keystore. It could be set to JKS in case it is a JKS file

        # server.ssl.key-store-type=PKCS12

        # The path to the keystore containing the certificate

        server.ssl.key-store=classpath:keystore/name_2.p12

        # The password used to generate the certificate

        server.ssl.key-store-password=//your_passwrd

        # The alias mapped to the certificate*

        server.ssl.key-alias=name_1

        security.require-ssl=true

### Step 7: *Create a file WebSecurityConfig.java for authentication and adding these underneath lines to application.properties:*


    spring.ldap.embedded.ldif=classpath:test-server.ldif
    spring.ldap.embedded.base-dn=dc=springframework,dc=org
    spring.ldap.embedded.port=8389


### Step 8: *Run the project by using command: mvn package:*


java -jar target/e1800930_northwind-0.0.1-SNAPSHOT.jar 

### Step 9: *Add file SpringFoxConfig.java for using swagger. Run mvn package and jar command again. Check your application in this link:*

https://localhost:8443/swagger-ui.html#/

### Step 10: *If you get return:*

**_Bad authen
Bad TLS/SSL/Certificate..._**

Or your Swagger-iu.html is not working.
Then the configuration for your TKCS12 Key certificate failed. In this case, regenerate TKCS12 again.
Replace your */keystore/_file_name.p12* with the new generated *_file_name.p12*

# GLUCK with your Project :333


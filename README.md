# Server start
Use Java v.17 </br>
to start server open command line:
</br>
java -jar PreJob-0.0.1-SNAPSHOT.jar
</br>
Server starts on the http://localhost:8089
</br>
## API
http://localhost:8089/api/articles?roleId=1&industryId=1&majorId=1&sizeId=3 -
Returns a ResponseEntity containing a list of Article objects that match the given criteria.
</br>
Parameters: </br>
roleId - the ID of the role to filter by </br>
industryId - the ID of the industry to filter by (optional) </br>
majorId - the ID of the major to filter by (optional) </br>
sizeId - the ID of the size to filter by (optional) </br>

http://localhost:8089/api/roles - 
Returns a ResponseEntity object containing a list of Role objects and an HTTP status code. </br>
HttpStatus.OK if the roles are successfully retrieved. </br>
HttpStatus.NOT_FOUND if no roles are found in the database. </br>
HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the roles.
</br>
http://localhost:8089/api/majors -
Returns a ResponseEntity object containing a list of Major objects and an HTTP status code.</br> 
HttpStatus.OK if the majors are successfully retrieved. </br>
HttpStatus.NOT_FOUND if no majors are found in the database. </br>
HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the majors.
</br>
http://localhost:8089/api/industries  -
Returns a ResponseEntity object containing a list of Industry objects and an HTTP status code. </br>
HttpStatus.OK if the industry are successfully retrieved. </br>
HttpStatus.NOT_FOUND if no industry are found in the database. </br>
HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the industry.
</br>
http://localhost:8089/api/size -
Returns a ResponseEntity object containing a list of Size objects and an HTTP status code. </br>
HttpStatus.OK if the sizes are successfully retrieved. </br>
HttpStatus.NOT_FOUND if no sizes are found in the database. </br>
HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the sizes.
</br>
## Javadoc
https://github.com/tel-ran-de/career_team_1_be/blob/main/src/documentation/com/example/prejob
## OAS
https://github.com/tel-ran-de/career_team_1_be/blob/main/src/documentation/api-docs.yaml
## ER diagram
![Components Diagram](https://github.com/tel-ran-de/career_team_1_be/blob/main/src/documentation/ER%20diagram.png)
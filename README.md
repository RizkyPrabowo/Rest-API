# PT_Sigmatech

Challenge Description
You are tasked with building a simple RESTful API for a blog application using Spring Boot. The API should allow users to create, retrieve, update, and delete blog posts.

Requirements:
- Implement an endpoint to create a blog post. The endpoint should accept a JSON payload containing the title, body, and author of the blog post. The endpoint should return the created blog post with a generated ID.
- Implement an endpoint to retrieve a single blog post by ID.
- Implement an endpoint to retrieve a list of all blog posts.
- Implement an endpoint to update a blog post by ID. The endpoint should accept a JSON payload containing the updated title, body, and author of the blog post.
- Implement an endpoint to delete a blog post by ID.

Constraints:
-    You can use H2 as temporary DB
-    All endpoints should return appropriate HTTP status codes.
-    All endpoints should follow RESTful API conventions.
-    Use Spring Boot with Spring Data JPA for data persistence.

Bonus Points:
- Use JUnit or similar for testing.
- Implement pagination for the list of blog posts endpoint.
- Implement sorting for the list of blog posts endpoint.
- Add authentication and authorization to the API.
- Use Docker to containerize the application.


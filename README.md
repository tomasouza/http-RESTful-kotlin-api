# http-RESTful-kotlin-api
Creation and exploration of RESTful principles on a http API written in kotlin.
*Criação e exploração dos princípios RESTful sobre http em kotlin.*

## Restful APIs Archtectural Constraints
1. Client-Server
2. Uniform Interface
3. Statelesness
4. Caching
5. Layered
6. Code on Demand

### Client-Server
- The Client-Server shout NOT run in same process
- Separation of concerns
  * The Server must concern with Security, Persistence, Scaling
  * The Client must concern with Authentication & Authorization, Multi form factor (Interfaces), Application
  * We can manage these specific concerns separetely
  * As long they mantain an uniform Integace with each other they can evolve separetely as well
  
### Uniform Interface
- Client and Server share a common Technical Interface (Defines the contract between client & server)
  1. Individual Resources are identified in the Request (URI/URL)
      * HTTP/1.1 GET http://api.education.com.br/courses/369 *
      * HTTP/1.1 GET http://api.education.com.br/courses/1242 *
  2. Representation of the Resources
      * Client receives the Representation of the Resource *
      ```javascript
        "course" : {
          "id" : "369",
          "name" : "Resftul api course by vjTom",
          "cost" : "Free for everyone"
        }
      ```
      * Client uses the Representation to manipulate the Resource *
## Leonard Richardson Maturity Model






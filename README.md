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

### 1. Client-Server
- The Client-Server shout NOT run in same process
- Separation of concerns
  * The Server must concern with Security, Persistence, Scaling
  * The Client must concern with Authentication & Authorization, Multi form factor (Interfaces), Application
  * We can manage these specific concerns separetely
  * As long they mantain an uniform Integace with each other they can evolve separetely as well
  
### 2. Uniform Interface
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
  3. Self decriptive messages - metadata
      * The client and server exchanges metadata like Content-type, Http Status Code, Host, Accept: application/json headers * 
  4. Hypermedia
      * The Server in response of a request may send actions (links of discovery) *
      * HATEOAS = Hypermedia As The Engine Of Application State *
      
### 3. Statelessness
- Client MUST manage its own state thus making the server Stateless
- Server receives state info from client
- Server treats each request as independent
 
### 4. Caching
- Use Caching to achieve higher Scalability and Performance
  1. Application Caching
  2. Server Caching
  3. Database Caching
  4. Gateway / Proxy Caching
- Server should specify Cache-Control Directives in responses to control Caching behavior
- HTTP Header for defining cache policies
  1. Cache-Control
  ```javascript
    - Multiple directives
    - Comma separeted list
    - Some directives have an optional argument
    - example: cache-control: public, max-age=6400
    --- Directives ---
    - No-Store -> Responses aren't allowed to be cached
    - Private -> Cache ONLY on user device
    - Public -> Resource may be cached by any cache
    - Max-Age -> Time in seconds for cache expiry
   ```
  2. Expires -> Set exact Date/Time in GMT when the resource will get expired
  3. Last-Modified -> Set Date/Time when the resource was last changed
  4. ETag -> Unique identifier associated with a response
 
## Leonard Richardson Maturity Model






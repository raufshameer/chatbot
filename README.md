# Chatbot


#### Prototype
![Prototype](chatbot-prototype.png)

#### Design
![Design](chatbot-design.png)

### How to get Anthropic API Key
https://www.anthropic.com/api
Get API key and update the key in application.properties
anthropic.api.key=<<Your_API_KEY>>

### Running in Docker Desktop
```
docker build -t chatbot .
docker run -p 8080:8080 chatbot
```

or

```
docker-compose up
```


http://localhost:8080/hello

http://localhost:8080/v3/api-docs

http://localhost:8080/swagger-ui/index.html#


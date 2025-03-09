

Start the Container 

```bash
docker run -d -p 8080:8080  castlemock/castlemock
```

Add a project to Castle Mock

```bash
curl -X POST "http://localhost:8080/castlemock/api/rest/core/project/rest/import" \
-H "accept: /" \
-H "Authorization: Basic YWRtaW46YWRtaW4=" \
-H "Content-Type: multipart/form-data" \
-F "file=@CaslteMock-Export.xml;type=text/xml"
```

Github Code Reference:
https://github.com/castlemock/castlemock/blob/master/web/web-mock/web-mock-rest/src/main/java/com/castlemock/web/mock/rest/controller/rest/RestProjectRestController.java#L270
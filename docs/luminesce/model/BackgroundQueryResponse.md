# com.finbourne.sdk.services.luminesce.model.BackgroundQueryResponse
classname BackgroundQueryResponse
Response for Background Query Start requests

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | ExecutionId of the started-query | [optional] [default to String]
**progress** | [**Link**](Link.md) |  | [optional] [default to Link]
**cancel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJson** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJsonProper** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJsonProperWithLineage** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchXml** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchParquet** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchCsv** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchPipe** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchExcel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchSqlite** | [**Link**](Link.md) |  | [optional] [default to Link]
**histogram** | [**Link**](Link.md) |  | [optional] [default to Link]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String executionId = "example executionId";
Link progress = new Link();
Link cancel = new Link();
Link fetchJson = new Link();
Link fetchJsonProper = new Link();
Link fetchJsonProperWithLineage = new Link();
Link fetchXml = new Link();
Link fetchParquet = new Link();
Link fetchCsv = new Link();
Link fetchPipe = new Link();
Link fetchExcel = new Link();
Link fetchSqlite = new Link();
Link histogram = new Link();


BackgroundQueryResponse backgroundQueryResponseInstance = new BackgroundQueryResponse()
    .executionId(executionId)
    .progress(progress)
    .cancel(cancel)
    .fetchJson(fetchJson)
    .fetchJsonProper(fetchJsonProper)
    .fetchJsonProperWithLineage(fetchJsonProperWithLineage)
    .fetchXml(fetchXml)
    .fetchParquet(fetchParquet)
    .fetchCsv(fetchCsv)
    .fetchPipe(fetchPipe)
    .fetchExcel(fetchExcel)
    .fetchSqlite(fetchSqlite)
    .histogram(histogram);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
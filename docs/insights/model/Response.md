# com.finbourne.sdk.services.insights.model.Response
classname Response
DTO of Finbourne.AspNetCore.Http.TrackingEntry.ResponseInformation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | The headers | [optional] [default to Map<String, List<String>>]
**contentLength** | **Long** | The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Response.Body (e.g. if actual Body is large, or not convertible to a string) | [optional] [default to Long]
**contentType** | **String** | The content type | [optional] [default to String]
**body** | **String** | The recorded content. | [optional] [default to String]
**bodyWasTruncated** | **Boolean** | Determines if the recorded body was truncated. | [optional] [default to Boolean]
**statusCode** | **Integer** | Http Status Code of the request. | [optional] [default to Integer]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, List<String>> headers = new Map<String, List<String>>();
@javax.annotation.Nullable Long contentLength = new Long("100.00");
@javax.annotation.Nullable String contentType = "example contentType";
@javax.annotation.Nullable String body = "example body";
Boolean bodyWasTruncated = true;
Integer statusCode = new Integer("100.00");
@javax.annotation.Nullable List<Link> links = new List<Link>();


Response responseInstance = new Response()
    .headers(headers)
    .contentLength(contentLength)
    .contentType(contentType)
    .body(body)
    .bodyWasTruncated(bodyWasTruncated)
    .statusCode(statusCode)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
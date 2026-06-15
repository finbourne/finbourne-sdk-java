# com.finbourne.sdk.services.insights.model.Request
classname Request
DTO of Finbourne.AspNetCore.Http.TrackingEntry.RequestInformation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | The headers | [optional] [default to Map<String, List<String>>]
**contentLength** | **Long** | The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Request.Body (e.g. if actual Body is large, or not convertible to a string) | [optional] [default to Long]
**contentType** | **String** | The content type | [optional] [default to String]
**body** | **String** | The recorded content. | [optional] [default to String]
**bodyWasTruncated** | **Boolean** | Determines if the recorded body was truncated. | [optional] [default to Boolean]
**method** | **String** | Method called by the request | [optional] [default to String]
**url** | **String** | URL of the request | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, List<String>> headers = new Map<String, List<String>>();
@javax.annotation.Nullable Long contentLength = new Long("100.00");
@javax.annotation.Nullable String contentType = "example contentType";
@javax.annotation.Nullable String body = "example body";
Boolean bodyWasTruncated = true;
@javax.annotation.Nullable String method = "example method";
@javax.annotation.Nullable String url = "example url";
@javax.annotation.Nullable List<Link> links = new List<Link>();


Request requestInstance = new Request()
    .headers(headers)
    .contentLength(contentLength)
    .contentType(contentType)
    .body(body)
    .bodyWasTruncated(bodyWasTruncated)
    .method(method)
    .url(url)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
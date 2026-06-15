# com.finbourne.sdk.services.insights.model.RequestLog
classname RequestLog
Holds logged information about a request performed on an API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the request. | [default to OffsetDateTime]
**application** | **String** | The name of the application that the request was made to. | [default to String]
**id** | **String** | The identifier of the request. | [default to String]
**sessionId** | **String** | The identifier of the session that the request was made in. | [optional] [default to String]
**verb** | **String** | The HTTP verb of the request. | [default to String]
**url** | **String** | The URL of the request. | [default to String]
**domain** | **String** | The domain of the request. | [optional] [default to String]
**user** | **String** | The user who made the request. | [default to String]
**userType** | **String** | The type of the user who made the request. | [optional] [default to String]
**operation** | **String** | The API operation invoked by the request. | [optional] [default to String]
**outcome** | **String** | The outcome of the request: Completed, Errored or Failed. | [default to String]
**duration** | **java.math.BigDecimal** | The duration of the request in milliseconds. | [default to java.math.BigDecimal]
**httpStatusCode** | **Integer** | The status code of the request. | [default to Integer]
**errorCode** | **String** | Error code, if the request had a failure or error. | [optional] [default to String]
**sdkLanguage** | **String** | The language of the SDK used. | [optional] [default to String]
**sdkVersion** | **String** | The version of the SDK used. | [optional] [default to String]
**sourceApplication** | **String** | The name of the application that made the request. | [optional] [default to String]
**correlationId** | **List&lt;String&gt;** | The chain of requestIds preceding this request | [optional] [default to List<String>]
**impersonatingUser** | **String** | The impersonating user. Only present if the request is an impersonated one | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.RequestLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime timestamp = OffsetDateTime.now();
String application = "example application";
String id = "example id";
@javax.annotation.Nullable String sessionId = "example sessionId";
String verb = "example verb";
String url = "example url";
@javax.annotation.Nullable String domain = "example domain";
String user = "example user";
@javax.annotation.Nullable String userType = "example userType";
@javax.annotation.Nullable String operation = "example operation";
String outcome = "example outcome";
java.math.BigDecimal duration = new java.math.BigDecimal("100.00");
Integer httpStatusCode = new Integer("100.00");
@javax.annotation.Nullable String errorCode = "example errorCode";
@javax.annotation.Nullable String sdkLanguage = "example sdkLanguage";
@javax.annotation.Nullable String sdkVersion = "example sdkVersion";
@javax.annotation.Nullable String sourceApplication = "example sourceApplication";
@javax.annotation.Nullable List<String> correlationId = new List<String>();
@javax.annotation.Nullable String impersonatingUser = "example impersonatingUser";
@javax.annotation.Nullable List<Link> links = new List<Link>();


RequestLog requestLogInstance = new RequestLog()
    .timestamp(timestamp)
    .application(application)
    .id(id)
    .sessionId(sessionId)
    .verb(verb)
    .url(url)
    .domain(domain)
    .user(user)
    .userType(userType)
    .operation(operation)
    .outcome(outcome)
    .duration(duration)
    .httpStatusCode(httpStatusCode)
    .errorCode(errorCode)
    .sdkLanguage(sdkLanguage)
    .sdkVersion(sdkVersion)
    .sourceApplication(sourceApplication)
    .correlationId(correlationId)
    .impersonatingUser(impersonatingUser)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
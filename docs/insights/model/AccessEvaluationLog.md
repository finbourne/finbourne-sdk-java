# com.finbourne.sdk.services.insights.model.AccessEvaluationLog
classname AccessEvaluationLog
Holds logged information about an access check performed on an API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the access evaluation. | [default to OffsetDateTime]
**application** | **String** | The name of the application that the request was made from. | [default to String]
**id** | **String** | The ID of the access evaluation. | [default to String]
**requestId** | **String** | The identifier of the request. | [optional] [default to String]
**sessionId** | **String** | The identifier of the session that the request was made in. | [optional] [default to String]
**user** | **String** | The user who made the request. | [default to String]
**userType** | **String** | The type of the user who made the request. | [optional] [default to String]
**duration** | **java.math.BigDecimal** | The duration of the access evaluation. | [default to java.math.BigDecimal]
**result** | **String** | The result of the access evaluation. | [optional] [default to String]
**authoritativeRoleId** | **String** | The role that matched the access evaluation to provide a result. | [optional] [default to String]
**authoritativePolicyId** | **String** | The policy that matched the access evaluation to provide a result. | [optional] [default to String]
**authoritativeSelector** | **String** | The selector that matched the access evaluation to provide a result. | [optional] [default to String]
**resourceType** | **String** | The type of the resource that the access evaluation is for. | [optional] [default to String]
**action** | **String** | The action key of the access evaluation. | [optional] [default to String]
**resource** | **Map&lt;String, String&gt;** | The ID of the resource that the access evaluation is for. If the ResourceID could not be converted to a dictionary, it will return a single-value dictionary with the key \&quot;resourceId\&quot;. | [optional] [default to Map<String, String>]
**resourceFromEffectiveDate** | **String** | The From effective date of the resource. | [optional] [default to String]
**resourceToEffectiveDate** | **String** | The To effective date of the resource. | [optional] [default to String]
**resourceFromAsAt** | **String** | The From AsAt date of the resource. | [optional] [default to String]
**resourceToAsAt** | **String** | The To AsAt date of the resource. | [optional] [default to String]
**accessExecutionTime** | **String** | The execution time of the entitlement. | [optional] [default to String]
**accessAsAtTime** | **String** | The AsAt time of the entitlement. | [optional] [default to String]
**requiredLicencePolicyId** | **String** | ID of the required licence policy. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.AccessEvaluationLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime timestamp = OffsetDateTime.now();
String application = "example application";
String id = "example id";
@javax.annotation.Nullable String requestId = "example requestId";
@javax.annotation.Nullable String sessionId = "example sessionId";
String user = "example user";
@javax.annotation.Nullable String userType = "example userType";
java.math.BigDecimal duration = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String result = "example result";
@javax.annotation.Nullable String authoritativeRoleId = "example authoritativeRoleId";
@javax.annotation.Nullable String authoritativePolicyId = "example authoritativePolicyId";
@javax.annotation.Nullable String authoritativeSelector = "example authoritativeSelector";
@javax.annotation.Nullable String resourceType = "example resourceType";
@javax.annotation.Nullable String action = "example action";
@javax.annotation.Nullable Map<String, String> resource = new Map<String, String>();
@javax.annotation.Nullable String resourceFromEffectiveDate = "example resourceFromEffectiveDate";
@javax.annotation.Nullable String resourceToEffectiveDate = "example resourceToEffectiveDate";
@javax.annotation.Nullable String resourceFromAsAt = "example resourceFromAsAt";
@javax.annotation.Nullable String resourceToAsAt = "example resourceToAsAt";
@javax.annotation.Nullable String accessExecutionTime = "example accessExecutionTime";
@javax.annotation.Nullable String accessAsAtTime = "example accessAsAtTime";
@javax.annotation.Nullable String requiredLicencePolicyId = "example requiredLicencePolicyId";
@javax.annotation.Nullable List<Link> links = new List<Link>();


AccessEvaluationLog accessEvaluationLogInstance = new AccessEvaluationLog()
    .timestamp(timestamp)
    .application(application)
    .id(id)
    .requestId(requestId)
    .sessionId(sessionId)
    .user(user)
    .userType(userType)
    .duration(duration)
    .result(result)
    .authoritativeRoleId(authoritativeRoleId)
    .authoritativePolicyId(authoritativePolicyId)
    .authoritativeSelector(authoritativeSelector)
    .resourceType(resourceType)
    .action(action)
    .resource(resource)
    .resourceFromEffectiveDate(resourceFromEffectiveDate)
    .resourceToEffectiveDate(resourceToEffectiveDate)
    .resourceFromAsAt(resourceFromAsAt)
    .resourceToAsAt(resourceToAsAt)
    .accessExecutionTime(accessExecutionTime)
    .accessAsAtTime(accessAsAtTime)
    .requiredLicencePolicyId(requiredLicencePolicyId)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.insights.model.VendorLog
classname VendorLog
Holds logged information about a request made to an external vendor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of a log entry. | [default to String]
**provider** | **String** | The provider or service name. | [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of when the log was generated. | [default to OffsetDateTime]
**type** | **String** | Type of log. Possible values: HttpResponse. | [default to String]
**destinationUrl** | **String** | The destination URL of the task. | [default to String]
**operation** | **String** | The operation performed. Possible values: Evaluate. | [default to String]
**outcome** | **String** | The outcome of the operation. Possible values: Success, Failure. | [default to String]
**duration** | **java.math.BigDecimal** | The duration of the operation in ms. | [default to java.math.BigDecimal]
**httpStatusCode** | **Integer** | The status code of the operation. | [default to Integer]
**userId** | **String** | The user that made the request to LUSID. | [default to String]
**requestId** | **String** | The ID of the request to LUSID. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.VendorLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String provider = "example provider";
OffsetDateTime timestamp = OffsetDateTime.now();
String type = "example type";
String destinationUrl = "example destinationUrl";
String operation = "example operation";
String outcome = "example outcome";
java.math.BigDecimal duration = new java.math.BigDecimal("100.00");
Integer httpStatusCode = new Integer("100.00");
String userId = "example userId";
String requestId = "example requestId";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VendorLog vendorLogInstance = new VendorLog()
    .id(id)
    .provider(provider)
    .timestamp(timestamp)
    .type(type)
    .destinationUrl(destinationUrl)
    .operation(operation)
    .outcome(outcome)
    .duration(duration)
    .httpStatusCode(httpStatusCode)
    .userId(userId)
    .requestId(requestId)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
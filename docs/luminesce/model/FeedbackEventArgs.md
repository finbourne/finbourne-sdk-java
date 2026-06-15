# com.finbourne.sdk.services.luminesce.model.FeedbackEventArgs
classname FeedbackEventArgs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**when** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**sessionId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**executionId** | [**UUID**](UUID.md) |  | [optional] [default to UUID]
**level** | [**FeedbackLevel**](FeedbackLevel.md) |  | [optional] [default to FeedbackLevel]
**sender** | **String** |  | [optional] [default to String]
**stateId** | **Integer** |  | [optional] [default to Integer]
**messageTemplate** | **String** |  | [optional] [default to String]
**propertyValues** | **List&lt;Object&gt;** |  | [optional] [default to List<Object>]
**message** | **String** |  | [optional] [readonly] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.FeedbackEventArgs;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime when = OffsetDateTime.now();
UUID sessionId = "example sessionId";
UUID executionId = "example executionId";
FeedbackLevel @javax.annotation.Nullable String sender = "example sender";
@javax.annotation.Nullable Integer stateId = new Integer("100.00");
@javax.annotation.Nullable String messageTemplate = "example messageTemplate";
@javax.annotation.Nullable List<Object> propertyValues = new List<Object>();
@javax.annotation.Nullable String message = "example message";


FeedbackEventArgs feedbackEventArgsInstance = new FeedbackEventArgs()
    .when(when)
    .sessionId(sessionId)
    .executionId(executionId)
    .level(level)
    .sender(sender)
    .stateId(stateId)
    .messageTemplate(messageTemplate)
    .propertyValues(propertyValues)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
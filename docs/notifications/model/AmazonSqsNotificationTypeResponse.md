# com.finbourne.sdk.services.notifications.model.AmazonSqsNotificationTypeResponse
classname AmazonSqsNotificationTypeResponse
Holds readonly information about an AWS SQS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [optional] [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [optional] [default to String]
**body** | **String** | The body of the Amazon Queue Message | [optional] [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.AmazonSqsNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String apiKeyRef = "example apiKeyRef";
@javax.annotation.Nullable String apiSecretRef = "example apiSecretRef";
@javax.annotation.Nullable String body = "example body";
@javax.annotation.Nullable String queueUrlRef = "example queueUrlRef";


AmazonSqsNotificationTypeResponse amazonSqsNotificationTypeResponseInstance = new AmazonSqsNotificationTypeResponse()
    .type(type)
    .apiKeyRef(apiKeyRef)
    .apiSecretRef(apiSecretRef)
    .body(body)
    .queueUrlRef(queueUrlRef);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
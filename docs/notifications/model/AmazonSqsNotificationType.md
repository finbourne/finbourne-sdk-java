# com.finbourne.sdk.services.notifications.model.AmazonSqsNotificationType
classname AmazonSqsNotificationType
The information required to create or update an AWS SQS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**apiKeyRef** | **String** | Reference to API key from Configuration Store | [default to String]
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | [default to String]
**body** | **String** | The body of the Amazon Queue Message | [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [default to String]

```java
import com.finbourne.sdk.services.notifications.model.AmazonSqsNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String apiKeyRef = "example apiKeyRef";
String apiSecretRef = "example apiSecretRef";
String body = "example body";
String queueUrlRef = "example queueUrlRef";


AmazonSqsNotificationType amazonSqsNotificationTypeInstance = new AmazonSqsNotificationType()
    .type(type)
    .apiKeyRef(apiKeyRef)
    .apiSecretRef(apiSecretRef)
    .body(body)
    .queueUrlRef(queueUrlRef);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
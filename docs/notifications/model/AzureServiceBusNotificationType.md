# com.finbourne.sdk.services.notifications.model.AzureServiceBusNotificationType
classname AzureServiceBusNotificationType
The information required to create or update an Azure Service Bus notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**namespace** | **String** | Reference to namespace from Configuration Store | [default to String]
**queueName** | **String** | Reference to queue name from Configuration Store | [default to String]
**body** | **String** | The body of the Azure Service Bus Message | [default to String]
**tenantId** | **String** | Reference to tenant id from Configuration Store | [default to String]
**clientId** | **String** | Reference to client id from Configuration Store | [default to String]
**clientSecret** | **String** | Reference to client secret from Configuration Store | [default to String]
**applicationProperties** | **Map&lt;String, String&gt;** | Optional key-value pairs to attach to the Azure Service Bus message envelope. | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.notifications.model.AzureServiceBusNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String namespace = "example namespace";
String queueName = "example queueName";
String body = "example body";
String tenantId = "example tenantId";
String clientId = "example clientId";
String clientSecret = "example clientSecret";
@javax.annotation.Nullable Map<String, String> applicationProperties = new Map<String, String>();


AzureServiceBusNotificationType azureServiceBusNotificationTypeInstance = new AzureServiceBusNotificationType()
    .type(type)
    .namespace(namespace)
    .queueName(queueName)
    .body(body)
    .tenantId(tenantId)
    .clientId(clientId)
    .clientSecret(clientSecret)
    .applicationProperties(applicationProperties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
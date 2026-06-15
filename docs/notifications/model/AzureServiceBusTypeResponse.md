# com.finbourne.sdk.services.notifications.model.AzureServiceBusTypeResponse
classname AzureServiceBusTypeResponse
Holds readonly information about an Azure Service Bus notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**namespaceRef** | **String** | Reference to namespace from Configuration Store | [optional] [default to String]
**queueNameRef** | **String** | Reference to queue name from Configuration Store | [optional] [default to String]
**body** | **String** | The body of the Azure service bus Message | [optional] [default to String]
**tenantIdRef** | **String** | Reference to tenant id  from Configuration Store | [optional] [default to String]
**clientIdRef** | **String** | Reference to client id from Configuration Store | [optional] [default to String]
**clientSecretRef** | **String** | Reference to client secret from Configuration Store | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.AzureServiceBusTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String namespaceRef = "example namespaceRef";
@javax.annotation.Nullable String queueNameRef = "example queueNameRef";
@javax.annotation.Nullable String body = "example body";
@javax.annotation.Nullable String tenantIdRef = "example tenantIdRef";
@javax.annotation.Nullable String clientIdRef = "example clientIdRef";
@javax.annotation.Nullable String clientSecretRef = "example clientSecretRef";


AzureServiceBusTypeResponse azureServiceBusTypeResponseInstance = new AzureServiceBusTypeResponse()
    .type(type)
    .namespaceRef(namespaceRef)
    .queueNameRef(queueNameRef)
    .body(body)
    .tenantIdRef(tenantIdRef)
    .clientIdRef(clientIdRef)
    .clientSecretRef(clientSecretRef);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
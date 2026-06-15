# com.finbourne.sdk.services.notifications.model.Delivery
classname Delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The identifier of the delivery. | [default to UUID]
**eventId** | **String** | The identifier of the associated event. | [default to String]
**subscriptionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**notificationId** | **String** | The identifier of the associated notification. | [default to String]
**deliveryChannel** | **String** | The delivery channel of the message. | [default to String]
**messageDetails** | **String** | The Details of the delivery message as JSON string. | [default to String]
**attempts** | [**List&lt;Attempt&gt;**](Attempt.md) | A list of all the delivery attempts made for this message. | [default to List<Attempt>]

```java
import com.finbourne.sdk.services.notifications.model.Delivery;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID id = "example id";
String eventId = "example eventId";
ResourceId subscriptionId = new ResourceId();
String notificationId = "example notificationId";
String deliveryChannel = "example deliveryChannel";
String messageDetails = "example messageDetails";
List<Attempt> attempts = new List<Attempt>();


Delivery deliveryInstance = new Delivery()
    .id(id)
    .eventId(eventId)
    .subscriptionId(subscriptionId)
    .notificationId(notificationId)
    .deliveryChannel(deliveryChannel)
    .messageDetails(messageDetails)
    .attempts(attempts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
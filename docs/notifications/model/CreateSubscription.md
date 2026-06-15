# com.finbourne.sdk.services.notifications.model.CreateSubscription
classname CreateSubscription
The information required to create a subscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the subscription | [default to String]
**description** | **String** | The summary of the services provided by the subscription | [optional] [default to String]
**status** | **String** | The current status of the subscription. Possible values are: Active, Inactive | [default to String]
**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  | [default to MatchingPattern]
**useAsAuth** | **String** | Id of user associated with subscription. All events associated with  the subscription will use this user to check entitlements against  the resource to send a notification. Can be null, in which case  we&#39;ll default to that of the user making this request | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.CreateSubscription;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
MatchingPattern matchingPattern = new MatchingPattern();
@javax.annotation.Nullable String useAsAuth = "example useAsAuth";


CreateSubscription createSubscriptionInstance = new CreateSubscription()
    .id(id)
    .displayName(displayName)
    .description(description)
    .status(status)
    .matchingPattern(matchingPattern)
    .useAsAuth(useAsAuth);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
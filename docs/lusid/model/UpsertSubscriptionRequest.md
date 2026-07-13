# com.finbourne.sdk.services.lusid.model.UpsertSubscriptionRequest
classname UpsertSubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscription** | [**SubscriptionDefinition**](SubscriptionDefinition.md) |  | [default to SubscriptionDefinition]

```java
import com.finbourne.sdk.services.lusid.model.UpsertSubscriptionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

SubscriptionDefinition subscription = new SubscriptionDefinition();


UpsertSubscriptionRequest upsertSubscriptionRequestInstance = new UpsertSubscriptionRequest()
    .subscription(subscription);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
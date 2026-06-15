# com.finbourne.sdk.services.notifications.model.Subscription
classname Subscription
A subscription object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the subscription | [default to String]
**description** | **String** | The summary of the services provided by the subscription | [optional] [default to String]
**status** | **String** | The current status of the subscription | [default to String]
**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  | [default to MatchingPattern]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was made | [default to OffsetDateTime]
**userIdCreated** | **String** | The user who made the subscription | [default to String]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was last modified | [default to OffsetDateTime]
**userIdModified** | **String** | The user who last modified the subscription | [default to String]
**useAsAuth** | **String** | The user to use as auth for the subscription | [default to String]
**href** | [**URI**](URI.md) | A URI for retrieving this subscription | [optional] [default to URI]

```java
import com.finbourne.sdk.services.notifications.model.Subscription;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
MatchingPattern matchingPattern = new MatchingPattern();
OffsetDateTime createdAt = OffsetDateTime.now();
String userIdCreated = "example userIdCreated";
OffsetDateTime modifiedAt = OffsetDateTime.now();
String userIdModified = "example userIdModified";
String useAsAuth = "example useAsAuth";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");


Subscription subscriptionInstance = new Subscription()
    .id(id)
    .displayName(displayName)
    .description(description)
    .status(status)
    .matchingPattern(matchingPattern)
    .createdAt(createdAt)
    .userIdCreated(userIdCreated)
    .modifiedAt(modifiedAt)
    .userIdModified(userIdModified)
    .useAsAuth(useAsAuth)
    .href(href);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
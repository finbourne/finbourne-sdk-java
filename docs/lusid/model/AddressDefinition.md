# com.finbourne.sdk.services.lusid.model.AddressDefinition
classname AddressDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the address key. | [optional] [default to String]
**type** | **String** | Available values: String, Int, Decimal, DateTime, Boolean, ResultValue, Result0D, Json. | [optional] [default to String]
**description** | **String** | The description for this result. | [optional] [default to String]
**lifeCycleStatus** | **String** | What is the status of the address path. If it is not Production then it might be removed at some point in the future.  See the removal date for the likely timing of that if any. | [optional] [default to String]
**removalDate** | [**OffsetDateTime**](OffsetDateTime.md) | If the life-cycle status of the address is Deprecated then this is the date at which support of the address will be suspended.  After that date it will be removed at the earliest possible point subject to any specific contractual support and development constraints. | [optional] [default to OffsetDateTime]
**documentationLink** | **String** | Contains a link to the documentation for this AddressDefinition in KnowledgeBase. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AddressDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
String type = "example type";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String lifeCycleStatus = "example lifeCycleStatus";
@javax.annotation.Nullable OffsetDateTime removalDate = OffsetDateTime.now();
@javax.annotation.Nullable String documentationLink = "example documentationLink";


AddressDefinition addressDefinitionInstance = new AddressDefinition()
    .displayName(displayName)
    .type(type)
    .description(description)
    .lifeCycleStatus(lifeCycleStatus)
    .removalDate(removalDate)
    .documentationLink(documentationLink);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
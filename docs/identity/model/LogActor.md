# com.finbourne.sdk.services.identity.model.LogActor
classname LogActor
Represents a LogActor resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]
**alternateId** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**detailEntry** | **Map&lt;String, Object&gt;** |  | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.identity.model.LogActor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String alternateId = "example alternateId";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable Map<String, Object> detailEntry = new Map<String, Object>();


LogActor logActorInstance = new LogActor()
    .id(id)
    .type(type)
    .alternateId(alternateId)
    .displayName(displayName)
    .detailEntry(detailEntry);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
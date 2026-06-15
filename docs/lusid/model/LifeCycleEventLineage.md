# com.finbourne.sdk.services.lusid.model.LifeCycleEventLineage
classname LifeCycleEventLineage
The lineage of the event value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of the event | [optional] [default to String]
**instrumentType** | **String** | The instrument type of the instrument for the event. | [optional] [default to String]
**instrumentId** | **String** | The LUID of the instrument for the event. | [optional] [default to String]
**legId** | **String** | Leg id for the event. | [optional] [default to String]
**sourceTransactionId** | **String** | The source transaction of the instrument for the event. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LifeCycleEventLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String eventType = "example eventType";
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String legId = "example legId";
@javax.annotation.Nullable String sourceTransactionId = "example sourceTransactionId";


LifeCycleEventLineage lifeCycleEventLineageInstance = new LifeCycleEventLineage()
    .eventType(eventType)
    .instrumentType(instrumentType)
    .instrumentId(instrumentId)
    .legId(legId)
    .sourceTransactionId(sourceTransactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
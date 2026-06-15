# com.finbourne.sdk.services.lusid.model.DataPointVersion
classname DataPointVersion
The version metadata for DataPoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was first created in LUSID. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created the entity. | [optional] [default to String]
**requestIdCreated** | **String** | The unique request id of the command that created the entity. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity (including its properties) was last updated in LUSID. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**requestIdModified** | **String** | The unique request id of the command that last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**entityUniqueId** | **String** | The unique id of the entity | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DataPointVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAtCreated = OffsetDateTime.now();
@javax.annotation.Nullable String userIdCreated = "example userIdCreated";
@javax.annotation.Nullable String requestIdCreated = "example requestIdCreated";
@javax.annotation.Nullable OffsetDateTime asAtModified = OffsetDateTime.now();
@javax.annotation.Nullable String userIdModified = "example userIdModified";
@javax.annotation.Nullable String requestIdModified = "example requestIdModified";
@javax.annotation.Nullable Integer asAtVersionNumber = new Integer("100.00");
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";


DataPointVersion dataPointVersionInstance = new DataPointVersion()
    .asAtCreated(asAtCreated)
    .userIdCreated(userIdCreated)
    .requestIdCreated(requestIdCreated)
    .asAtModified(asAtModified)
    .userIdModified(userIdModified)
    .requestIdModified(requestIdModified)
    .asAtVersionNumber(asAtVersionNumber)
    .entityUniqueId(entityUniqueId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
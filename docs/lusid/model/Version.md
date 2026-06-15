# com.finbourne.sdk.services.lusid.model.Version
classname Version
The version metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which this version became valid. Only applies when a single entity is being interacted with. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the data was committed to LUSID. | [default to OffsetDateTime]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity was first created in LUSID. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created the entity. | [optional] [default to String]
**requestIdCreated** | **String** | The unique request id of the command that created the entity. | [optional] [default to String]
**reasonCreated** | **String** | The reason for an entity creation. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the entity (including its properties) was last updated in LUSID. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**requestIdModified** | **String** | The unique request id of the command that last updated the entity (including its properties) in LUSID. | [optional] [default to String]
**reasonModified** | **String** | The reason for an entity modification. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) | [optional] [default to Integer]
**entityUniqueId** | **String** | The unique id of the entity | [optional] [default to String]
**stagedModificationIdModified** | **String** | The ID of the staged change that resulted in the most recent modification. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Version;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime asAtDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtCreated = OffsetDateTime.now();
@javax.annotation.Nullable String userIdCreated = "example userIdCreated";
@javax.annotation.Nullable String requestIdCreated = "example requestIdCreated";
@javax.annotation.Nullable String reasonCreated = "example reasonCreated";
@javax.annotation.Nullable OffsetDateTime asAtModified = OffsetDateTime.now();
@javax.annotation.Nullable String userIdModified = "example userIdModified";
@javax.annotation.Nullable String requestIdModified = "example requestIdModified";
@javax.annotation.Nullable String reasonModified = "example reasonModified";
@javax.annotation.Nullable Integer asAtVersionNumber = new Integer("100.00");
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
@javax.annotation.Nullable String stagedModificationIdModified = "example stagedModificationIdModified";


Version versionInstance = new Version()
    .effectiveFrom(effectiveFrom)
    .asAtDate(asAtDate)
    .asAtCreated(asAtCreated)
    .userIdCreated(userIdCreated)
    .requestIdCreated(requestIdCreated)
    .reasonCreated(reasonCreated)
    .asAtModified(asAtModified)
    .userIdModified(userIdModified)
    .requestIdModified(requestIdModified)
    .reasonModified(reasonModified)
    .asAtVersionNumber(asAtVersionNumber)
    .entityUniqueId(entityUniqueId)
    .stagedModificationIdModified(stagedModificationIdModified);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
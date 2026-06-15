# com.finbourne.sdk.services.workflow.model.VersionInfo
classname VersionInfo
The version metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entity was first created. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created this entity. | [optional] [default to String]
**requestIdCreated** | **String** | The request id of the request that created this entity. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entity was last updated. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated this entity. | [optional] [default to String]
**requestIdModified** | **String** | The request id of the request that last updated this entity. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for this entity (the entity was created at version 1). | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.VersionInfo;
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


VersionInfo versionInfoInstance = new VersionInfo()
    .asAtCreated(asAtCreated)
    .userIdCreated(userIdCreated)
    .requestIdCreated(requestIdCreated)
    .asAtModified(asAtModified)
    .userIdModified(userIdModified)
    .requestIdModified(requestIdModified)
    .asAtVersionNumber(asAtVersionNumber);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
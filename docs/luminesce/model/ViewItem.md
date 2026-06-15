# com.finbourne.sdk.services.luminesce.model.ViewItem
classname ViewItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the view | [optional] [default to String]
**domain** | **String** | The domain the view applies to | [optional] [default to String]
**filePath** | **String** | The full file path in the HcFs | [optional] [default to String]
**fileContent** | **String** | The full file content in the HcFs. This will be needed for Upserting the view to a different domain / for use in fbn-config. | [optional] [default to String]
**lastUpdatedExecutionId** | [**UUID**](UUID.md) | The last ExecutionId, needed to get the creating Sql out of the logs | [optional] [default to UUID]
**lastUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The last updated at time, needed to get the creating Sql out of the logs | [optional] [default to OffsetDateTime]
**lastUpdatedBy** | **String** | The last updated by this user | [optional] [default to String]
**createdByUserId** | **String** | Originally created by this user | [optional] [default to String]
**notes** | **String** | Any notes around saving or whatnot | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ViewItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String domain = "example domain";
@javax.annotation.Nullable String filePath = "example filePath";
@javax.annotation.Nullable String fileContent = "example fileContent";
@javax.annotation.Nullable UUID lastUpdatedExecutionId = "example lastUpdatedExecutionId";
@javax.annotation.Nullable OffsetDateTime lastUpdatedAt = OffsetDateTime.now();
@javax.annotation.Nullable String lastUpdatedBy = "example lastUpdatedBy";
@javax.annotation.Nullable String createdByUserId = "example createdByUserId";
@javax.annotation.Nullable String notes = "example notes";


ViewItem viewItemInstance = new ViewItem()
    .name(name)
    .domain(domain)
    .filePath(filePath)
    .fileContent(fileContent)
    .lastUpdatedExecutionId(lastUpdatedExecutionId)
    .lastUpdatedAt(lastUpdatedAt)
    .lastUpdatedBy(lastUpdatedBy)
    .createdByUserId(createdByUserId)
    .notes(notes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.StagedModification
classname StagedModification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique Id for the staged modification | [optional] [default to String]
**asAtStaged** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which the modification was staged. | [optional] [default to OffsetDateTime]
**userIdStaged** | **String** | Id of the user who created the stage modification request. | [optional] [default to String]
**requestedIdStaged** | **String** | The Request Id that initiated this staged modification. | [optional] [default to String]
**requestReason** | **String** | The Request Reason from the context that initiated this staged modification. | [optional] [default to String]
**action** | **String** | Type of action of the staged modification, either create, update or delete. | [optional] [default to String]
**stagingRule** | [**StagedModificationStagingRule**](StagedModificationStagingRule.md) |  | [optional] [default to StagedModificationStagingRule]
**decisions** | [**List&lt;StagedModificationDecision&gt;**](StagedModificationDecision.md) | Object containing information relating to the decision on the staged modification. | [optional] [default to List<StagedModificationDecision>]
**decisionsCount** | **Integer** | Number of decisions made. | [optional] [default to Integer]
**status** | **String** | The status of the staged modification. | [optional] [default to String]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which the modification was closed by either rejection or approval. | [optional] [default to OffsetDateTime]
**entityType** | **String** | The type of the entity that the staged modification applies to. | [optional] [default to String]
**scope** | **String** | The scope of the entity that this staged modification applies to. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the entity the staged modification applies to. | [optional] [default to String]
**requestedChanges** | [**RequestedChanges**](RequestedChanges.md) |  | [optional] [default to RequestedChanges]
**entityHrefs** | [**StagedModificationsEntityHrefs**](StagedModificationsEntityHrefs.md) |  | [optional] [default to StagedModificationsEntityHrefs]
**displayName** | **String** | The display name of the entity the staged modification applies to. | [optional] [default to String]
**sourceEntity** | [**StagedModificationSourceEntity**](StagedModificationSourceEntity.md) |  | [optional] [default to StagedModificationSourceEntity]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.StagedModification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
OffsetDateTime asAtStaged = OffsetDateTime.now();
@javax.annotation.Nullable String userIdStaged = "example userIdStaged";
@javax.annotation.Nullable String requestedIdStaged = "example requestedIdStaged";
@javax.annotation.Nullable String requestReason = "example requestReason";
@javax.annotation.Nullable String action = "example action";
StagedModificationStagingRule stagingRule = new StagedModificationStagingRule();
@javax.annotation.Nullable List<StagedModificationDecision> decisions = new List<StagedModificationDecision>();
Integer decisionsCount = new Integer("100.00");
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable OffsetDateTime asAtClosed = OffsetDateTime.now();
@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
RequestedChanges requestedChanges = new RequestedChanges();
StagedModificationsEntityHrefs entityHrefs = new StagedModificationsEntityHrefs();
@javax.annotation.Nullable String displayName = "example displayName";
StagedModificationSourceEntity sourceEntity = new StagedModificationSourceEntity();
@javax.annotation.Nullable List<Link> links = new List<Link>();


StagedModification stagedModificationInstance = new StagedModification()
    .id(id)
    .asAtStaged(asAtStaged)
    .userIdStaged(userIdStaged)
    .requestedIdStaged(requestedIdStaged)
    .requestReason(requestReason)
    .action(action)
    .stagingRule(stagingRule)
    .decisions(decisions)
    .decisionsCount(decisionsCount)
    .status(status)
    .asAtClosed(asAtClosed)
    .entityType(entityType)
    .scope(scope)
    .entityUniqueId(entityUniqueId)
    .requestedChanges(requestedChanges)
    .entityHrefs(entityHrefs)
    .displayName(displayName)
    .sourceEntity(sourceEntity)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
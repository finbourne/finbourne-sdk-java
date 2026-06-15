# com.finbourne.sdk.services.lusid.model.ChangeIntervalWithOrderManagementDetail
classname ChangeIntervalWithOrderManagementDetail
Defines a change that occured for an entity, with extra detail about the change

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | **Map&lt;String, String&gt;** | Information about the particular instance of the ChangeInterval (supplied information depends on the type of Action). Contains extra detail for order management actions such as related entity ids and compliance run details. | [optional] [default to Map<String, String>]
**actionDescription** | **String** | Description of the action performed on the entity. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The date/time of the change. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique identifier of the user that made the change. | [optional] [default to String]
**requestIdModified** | **String** | The unique identifier of the request that the changes were part of. | [optional] [default to String]
**reasonModified** | **String** | The reason for an entity modification. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The version number for the entity (the entity was created at version 1). This may refer to the version number of a changed related entity, not a change for the entity itself. | [optional] [default to Integer]
**stagedModificationIdModified** | **String** | The id of the staged modification that was approved. Will be null if the change didn&#39;t come from a staged modification. | [optional] [default to String]
**action** | **String** | The action performed on the field. | [optional] [default to String]
**attributeName** | **String** | The name of the field or property that has been changed. | [optional] [default to String]
**previousValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**newValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**effectiveRange** | [**EffectiveRange**](EffectiveRange.md) |  | [optional] [default to EffectiveRange]
**isInherited** | **Boolean** | Indicates whether this change interval is a result of a change to an ancestor or the entity itself. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ChangeIntervalWithOrderManagementDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> detail = new Map<String, String>();
@javax.annotation.Nullable String actionDescription = "example actionDescription";
OffsetDateTime asAtModified = OffsetDateTime.now();
@javax.annotation.Nullable String userIdModified = "example userIdModified";
@javax.annotation.Nullable String requestIdModified = "example requestIdModified";
@javax.annotation.Nullable String reasonModified = "example reasonModified";
Integer asAtVersionNumber = new Integer("100.00");
@javax.annotation.Nullable String stagedModificationIdModified = "example stagedModificationIdModified";
@javax.annotation.Nullable String action = "example action";
@javax.annotation.Nullable String attributeName = "example attributeName";
PropertyValue previousValue = new PropertyValue();
PropertyValue newValue = new PropertyValue();
EffectiveRange effectiveRange = new EffectiveRange();
Boolean isInherited = true;


ChangeIntervalWithOrderManagementDetail changeIntervalWithOrderManagementDetailInstance = new ChangeIntervalWithOrderManagementDetail()
    .detail(detail)
    .actionDescription(actionDescription)
    .asAtModified(asAtModified)
    .userIdModified(userIdModified)
    .requestIdModified(requestIdModified)
    .reasonModified(reasonModified)
    .asAtVersionNumber(asAtVersionNumber)
    .stagedModificationIdModified(stagedModificationIdModified)
    .action(action)
    .attributeName(attributeName)
    .previousValue(previousValue)
    .newValue(newValue)
    .effectiveRange(effectiveRange)
    .isInherited(isInherited);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
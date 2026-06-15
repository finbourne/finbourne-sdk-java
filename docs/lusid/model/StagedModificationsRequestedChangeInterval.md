# com.finbourne.sdk.services.lusid.model.StagedModificationsRequestedChangeInterval
classname StagedModificationsRequestedChangeInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | Name of the property the change applies to. | [optional] [default to String]
**effectiveRange** | [**StagedModificationEffectiveRange**](StagedModificationEffectiveRange.md) |  | [optional] [default to StagedModificationEffectiveRange]
**previousValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**newValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**asAtBasis** | **String** | Whether the change represents the modification when the request was made or the modification as it would be at the latest time. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationsRequestedChangeInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String attributeName = "example attributeName";
StagedModificationEffectiveRange effectiveRange = new StagedModificationEffectiveRange();
PropertyValue previousValue = new PropertyValue();
PropertyValue newValue = new PropertyValue();
@javax.annotation.Nullable String asAtBasis = "example asAtBasis";
@javax.annotation.Nullable List<Link> links = new List<Link>();


StagedModificationsRequestedChangeInterval stagedModificationsRequestedChangeIntervalInstance = new StagedModificationsRequestedChangeInterval()
    .attributeName(attributeName)
    .effectiveRange(effectiveRange)
    .previousValue(previousValue)
    .newValue(newValue)
    .asAtBasis(asAtBasis)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
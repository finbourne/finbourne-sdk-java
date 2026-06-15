# com.finbourne.sdk.services.lusid.model.StagedModificationEffectiveRange
classname StagedModificationEffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime that this requested change is effective from. | [optional] [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime that this requested change is effective until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationEffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime fromDate = OffsetDateTime.now();
OffsetDateTime untilDate = OffsetDateTime.now();


StagedModificationEffectiveRange stagedModificationEffectiveRangeInstance = new StagedModificationEffectiveRange()
    .fromDate(fromDate)
    .untilDate(untilDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
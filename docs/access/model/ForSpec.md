# com.finbourne.sdk.services.access.model.ForSpec
classname ForSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtRangeForSpec** | [**AsAtRangeForSpec**](AsAtRangeForSpec.md) |  | [optional] [default to AsAtRangeForSpec]
**asAtRelative** | [**AsAtRelative**](AsAtRelative.md) |  | [optional] [default to AsAtRelative]
**effectiveDateHasQuality** | [**EffectiveDateHasQuality**](EffectiveDateHasQuality.md) |  | [optional] [default to EffectiveDateHasQuality]
**effectiveDateRelative** | [**EffectiveDateRelative**](EffectiveDateRelative.md) |  | [optional] [default to EffectiveDateRelative]
**effectiveRange** | [**EffectiveRange**](EffectiveRange.md) |  | [optional] [default to EffectiveRange]

```java
import com.finbourne.sdk.services.access.model.ForSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

AsAtRangeForSpec asAtRangeForSpec = new AsAtRangeForSpec();
AsAtRelative asAtRelative = new AsAtRelative();
EffectiveDateHasQuality effectiveDateHasQuality = new EffectiveDateHasQuality();
EffectiveDateRelative effectiveDateRelative = new EffectiveDateRelative();
EffectiveRange effectiveRange = new EffectiveRange();


ForSpec forSpecInstance = new ForSpec()
    .asAtRangeForSpec(asAtRangeForSpec)
    .asAtRelative(asAtRelative)
    .effectiveDateHasQuality(effectiveDateHasQuality)
    .effectiveDateRelative(effectiveDateRelative)
    .effectiveRange(effectiveRange);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
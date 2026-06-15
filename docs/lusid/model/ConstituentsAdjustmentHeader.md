# com.finbourne.sdk.services.lusid.model.ConstituentsAdjustmentHeader
classname ConstituentsAdjustmentHeader

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | There can be at most one holdings adjustment for a portfolio at a  specific effective time so this uniquely identifies the adjustment. | [optional] [default to OffsetDateTime]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ConstituentsAdjustmentHeader;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ConstituentsAdjustmentHeader constituentsAdjustmentHeaderInstance = new ConstituentsAdjustmentHeader()
    .effectiveAt(effectiveAt)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
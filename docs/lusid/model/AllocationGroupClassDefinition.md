# com.finbourne.sdk.services.lusid.model.AllocationGroupClassDefinition
classname AllocationGroupClassDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund and is attached to the transaction. | [default to String]
**shareClassFundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**apportionmentFactor** | **java.math.BigDecimal** | The weighting factor used for apportionment across this share class. | [optional] [default to java.math.BigDecimal]
**shareClassSeriesCode** | **String** | An optional series identifier for the share class. If not provided, the share class will include all series. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationGroupClassDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassShortCode = "example shareClassShortCode";
ResourceId shareClassFundId = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal apportionmentFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String shareClassSeriesCode = "example shareClassSeriesCode";


AllocationGroupClassDefinition allocationGroupClassDefinitionInstance = new AllocationGroupClassDefinition()
    .shareClassShortCode(shareClassShortCode)
    .shareClassFundId(shareClassFundId)
    .apportionmentFactor(apportionmentFactor)
    .shareClassSeriesCode(shareClassSeriesCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
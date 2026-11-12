# com.finbourne.sdk.services.lusid.model.CollateralAllocationOverride
classname CollateralAllocationOverride
An asset and the units of it a user chooses to move for a margin call, validated against the agreement's  constraints as the allocation is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The LUSID instrument identifier of the asset to move, or CCY_ and the currency code for cash. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**units** | **java.math.BigDecimal** | The units to move. | [default to java.math.BigDecimal]
**custodianAccount** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAllocationOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentId = "example instrumentId";
ResourceId portfolioId = new ResourceId();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
ResourceId custodianAccount = new ResourceId();


CollateralAllocationOverride collateralAllocationOverrideInstance = new CollateralAllocationOverride()
    .instrumentId(instrumentId)
    .portfolioId(portfolioId)
    .units(units)
    .custodianAccount(custodianAccount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
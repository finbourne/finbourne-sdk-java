# com.finbourne.sdk.services.lusid.model.BondConversionEntry
classname BondConversionEntry
Information required to specify a conversion event for a convertible bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the bond can be converted | [optional] [default to OffsetDateTime]
**denomination** | **java.math.BigDecimal** | The number of shares to be issued on conversion will be equal to the denomination of the  bond divided by the conversion price.  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The conversion price  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]
**ratio** | **java.math.BigDecimal** | The number of common shares received at the time of conversion for each convertible bond  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BondConversionEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal denomination = new java.math.BigDecimal("100.00");
java.math.BigDecimal price = new java.math.BigDecimal("100.00");
java.math.BigDecimal ratio = new java.math.BigDecimal("100.00");


BondConversionEntry bondConversionEntryInstance = new BondConversionEntry()
    .date(date)
    .denomination(denomination)
    .price(price)
    .ratio(ratio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
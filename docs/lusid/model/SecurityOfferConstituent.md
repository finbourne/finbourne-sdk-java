# com.finbourne.sdk.services.lusid.model.SecurityOfferConstituent
classname SecurityOfferConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SecurityOfferConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

NewInstrument newInstrument = new NewInstrument();
UnitsRatio unitsRatio = new UnitsRatio();
OffsetDateTime settlementDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal minPieceSize = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal minIncrement = new java.math.BigDecimal("100.00");


SecurityOfferConstituent securityOfferConstituentInstance = new SecurityOfferConstituent()
    .newInstrument(newInstrument)
    .unitsRatio(unitsRatio)
    .settlementDate(settlementDate)
    .minPieceSize(minPieceSize)
    .minIncrement(minIncrement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
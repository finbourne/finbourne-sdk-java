# com.finbourne.sdk.services.lusid.model.CashOfferConstituent
classname CashOfferConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerPrice** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CashOfferConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal offerPrice = new java.math.BigDecimal("100.00");
String currency = "example currency";
OffsetDateTime settlementDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal minPieceSize = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal minIncrement = new java.math.BigDecimal("100.00");


CashOfferConstituent cashOfferConstituentInstance = new CashOfferConstituent()
    .offerPrice(offerPrice)
    .currency(currency)
    .settlementDate(settlementDate)
    .minPieceSize(minPieceSize)
    .minIncrement(minIncrement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.RealisedGainLossMatchedLot
classname RealisedGainLossMatchedLot
The lot a realised chargeable-gains leg was matched against: its cost in the portfolio currency, the date of the  acquisition that opened it and its chargeable-gains role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**role** | **String** | Available values: DayLot, Section104Pool, Holding1982, Holding1965, FutureAcquisition. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RealisedGainLossMatchedLot;
import java.util.*;
import java.lang.System;
import java.net.URI;

CurrencyAndAmount originalCost = new CurrencyAndAmount();
@javax.annotation.Nullable OffsetDateTime purchaseDate = OffsetDateTime.now();
@javax.annotation.Nullable String role = "example role";


RealisedGainLossMatchedLot realisedGainLossMatchedLotInstance = new RealisedGainLossMatchedLot()
    .originalCost(originalCost)
    .purchaseDate(purchaseDate)
    .role(role);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
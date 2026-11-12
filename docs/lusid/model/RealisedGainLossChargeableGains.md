# com.finbourne.sdk.services.lusid.model.RealisedGainLossChargeableGains
classname RealisedGainLossChargeableGains
The UK chargeable-gains figures the engine worked for a realised-gain/loss leg: the chargeable gain, the  indexation allowance and the part of it taken, the proceeds the leg was worked on, both sides of the s.35  kink test on a 1982 holding, the basis and identification rule the leg was matched under, the lot it was  matched against, whether its transaction stands reversed, and the treatment applied. All amounts are in  the portfolio currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chargeableGain** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**indexationAllowance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**indexationAllowanceTaken** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**proceeds** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**gainOnOriginalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**gainOnMarketValue1982** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**basis** | **String** | Available values: IndexedCost, MarketValue1982, OriginalCost, NilGain. | [optional] [default to String]
**matchRule** | **String** | Available values: SameDay, TenDay, Section210B, Section104Pool, Holding1982, Holding1965. | [optional] [default to String]
**matchedLot** | [**RealisedGainLossMatchedLot**](RealisedGainLossMatchedLot.md) |  | [optional] [default to RealisedGainLossMatchedLot]
**marketValue1965** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**reversed** | **Boolean** |  | [optional] [default to Boolean]
**taxTreatment** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RealisedGainLossChargeableGains;
import java.util.*;
import java.lang.System;
import java.net.URI;

CurrencyAndAmount chargeableGain = new CurrencyAndAmount();
CurrencyAndAmount indexationAllowance = new CurrencyAndAmount();
CurrencyAndAmount indexationAllowanceTaken = new CurrencyAndAmount();
CurrencyAndAmount proceeds = new CurrencyAndAmount();
CurrencyAndAmount gainOnOriginalCost = new CurrencyAndAmount();
CurrencyAndAmount gainOnMarketValue1982 = new CurrencyAndAmount();
@javax.annotation.Nullable String basis = "example basis";
@javax.annotation.Nullable String matchRule = "example matchRule";
RealisedGainLossMatchedLot matchedLot = new RealisedGainLossMatchedLot();
CurrencyAndAmount marketValue1965 = new CurrencyAndAmount();
Boolean reversed = true;
@javax.annotation.Nullable String taxTreatment = "example taxTreatment";


RealisedGainLossChargeableGains realisedGainLossChargeableGainsInstance = new RealisedGainLossChargeableGains()
    .chargeableGain(chargeableGain)
    .indexationAllowance(indexationAllowance)
    .indexationAllowanceTaken(indexationAllowanceTaken)
    .proceeds(proceeds)
    .gainOnOriginalCost(gainOnOriginalCost)
    .gainOnMarketValue1982(gainOnMarketValue1982)
    .basis(basis)
    .matchRule(matchRule)
    .matchedLot(matchedLot)
    .marketValue1965(marketValue1965)
    .reversed(reversed)
    .taxTreatment(taxTreatment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
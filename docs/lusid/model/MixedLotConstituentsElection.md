# com.finbourne.sdk.services.lusid.model.MixedLotConstituentsElection
classname MixedLotConstituentsElection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** |  | [default to String]
**isDefault** | **Boolean** |  | [optional] [default to Boolean]
**isChosen** | **Boolean** |  | [optional] [default to Boolean]
**securitiesConstituents** | [**List&lt;SecurityOfferConstituent&gt;**](SecurityOfferConstituent.md) |  | [optional] [default to List<SecurityOfferConstituent>]
**cashConstituents** | [**List&lt;CashOfferConstituent&gt;**](CashOfferConstituent.md) |  | [optional] [default to List<CashOfferConstituent>]
**costFactor** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MixedLotConstituentsElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isDefault = true;
Boolean isChosen = true;
@javax.annotation.Nullable List<SecurityOfferConstituent> securitiesConstituents = new List<SecurityOfferConstituent>();
@javax.annotation.Nullable List<CashOfferConstituent> cashConstituents = new List<CashOfferConstituent>();
@javax.annotation.Nullable java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");


MixedLotConstituentsElection mixedLotConstituentsElectionInstance = new MixedLotConstituentsElection()
    .electionKey(electionKey)
    .isDefault(isDefault)
    .isChosen(isChosen)
    .securitiesConstituents(securitiesConstituents)
    .cashConstituents(cashConstituents)
    .costFactor(costFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
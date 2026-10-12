# com.finbourne.sdk.services.lusid.model.ConsentGrantedElection
classname ConsentGrantedElection
Election to grant consent to the proposed action (CONY), optionally in return for a consent fee.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**consentFeePrice** | **java.math.BigDecimal** | The consent fee, quoted per 1,000 of face for bonds (the current notional at the record date for amortising and inflation-linked bonds) and per unit otherwise. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ConsentGrantedElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isDefault = true;
Boolean isChosen = true;
@javax.annotation.Nullable java.math.BigDecimal consentFeePrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String consentFeeCurrency = "example consentFeeCurrency";


ConsentGrantedElection consentGrantedElectionInstance = new ConsentGrantedElection()
    .electionKey(electionKey)
    .isDefault(isDefault)
    .isChosen(isChosen)
    .consentFeePrice(consentFeePrice)
    .consentFeeCurrency(consentFeeCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
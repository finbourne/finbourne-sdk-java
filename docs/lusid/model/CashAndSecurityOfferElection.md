# com.finbourne.sdk.services.lusid.model.CashAndSecurityOfferElection
classname CashAndSecurityOfferElection
Election for events that result in both cash and equity via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashOfferCurrency** | **String** | Currency of the cash offer | [default to String]
**cashOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | Optional. The fraction of cost that is transferred from the existing shares to the new shares. | [optional] [default to java.math.BigDecimal]
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.sdk.services.lusid.model.CashAndSecurityOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String cashOfferCurrency = "example cashOfferCurrency";
java.math.BigDecimal cashOfferPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");
String electionKey = "example electionKey";
Boolean isChosen = true;
Boolean isDefault = true;
UnitsRatio unitsRatio = new UnitsRatio();


CashAndSecurityOfferElection cashAndSecurityOfferElectionInstance = new CashAndSecurityOfferElection()
    .cashOfferCurrency(cashOfferCurrency)
    .cashOfferPrice(cashOfferPrice)
    .costFactor(costFactor)
    .electionKey(electionKey)
    .isChosen(isChosen)
    .isDefault(isDefault)
    .unitsRatio(unitsRatio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
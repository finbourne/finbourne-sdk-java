# com.finbourne.sdk.services.lusid.model.TenderOfferElection
classname TenderOfferElection
Election for events that result in cash via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenderOfferCurrency** | **String** | Currency of the cash offer | [default to String]
**tenderOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer | [default to java.math.BigDecimal]
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TenderOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tenderOfferCurrency = "example tenderOfferCurrency";
java.math.BigDecimal tenderOfferPrice = new java.math.BigDecimal("100.00");
String electionKey = "example electionKey";
Boolean isChosen = true;
Boolean isDefault = true;


TenderOfferElection tenderOfferElectionInstance = new TenderOfferElection()
    .tenderOfferCurrency(tenderOfferCurrency)
    .tenderOfferPrice(tenderOfferPrice)
    .electionKey(electionKey)
    .isChosen(isChosen)
    .isDefault(isDefault);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
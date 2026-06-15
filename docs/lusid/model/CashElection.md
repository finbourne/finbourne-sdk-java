# com.finbourne.sdk.services.lusid.model.CashElection
classname CashElection
Cash election for Events that result in a cash payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key used to identify this election. | [default to String]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate if this is not the declared CashElection.  Defaults to 1 if Election is Declared. | [optional] [default to java.math.BigDecimal]
**dividendRate** | **java.math.BigDecimal** | The payment rate for this CashElection. | [optional] [default to java.math.BigDecimal]
**isChosen** | **Boolean** | Has this election been chosen.  Only one Election may be Chosen per Event. | [optional] [default to Boolean]
**isDeclared** | **Boolean** | Is this the declared CashElection.  Only one Election may be Declared per Event. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election the default.  Only one Election may be Default per Event | [optional] [default to Boolean]
**dividendCurrency** | **String** | The payment currency for this CashElection. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CashElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
@javax.annotation.Nullable java.math.BigDecimal exchangeRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dividendRate = new java.math.BigDecimal("100.00");
Boolean isChosen = true;
Boolean isDeclared = true;
Boolean isDefault = true;
String dividendCurrency = "example dividendCurrency";


CashElection cashElectionInstance = new CashElection()
    .electionKey(electionKey)
    .exchangeRate(exchangeRate)
    .dividendRate(dividendRate)
    .isChosen(isChosen)
    .isDeclared(isDeclared)
    .isDefault(isDefault)
    .dividendCurrency(dividendCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
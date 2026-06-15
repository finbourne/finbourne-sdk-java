# com.finbourne.sdk.services.lusid.model.SecurityElection
classname SecurityElection
Security election for Events that result in equity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**price** | **java.math.BigDecimal** | Price per unit of the security. At least one of UnitsRatio or Price must be provided.  Price must non-zero. | [optional] [default to java.math.BigDecimal]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [optional] [default to UnitsRatio]
**securityElectionCurrency** | **String** | Optional currency in which the security election&#39;s price is denominated | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SecurityElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isChosen = true;
Boolean isDefault = true;
@javax.annotation.Nullable java.math.BigDecimal price = new java.math.BigDecimal("100.00");
UnitsRatio unitsRatio = new UnitsRatio();
@javax.annotation.Nullable String securityElectionCurrency = "example securityElectionCurrency";


SecurityElection securityElectionInstance = new SecurityElection()
    .electionKey(electionKey)
    .isChosen(isChosen)
    .isDefault(isDefault)
    .price(price)
    .unitsRatio(unitsRatio)
    .securityElectionCurrency(securityElectionCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
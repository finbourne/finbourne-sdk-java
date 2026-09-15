# com.finbourne.sdk.services.lusid.model.ConsentAndExchangeElection
classname ConsentAndExchangeElection
Election to both grant consent and exchange the holding (CEXC), at a given units ratio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.sdk.services.lusid.model.ConsentAndExchangeElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isDefault = true;
Boolean isChosen = true;
UnitsRatio unitsRatio = new UnitsRatio();


ConsentAndExchangeElection consentAndExchangeElectionInstance = new ConsentAndExchangeElection()
    .electionKey(electionKey)
    .isDefault(isDefault)
    .isChosen(isChosen)
    .unitsRatio(unitsRatio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
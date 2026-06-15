# com.finbourne.sdk.services.lusid.model.SecurityOfferElection
classname SecurityOfferElection
Election for events that result in cash via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]

```java
import com.finbourne.sdk.services.lusid.model.SecurityOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isChosen = true;
Boolean isDefault = true;
UnitsRatio unitsRatio = new UnitsRatio();


SecurityOfferElection securityOfferElectionInstance = new SecurityOfferElection()
    .electionKey(electionKey)
    .isChosen(isChosen)
    .isDefault(isDefault)
    .unitsRatio(unitsRatio);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
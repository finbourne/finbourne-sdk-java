# com.finbourne.sdk.services.lusid.model.ElectionSpecification
classname ElectionSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionType** | **String** | Available values: CashElection, CashAndSecurityOfferElection, CashOfferElection, EarlyRedemptionElection, LapseElection, OptionExerciseElection, SecurityElection, SecurityOfferElection, TenderOfferElection, MixedLotConstituentsElection, SubscribeElection. | [default to String]
**cardinality** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**referencedAs** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ElectionSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionType = "example electionType";
Map<String, String> cardinality = new Map<String, String>();
List<String> referencedAs = new List<String>();


ElectionSpecification electionSpecificationInstance = new ElectionSpecification()
    .electionType(electionType)
    .cardinality(cardinality)
    .referencedAs(referencedAs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.PikElection
classname PikElection
PIK election.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election (the PIK type) | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.PikElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
Boolean isDefault = true;
Boolean isChosen = true;


PikElection pikElectionInstance = new PikElection()
    .electionKey(electionKey)
    .isDefault(isDefault)
    .isChosen(isChosen);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
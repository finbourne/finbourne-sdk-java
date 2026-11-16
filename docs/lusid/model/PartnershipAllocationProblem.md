# com.finbourne.sdk.services.lusid.model.PartnershipAllocationProblem
classname PartnershipAllocationProblem
Why the period cannot be allocated to the partners as it stands. The read reports it; the allocation run and the  acceptance refuse with the same failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The problem. Available values: AllocationRulesNotConfigured, UnbucketedPnl, UnknownDistributionCharacter. | [default to String]
**message** | **String** | What is wrong and what to change, naming the accounts, amounts and values concerned. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PartnershipAllocationProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String message = "example message";


PartnershipAllocationProblem partnershipAllocationProblemInstance = new PartnershipAllocationProblem()
    .code(code)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
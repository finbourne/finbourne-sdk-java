# com.finbourne.sdk.services.lusid.model.ElectionProrationRate
classname ElectionProrationRate
The proration rate the issuer applies to one option of a multi-option event, keyed by the option's election key.  An entry overrides the event-level proration rate for that election only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | The election key of the option this proration rate applies to. | [default to String]
**prorationRate** | **java.math.BigDecimal** | The fraction of the quantity instructed on this option that the issuer accepts. Must be in (0, 1]. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ElectionProrationRate;
import java.util.*;
import java.lang.System;
import java.net.URI;

String electionKey = "example electionKey";
java.math.BigDecimal prorationRate = new java.math.BigDecimal("100.00");


ElectionProrationRate electionProrationRateInstance = new ElectionProrationRate()
    .electionKey(electionKey)
    .prorationRate(prorationRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
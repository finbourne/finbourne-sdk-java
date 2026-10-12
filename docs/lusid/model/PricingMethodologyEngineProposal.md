# com.finbourne.sdk.services.lusid.model.PricingMethodologyEngineProposal
classname PricingMethodologyEngineProposal
What the pricing methodology alone publishes for a share class, kept alongside any decision that replaces it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**swung** | **Boolean** | Whether the methodology swings the price. | [default to Boolean]
**swingDirection** | **String** | Offer or Bid when the methodology swings the price. Absent when it does not. | [optional] [default to String]
**spreadSource** | **String** | Where the methodology&#39;s spread came from: Stored or Market. Absent when it does not swing. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread the methodology applies, in basis points. Absent when it does not swing or swings to a market price. | [optional] [default to java.math.BigDecimal]
**dealingPrice** | **java.math.BigDecimal** | The dealing price the methodology publishes. Absent when the class has no units in issue. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PricingMethodologyEngineProposal;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean swung = true;
@javax.annotation.Nullable String swingDirection = "example swingDirection";
@javax.annotation.Nullable String spreadSource = "example spreadSource";
@javax.annotation.Nullable java.math.BigDecimal spreadBps = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dealingPrice = new java.math.BigDecimal("100.00");


PricingMethodologyEngineProposal pricingMethodologyEngineProposalInstance = new PricingMethodologyEngineProposal()
    .swung(swung)
    .swingDirection(swingDirection)
    .spreadSource(spreadSource)
    .spreadBps(spreadBps)
    .dealingPrice(dealingPrice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
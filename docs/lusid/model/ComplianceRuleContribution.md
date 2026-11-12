# com.finbourne.sdk.services.lusid.model.ComplianceRuleContribution
classname ComplianceRuleContribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrument** | **String** | The LUSID instrument identifier (LUID) of the instrument for this contribution. | [default to String]
**instrumentType** | **String** | Optional. The economic type of the instrument for this contribution. | [optional] [default to String]
**holdingType** | **String** | Optional. The holding type of this contribution. | [optional] [default to String]
**holdingId** | **String** | Optional. The internal holding identifier encoding the detail of what the holding includes. | [optional] [default to String]
**heldBy** | **String** | Optional. Where this holding sits relative to the rule&#39;s benchmark: portfolio, benchmark or both.  Meaningful only for benchmark-relative rules. | [optional] [default to String]
**keysUsed** | [**List&lt;ComplianceKeyUsed&gt;**](ComplianceKeyUsed.md) | The keys this holding contributed to the rule: each key the rule read (plus the portfolio NAV key), with the  role(s) it played, the holding&#39;s own value for it, and which bag the value came from. | [default to List<ComplianceKeyUsed>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleContribution;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
ResourceId orderId = new ResourceId();
String instrument = "example instrument";
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String holdingType = "example holdingType";
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String heldBy = "example heldBy";
List<ComplianceKeyUsed> keysUsed = new List<ComplianceKeyUsed>();


ComplianceRuleContribution complianceRuleContributionInstance = new ComplianceRuleContribution()
    .portfolioId(portfolioId)
    .orderId(orderId)
    .instrument(instrument)
    .instrumentType(instrumentType)
    .holdingType(holdingType)
    .holdingId(holdingId)
    .heldBy(heldBy)
    .keysUsed(keysUsed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
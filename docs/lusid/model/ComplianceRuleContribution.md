# com.finbourne.sdk.services.lusid.model.ComplianceRuleContribution
classname ComplianceRuleContribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | The position of this contribution within the compliance run. | [default to Integer]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrument** | **String** | The LUSID instrument identifier (LUID) of the instrument for this contribution. | [default to String]
**instrumentType** | **String** | Optional. The economic type of the instrument for this contribution. | [optional] [default to String]
**holdingType** | **String** | Optional. The holding type of this contribution. | [optional] [default to String]
**holdingId** | **String** | Optional. The internal holding identifier encoding the detail of what the holding includes. | [optional] [default to String]
**resultValues** | **Map&lt;String, java.math.BigDecimal&gt;** | Dictionary of AddressKey (as string) and their corresponding decimal valuation results for this contribution. | [default to Map<String, java.math.BigDecimal>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Dictionary of PropertyKey (as string) and their corresponding property for this contribution. | [default to Map<String, Property>]
**relatedProperties** | **Map&lt;String, String&gt;** | Dictionary of related property keys (as string) and their string values, read from related entities across a relationship. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleContribution;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer index = new Integer("100.00");
ResourceId portfolioId = new ResourceId();
ResourceId orderId = new ResourceId();
String instrument = "example instrument";
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String holdingType = "example holdingType";
@javax.annotation.Nullable String holdingId = "example holdingId";
Map<String, java.math.BigDecimal> resultValues = new Map<String, java.math.BigDecimal>();
Map<String, Property> properties = new Map<String, Property>();
Map<String, String> relatedProperties = new Map<String, String>();


ComplianceRuleContribution complianceRuleContributionInstance = new ComplianceRuleContribution()
    .index(index)
    .portfolioId(portfolioId)
    .orderId(orderId)
    .instrument(instrument)
    .instrumentType(instrumentType)
    .holdingType(holdingType)
    .holdingId(holdingId)
    .resultValues(resultValues)
    .properties(properties)
    .relatedProperties(relatedProperties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
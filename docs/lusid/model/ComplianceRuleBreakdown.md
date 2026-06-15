# com.finbourne.sdk.services.lusid.model.ComplianceRuleBreakdown
classname ComplianceRuleBreakdown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupStatus** | **String** | The status of this subset of results. | [default to String]
**resultsUsed** | **Map&lt;String, java.math.BigDecimal&gt;** | Dictionary of AddressKey (as string) and their corresponding decimal values, that were used in this rule. | [default to Map<String, java.math.BigDecimal>]
**propertiesUsed** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) | Dictionary of PropertyKey (as string) and their corresponding Properties, that were used in this rule | [default to Map<String, List<Property>>]
**missingDataInformation** | **List&lt;String&gt;** | List of string information detailing data that was missing from contributions processed in this rule | [default to List<String>]
**lineage** | [**List&lt;LineageMember&gt;**](LineageMember.md) |  | [default to List<LineageMember>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

String groupStatus = "example groupStatus";
Map<String, java.math.BigDecimal> resultsUsed = new Map<String, java.math.BigDecimal>();
Map<String, List<Property>> propertiesUsed = new Map<String, List<Property>>();
List<String> missingDataInformation = new List<String>();
List<LineageMember> lineage = new List<LineageMember>();


ComplianceRuleBreakdown complianceRuleBreakdownInstance = new ComplianceRuleBreakdown()
    .groupStatus(groupStatus)
    .resultsUsed(resultsUsed)
    .propertiesUsed(propertiesUsed)
    .missingDataInformation(missingDataInformation)
    .lineage(lineage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
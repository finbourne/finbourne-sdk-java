# com.finbourne.sdk.services.lusid.model.FundTaxScopeExclusions
classname FundTaxScopeExclusions
What the UK chargeable-gains figures leave out of the pooled computation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentTypes** | **List&lt;String&gt;** | Instrument types that stay on the portfolio&#39;s ordinary accounting method rather than being pooled, by name. | [default to List<String>]
**leafOutcomes** | **List&lt;String&gt;** | Disposal-leg outcomes the configured regime options disapply. Empty under the standard options. | [default to List<String>]
**appliedInFigures** | **Boolean** | Whether the engine enforces these exclusions when building the pooled lots and gains. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FundTaxScopeExclusions;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> instrumentTypes = new List<String>();
List<String> leafOutcomes = new List<String>();
Boolean appliedInFigures = true;


FundTaxScopeExclusions fundTaxScopeExclusionsInstance = new FundTaxScopeExclusions()
    .instrumentTypes(instrumentTypes)
    .leafOutcomes(leafOutcomes)
    .appliedInFigures(appliedInFigures);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
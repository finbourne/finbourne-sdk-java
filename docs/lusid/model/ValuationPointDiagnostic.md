# com.finbourne.sdk.services.lusid.model.ValuationPointDiagnostic
classname ValuationPointDiagnostic
Something found while striking a valuation point that did not stop it but should be looked at.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | What kind of finding this is. &#39;OwnershipDrift&#39;: a fund structure holder&#39;s declared sharing percentage in a held member differs from the share its contributions make of that member&#39;s capital by enough to misallocate more of the period&#39;s P&amp;L than the holder&#39;s drift materiality warning amount allows. | [default to String]
**message** | **String** | What was found and what to do about it. | [default to String]
**details** | **Map&lt;String, String&gt;** | The values the finding was made on, by name. For &#39;OwnershipDrift&#39;: holder, member, declaredShare, actualShare, delta (actual less declared) and impact (the P&amp;L the drift would misallocate this period). | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointDiagnostic;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String message = "example message";
@javax.annotation.Nullable Map<String, String> details = new Map<String, String>();


ValuationPointDiagnostic valuationPointDiagnosticInstance = new ValuationPointDiagnostic()
    .type(type)
    .message(message)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.DeleteWithholdingTaxRateRequest
classname DeleteWithholdingTaxRateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The series identifiers that, with effectiveAt, identify the rate row: taxCountry, profileType and the dataset&#39;s own matching dimensions, structured according to its field schema. ruleSource is not accepted here: pass it as the ruleSource query parameter, which applies it to every row in the batch, and omit it for rows that apply at every source. | [optional] [default to Map<String, Object>]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DeleteWithholdingTaxRateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Object> seriesIdentifiers = new Map<String, Object>();
String effectiveAt = "example effectiveAt";


DeleteWithholdingTaxRateRequest deleteWithholdingTaxRateRequestInstance = new DeleteWithholdingTaxRateRequest()
    .seriesIdentifiers(seriesIdentifiers)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
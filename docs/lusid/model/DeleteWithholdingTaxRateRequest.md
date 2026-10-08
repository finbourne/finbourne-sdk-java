# com.finbourne.sdk.services.lusid.model.DeleteWithholdingTaxRateRequest
classname DeleteWithholdingTaxRateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]
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
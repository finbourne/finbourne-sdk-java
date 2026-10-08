# com.finbourne.sdk.services.lusid.model.WithholdingTaxValueSource
classname WithholdingTaxValueSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension** | **String** | The name of the matching dimension this declaration populates, as it appears in the dataset field schema. A declaration naming a dimension neither dataset has is rejected. | [default to String]
**source** | **String** | Optional. The LUSID field the engine reads the dimension&#39;s value from, addressed in the same syntax used to filter results: a property key in the form Properties[{domain}/{scope}/{code}], such as Properties[Instrument/WithholdingTax/AssetClass] or Properties[Transaction/WithholdingTax/Custodian]; or the name of a field on the entity itself, such as Transaction.SettlementCurrency. Omit it to declare that the dimension is keyed on but not resolved, so only rows leaving that dimension blank match. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxValueSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String dimension = "example dimension";
@javax.annotation.Nullable String source = "example source";


WithholdingTaxValueSource withholdingTaxValueSourceInstance = new WithholdingTaxValueSource()
    .dimension(dimension)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
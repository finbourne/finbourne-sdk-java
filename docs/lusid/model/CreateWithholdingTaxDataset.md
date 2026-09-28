# com.finbourne.sdk.services.lusid.model.CreateWithholdingTaxDataset
classname CreateWithholdingTaxDataset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the relational dataset definition. | [default to String]
**code** | **String** | The code of the relational dataset definition. Together with the scope this uniquely identifies the definition. | [default to String]
**dimensions** | [**List&lt;CreateSeriesIdentifierField&gt;**](CreateSeriesIdentifierField.md) | The dimensions, over and above the mandatory core, that this dataset is matched on. Fully customer-defined with no platform-enforced set; each is created as a series identifier, and each requires a value source declaration on the Withholding Tax Configuration naming where the engine reads its value from. May be empty, in which case matching proceeds on tax identity alone. A dimension whose name collides with a mandatory core field is rejected. The two datasets need not carry the same dimensions - one present on only a single dataset is simply not matched on when the other is queried, an ISIN dimension on the anomaly dataset alone being the usual case. | [optional] [default to List<CreateSeriesIdentifierField>]

```java
import com.finbourne.sdk.services.lusid.model.CreateWithholdingTaxDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable List<CreateSeriesIdentifierField> dimensions = new List<CreateSeriesIdentifierField>();


CreateWithholdingTaxDataset createWithholdingTaxDatasetInstance = new CreateWithholdingTaxDataset()
    .scope(scope)
    .code(code)
    .dimensions(dimensions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.WithholdingTaxDatasetDefinitions
classname WithholdingTaxDatasetDefinitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anomalyDataset** | [**WithholdingTaxDataset**](WithholdingTaxDataset.md) |  | [default to WithholdingTaxDataset]
**mainDataset** | [**WithholdingTaxDataset**](WithholdingTaxDataset.md) |  | [default to WithholdingTaxDataset]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxDatasetDefinitions;
import java.util.*;
import java.lang.System;
import java.net.URI;

WithholdingTaxDataset anomalyDataset = new WithholdingTaxDataset();
WithholdingTaxDataset mainDataset = new WithholdingTaxDataset();


WithholdingTaxDatasetDefinitions withholdingTaxDatasetDefinitionsInstance = new WithholdingTaxDatasetDefinitions()
    .anomalyDataset(anomalyDataset)
    .mainDataset(mainDataset);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
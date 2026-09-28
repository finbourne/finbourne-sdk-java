# com.finbourne.sdk.services.lusid.model.CreateWithholdingTaxDatasetDefinitionsRequest
classname CreateWithholdingTaxDatasetDefinitionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anomalyDataset** | [**CreateWithholdingTaxDataset**](CreateWithholdingTaxDataset.md) |  | [default to CreateWithholdingTaxDataset]
**mainDataset** | [**CreateWithholdingTaxDataset**](CreateWithholdingTaxDataset.md) |  | [default to CreateWithholdingTaxDataset]

```java
import com.finbourne.sdk.services.lusid.model.CreateWithholdingTaxDatasetDefinitionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CreateWithholdingTaxDataset anomalyDataset = new CreateWithholdingTaxDataset();
CreateWithholdingTaxDataset mainDataset = new CreateWithholdingTaxDataset();


CreateWithholdingTaxDatasetDefinitionsRequest createWithholdingTaxDatasetDefinitionsRequestInstance = new CreateWithholdingTaxDatasetDefinitionsRequest()
    .anomalyDataset(anomalyDataset)
    .mainDataset(mainDataset);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
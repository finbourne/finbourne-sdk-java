# com.finbourne.sdk.services.lusid.model.ShareClassData
classname ShareClassData
The data for a Share Class. Includes Valuation Point Data and instrument information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassBreakdown** | [**ShareClassBreakdown**](ShareClassBreakdown.md) |  | [default to ShareClassBreakdown]
**shareClassDetails** | [**ShareClassDetails**](ShareClassDetails.md) |  | [optional] [default to ShareClassDetails]
**pricingMethodology** | [**PricingMethodologyResult**](PricingMethodologyResult.md) |  | [optional] [default to PricingMethodologyResult]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassData;
import java.util.*;
import java.lang.System;
import java.net.URI;

ShareClassBreakdown shareClassBreakdown = new ShareClassBreakdown();
ShareClassDetails shareClassDetails = new ShareClassDetails();
PricingMethodologyResult pricingMethodology = new PricingMethodologyResult();


ShareClassData shareClassDataInstance = new ShareClassData()
    .shareClassBreakdown(shareClassBreakdown)
    .shareClassDetails(shareClassDetails)
    .pricingMethodology(pricingMethodology);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
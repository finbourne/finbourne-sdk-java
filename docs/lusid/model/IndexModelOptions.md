# com.finbourne.sdk.services.lusid.model.IndexModelOptions
classname IndexModelOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions. | [default to String]
**portfolioScaling** | **String** | Available values: Sum, AbsoluteSum, Unity. | [default to String]
**lookthroughPortfolioRelationshipId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.IndexModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String portfolioScaling = "example portfolioScaling";
ResourceId lookthroughPortfolioRelationshipId = new ResourceId();


IndexModelOptions indexModelOptionsInstance = new IndexModelOptions()
    .portfolioScaling(portfolioScaling)
    .lookthroughPortfolioRelationshipId(lookthroughPortfolioRelationshipId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
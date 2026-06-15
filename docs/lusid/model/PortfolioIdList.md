# com.finbourne.sdk.services.lusid.model.PortfolioIdList
classname PortfolioIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> values = new List<ResourceId>();


PortfolioIdList portfolioIdListInstance = new PortfolioIdList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
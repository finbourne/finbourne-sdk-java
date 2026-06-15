# com.finbourne.sdk.services.lusid.model.PortfolioGroupIdList
classname PortfolioGroupIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioGroupIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> values = new List<ResourceId>();


PortfolioGroupIdList portfolioGroupIdListInstance = new PortfolioGroupIdList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
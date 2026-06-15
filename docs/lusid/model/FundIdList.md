# com.finbourne.sdk.services.lusid.model.FundIdList
classname FundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.FundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> values = new List<ResourceId>();


FundIdList fundIdListInstance = new FundIdList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
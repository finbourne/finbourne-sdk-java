# com.finbourne.sdk.services.lusid.model.FilteredPortfolioIdList
classname FilteredPortfolioIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList, FilteredPortfolioIdList. | [default to String]
**filter** | **String** | The filter that selects the portfolios in the list. It is stored as given and resolved against the portfolios the caller is entitled to see each time the list is read. Supports portfolio fields (e.g. id.scope, displayName, type) and portfolio properties (e.g. properties[Portfolio/MyScope/Strategy] eq &#39;Equity&#39;). Relationship filters are not supported. Time-variant properties are evaluated at the asAt of the request; there is no effectiveAt. On upsert the filter must resolve successfully. | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The ids of the portfolios the filter resolved to when the list was read. Read only; must not be supplied on upsert. | [optional] [readonly] [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.FilteredPortfolioIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filter = "example filter";
@javax.annotation.Nullable List<ResourceId> values = new List<ResourceId>();


FilteredPortfolioIdList filteredPortfolioIdListInstance = new FilteredPortfolioIdList()
    .filter(filter)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
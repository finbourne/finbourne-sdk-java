# com.finbourne.sdk.services.lusid.model.FundIdList
classname FundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**navTypeCodesHint** | **List&lt;String&gt;** | The NAV type codes this list nominates, in priority order; entries may contain &#39;*&#39; wildcards.  For each fund the first matching code the fund defines is picked, falling back to the fund&#39;s  primary (official) NAV type when the list is empty or nothing matches. Optional. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.FundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> values = new List<ResourceId>();
@javax.annotation.Nullable List<String> navTypeCodesHint = new List<String>();


FundIdList fundIdListInstance = new FundIdList()
    .values(values)
    .navTypeCodesHint(navTypeCodesHint);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
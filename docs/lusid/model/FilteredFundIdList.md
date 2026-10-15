# com.finbourne.sdk.services.lusid.model.FilteredFundIdList
classname FilteredFundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**filter** | **String** |  | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [readonly] [default to List<ResourceId>]
**navTypeCodesHint** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**navTypeSelection** | **String** | Available values: First, All. | [optional] [default to String]
**resolvedFundNavTypeCodes** | [**List&lt;FundNavTypeCodes&gt;**](FundNavTypeCodes.md) |  | [optional] [readonly] [default to List<FundNavTypeCodes>]

```java
import com.finbourne.sdk.services.lusid.model.FilteredFundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filter = "example filter";
@javax.annotation.Nullable List<ResourceId> values = new List<ResourceId>();
@javax.annotation.Nullable List<String> navTypeCodesHint = new List<String>();
String navTypeSelection = "example navTypeSelection";
@javax.annotation.Nullable List<FundNavTypeCodes> resolvedFundNavTypeCodes = new List<FundNavTypeCodes>();


FilteredFundIdList filteredFundIdListInstance = new FilteredFundIdList()
    .filter(filter)
    .values(values)
    .navTypeCodesHint(navTypeCodesHint)
    .navTypeSelection(navTypeSelection)
    .resolvedFundNavTypeCodes(resolvedFundNavTypeCodes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
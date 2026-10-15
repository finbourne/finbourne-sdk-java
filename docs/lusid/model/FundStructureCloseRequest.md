# com.finbourne.sdk.services.lusid.model.FundStructureCloseRequest
classname FundStructureCloseRequest
The request to close a fund structure: finalise the named valuation point on every member, members first.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | The code of the valuation point to finalise on every member fund. | [default to String]
**navTypeCode** | **String** | The NAV type to finalise under. Defaults to each fund&#39;s primary NAV type. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureCloseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";


FundStructureCloseRequest fundStructureCloseRequestInstance = new FundStructureCloseRequest()
    .valuationPointCode(valuationPointCode)
    .navTypeCode(navTypeCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
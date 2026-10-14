# com.finbourne.sdk.services.lusid.model.AllocationMapIlpaTransactionType
classname AllocationMapIlpaTransactionType
The ILPA transaction type an Allocation Map reports one kind of allocation event under, overriding the default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the ILPA transaction type applies to: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default or Commitment. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**ilpaTransactionType** | **String** | The ILPA transaction type events of this kind are reported under, for example &#39;Capital Call: Investments&#39; or &#39;Distribution: Recallable&#39;. Must be a value of the system IlpaTransactionType data type. | [default to String]
**component** | **String** | The component of the event the ILPA transaction type applies to, for example MgmtFee or ROC. Absent means the entry is the default for every component of the event type without an entry of its own. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapIlpaTransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
String ilpaTransactionType = "example ilpaTransactionType";
@javax.annotation.Nullable String component = "example component";


AllocationMapIlpaTransactionType allocationMapIlpaTransactionTypeInstance = new AllocationMapIlpaTransactionType()
    .eventType(eventType)
    .ilpaTransactionType(ilpaTransactionType)
    .component(component);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
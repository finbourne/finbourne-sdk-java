# com.finbourne.sdk.services.lusid.model.AllocationMapResolveRequest
classname AllocationMapResolveRequest
A dry run of an Allocation Map: the event to share, and the basis values to share it by.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event to resolve: CapitalCall, Distribution, FeeExpense or ValuationMove. The map must define a basis for it. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of the event to share between the participants, in the event currency. | [default to java.math.BigDecimal]
**currency** | **String** | The currency of the amount. | [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | For a ValueWeighted or PropertyWeighted basis, the basis value of each participating investor record, supplied by the caller until investor records are read from LUSID. Under the AllCommittedToMembers rule these also name the committed investor records. Not needed for a FixedPercentage basis. | [optional] [default to List<AllocationMapBasisValue>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapResolveRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
@javax.annotation.Nullable List<AllocationMapBasisValue> basisValues = new List<AllocationMapBasisValue>();


AllocationMapResolveRequest allocationMapResolveRequestInstance = new AllocationMapResolveRequest()
    .eventType(eventType)
    .amount(amount)
    .currency(currency)
    .basisValues(basisValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
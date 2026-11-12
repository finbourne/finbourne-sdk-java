# com.finbourne.sdk.services.lusid.model.DealingLineNotValued
classname DealingLineNotValued
A dealing line read for a swing decision that could not be valued into its share class currency, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | The identifier of the dealing order that could not be valued, as scope/code. | [default to String]
**shareClass** | **String** | The share class the order deals in, keyed as the valuation point&#39;s share classes are. | [optional] [default to String]
**currency** | **String** | The currency the order&#39;s amount is in. Absent when the line carries no amount. | [optional] [default to String]
**reason** | **String** | Why the line could not be valued into the share class currency. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DealingLineNotValued;
import java.util.*;
import java.lang.System;
import java.net.URI;

String orderId = "example orderId";
@javax.annotation.Nullable String shareClass = "example shareClass";
@javax.annotation.Nullable String currency = "example currency";
String reason = "example reason";


DealingLineNotValued dealingLineNotValuedInstance = new DealingLineNotValued()
    .orderId(orderId)
    .shareClass(shareClass)
    .currency(currency)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
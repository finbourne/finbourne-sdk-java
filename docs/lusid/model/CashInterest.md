# com.finbourne.sdk.services.lusid.model.CashInterest
classname CashInterest
Interest accrued on posted cash.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | The name of the rate index. | [default to String]
**spreadBps** | **Integer** | The spread over the index, in basis points. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.CashInterest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String index = "example index";
Integer spreadBps = new Integer("100.00");


CashInterest cashInterestInstance = new CashInterest()
    .index(index)
    .spreadBps(spreadBps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
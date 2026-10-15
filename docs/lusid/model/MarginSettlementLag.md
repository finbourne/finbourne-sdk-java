# com.finbourne.sdk.services.lusid.model.MarginSettlementLag
classname MarginSettlementLag
Business days between a margin call and settlement, by asset kind.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cash** | **Integer** | The business days between a cash margin call and settlement. | [default to Integer]
**securities** | **Integer** | The business days between a securities margin call and settlement. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.MarginSettlementLag;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer cash = new Integer("100.00");
Integer securities = new Integer("100.00");


MarginSettlementLag marginSettlementLagInstance = new MarginSettlementLag()
    .cash(cash)
    .securities(securities);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
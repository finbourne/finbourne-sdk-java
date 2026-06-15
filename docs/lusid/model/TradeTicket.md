# com.finbourne.sdk.services.lusid.model.TradeTicket
classname TradeTicket
The base class for representing a Trade Ticket in LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeTicketType** | **String** | Available values: LusidTradeTicket, ExternalTradeTicket. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tradeTicketType = "example tradeTicketType";


TradeTicket tradeTicketInstance = new TradeTicket()
    .tradeTicketType(tradeTicketType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
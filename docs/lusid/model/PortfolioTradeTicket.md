# com.finbourne.sdk.services.lusid.model.PortfolioTradeTicket
classname PortfolioTradeTicket
Response for querying trade tickets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**tradeTicket** | [**LusidTradeTicket**](LusidTradeTicket.md) |  | [optional] [default to LusidTradeTicket]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioTradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId sourcePortfolioId = new ResourceId();
LusidTradeTicket tradeTicket = new LusidTradeTicket();


PortfolioTradeTicket portfolioTradeTicketInstance = new PortfolioTradeTicket()
    .sourcePortfolioId(sourcePortfolioId)
    .tradeTicket(tradeTicket);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
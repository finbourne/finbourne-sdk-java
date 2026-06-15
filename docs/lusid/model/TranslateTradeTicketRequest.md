# com.finbourne.sdk.services.lusid.model.TranslateTradeTicketRequest
classname TranslateTradeTicketRequest
A collection of instruments to translate, along with the target dialect to translate into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickets** | [**Map&lt;String, TradeTicket&gt;**](TradeTicket.md) | The collection of trade tickets to translate.                Each trade ticket should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response. | [default to Map<String, TradeTicket>]
**dialect** | **String** | The target dialect that the given instruments should be translated to. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TranslateTradeTicketRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TradeTicket> tickets = new Map<String, TradeTicket>();
String dialect = "example dialect";


TranslateTradeTicketRequest translateTradeTicketRequestInstance = new TranslateTradeTicketRequest()
    .tickets(tickets)
    .dialect(dialect);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
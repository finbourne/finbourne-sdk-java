# com.finbourne.sdk.services.lusid.model.PortfolioCashLadder
classname PortfolioCashLadder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the cash-flows. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**records** | [**List&lt;CashLadderRecord&gt;**](CashLadderRecord.md) | A record of cash flows on a specific date. | [default to List<CashLadderRecord>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The records that could not be returned along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioCashLadder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
List<CashLadderRecord> records = new List<CashLadderRecord>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioCashLadder portfolioCashLadderInstance = new PortfolioCashLadder()
    .currency(currency)
    .subHoldingKeys(subHoldingKeys)
    .records(records)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
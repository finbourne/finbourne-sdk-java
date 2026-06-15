# com.finbourne.sdk.services.lusid.model.Economics
classname Economics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**lusidInstrumentId** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that economics are for. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the Economic. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | Set of economic data related with each of the side impact of the transaction. | [optional] [default to List<Bucket>]

```java
import com.finbourne.sdk.services.lusid.model.Economics;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable List<Bucket> buckets = new List<Bucket>();


Economics economicsInstance = new Economics()
    .instrumentScope(instrumentScope)
    .lusidInstrumentId(lusidInstrumentId)
    .subHoldingKeys(subHoldingKeys)
    .buckets(buckets);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
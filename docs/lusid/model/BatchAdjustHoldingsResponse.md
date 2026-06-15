# com.finbourne.sdk.services.lusid.model.BatchAdjustHoldingsResponse
classname BatchAdjustHoldingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, HoldingAdjustmentWithDate&gt;**](HoldingAdjustmentWithDate.md) | The holdings which have been successfully adjusted. | [optional] [default to Map<String, HoldingAdjustmentWithDate>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The holdings that could not be adjusted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to adjusted holdings | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchAdjustHoldingsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, HoldingAdjustmentWithDate> values = new Map<String, HoldingAdjustmentWithDate>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchAdjustHoldingsResponse batchAdjustHoldingsResponseInstance = new BatchAdjustHoldingsResponse()
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
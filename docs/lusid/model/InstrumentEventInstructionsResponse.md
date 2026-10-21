# com.finbourne.sdk.services.lusid.model.InstrumentEventInstructionsResponse
classname InstrumentEventInstructionsResponse
The collection of successfully upserted instructions, the collection of those staged pending approval, and the collection of failures for those instructions that could not be upserted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, InstrumentEventInstruction&gt;**](InstrumentEventInstruction.md) | The collection of successfully upserted instructions | [optional] [default to Map<String, InstrumentEventInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of error information for instructions that could not be upserted | [optional] [default to Map<String, ErrorDetail>]
**staged** | [**Map&lt;String, InstrumentEventInstruction&gt;**](InstrumentEventInstruction.md) | The instructions that have been staged pending approval. | [optional] [default to Map<String, InstrumentEventInstruction>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, InstrumentEventInstruction> values = new Map<String, InstrumentEventInstruction>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, InstrumentEventInstruction> staged = new Map<String, InstrumentEventInstruction>();


InstrumentEventInstructionsResponse instrumentEventInstructionsResponseInstance = new InstrumentEventInstructionsResponse()
    .values(values)
    .failed(failed)
    .staged(staged);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
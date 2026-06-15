# com.finbourne.sdk.services.lusid.model.SettlementInstructionAmendRequest
classname SettlementInstructionAmendRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** |  | [default to String]
**operation** | **String** | Available values: Activate, Deactivate. | [optional] [default to String]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.SettlementInstructionAmendRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String settlementInstructionId = "example settlementInstructionId";
@javax.annotation.Nullable String operation = "example operation";
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();


SettlementInstructionAmendRequest settlementInstructionAmendRequestInstance = new SettlementInstructionAmendRequest()
    .settlementInstructionId(settlementInstructionId)
    .operation(operation)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
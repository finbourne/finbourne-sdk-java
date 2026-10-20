# com.finbourne.sdk.services.lusid.model.MarginCallKey
classname MarginCallKey
The parts that identify a margin call: its run and the call's business key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the call belongs to. | [default to String]
**agreementScope** | **String** | The scope of the call&#39;s collateral agreement. | [default to String]
**agreementCode** | **String** | The code of the call&#39;s collateral agreement. | [default to String]
**item** | **String** | The margin item of the call. | [default to String]
**marginType** | **String** | The margin type of the call. Currently VariationMargin. | [default to String]
**direction** | **String** | Who posts under the call: WePost, TheyPost or None. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginCallKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
String agreementScope = "example agreementScope";
String agreementCode = "example agreementCode";
String item = "example item";
String marginType = "example marginType";
String direction = "example direction";


MarginCallKey marginCallKeyInstance = new MarginCallKey()
    .runId(runId)
    .agreementScope(agreementScope)
    .agreementCode(agreementCode)
    .item(item)
    .marginType(marginType)
    .direction(direction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
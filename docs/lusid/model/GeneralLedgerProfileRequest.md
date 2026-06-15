# com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileRequest
classname GeneralLedgerProfileRequest
A General Ledger Profile Definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generalLedgerProfileCode** | **String** | The unique code for the General Ledger Profile | [default to String]
**displayName** | **String** | The name of the General Ledger Profile | [default to String]
**description** | **String** | A description for the General Ledger Profile | [optional] [default to String]
**generalLedgerProfileMappings** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md) | Rules for mapping Account or property values to aggregation pattern definitions | [default to List<GeneralLedgerProfileMapping>]

```java
import com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String generalLedgerProfileCode = "example generalLedgerProfileCode";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<GeneralLedgerProfileMapping> generalLedgerProfileMappings = new List<GeneralLedgerProfileMapping>();


GeneralLedgerProfileRequest generalLedgerProfileRequestInstance = new GeneralLedgerProfileRequest()
    .generalLedgerProfileCode(generalLedgerProfileCode)
    .displayName(displayName)
    .description(description)
    .generalLedgerProfileMappings(generalLedgerProfileMappings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
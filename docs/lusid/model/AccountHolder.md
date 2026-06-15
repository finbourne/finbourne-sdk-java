# com.finbourne.sdk.services.lusid.model.AccountHolder
classname AccountHolder
An Account Holder of an Investment Account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Account Holder, unique within the Investment Account | [optional] [default to String]
**scope** | **String** | The scope in which the Investor Record lies. | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single Account Holder identifier that should target the desired Investor Record. | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique InvestorRecord entity identifier | [optional] [default to String]
**investorRecord** | [**InvestorRecord**](InvestorRecord.md) |  | [optional] [default to InvestorRecord]

```java
import com.finbourne.sdk.services.lusid.model.AccountHolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String key = "example key";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
InvestorRecord investorRecord = new InvestorRecord();


AccountHolder accountHolderInstance = new AccountHolder()
    .key(key)
    .scope(scope)
    .identifiers(identifiers)
    .entityUniqueId(entityUniqueId)
    .investorRecord(investorRecord);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.UpsertAddressKeyAliasRequest
classname UpsertAddressKeyAliasRequest
A request to upsert an address key alias.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKeyAlias** | [**AddressKeyAlias**](AddressKeyAlias.md) |  | [optional] [default to AddressKeyAlias]

```java
import com.finbourne.sdk.services.lusid.model.UpsertAddressKeyAliasRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

AddressKeyAlias addressKeyAlias = new AddressKeyAlias();


UpsertAddressKeyAliasRequest upsertAddressKeyAliasRequestInstance = new UpsertAddressKeyAliasRequest()
    .addressKeyAlias(addressKeyAlias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
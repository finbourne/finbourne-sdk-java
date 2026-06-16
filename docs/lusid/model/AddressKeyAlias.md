# com.finbourne.sdk.services.lusid.model.AddressKeyAlias
classname AddressKeyAlias
An address key alias that maps a short alias key to a real key with options.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the alias | [default to String]
**code** | **String** | The code of the alias | [default to String]
**aliasKey** | **String** | The alias address key, must start with \&quot;Alias/\&quot; prefix (e.g., \&quot;Alias/DailyNZPnL\&quot;) | [default to String]
**realKey** | **String** | The real address key this alias resolves to (e.g., \&quot;ProfitAndLoss/Total\&quot;). Must NOT start with \&quot;Alias/\&quot;. | [default to String]
**options** | **Map&lt;String, String&gt;** | Options to apply when resolving the alias (e.g., {\&quot;Window\&quot;:\&quot;Daily\&quot;,\&quot;TimeZone\&quot;:\&quot;NZ\&quot;}) | [optional] [default to Map<String, String>]
**displayName** | **String** | Human-readable display name | [optional] [default to String]
**description** | **String** | Description of the alias | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AddressKeyAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String aliasKey = "example aliasKey";
String realKey = "example realKey";
@javax.annotation.Nullable Map<String, String> options = new Map<String, String>();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


AddressKeyAlias addressKeyAliasInstance = new AddressKeyAlias()
    .scope(scope)
    .code(code)
    .aliasKey(aliasKey)
    .realKey(realKey)
    .options(options)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
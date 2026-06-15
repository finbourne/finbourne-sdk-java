# com.finbourne.sdk.services.lusid.model.AppendMarketDataType
classname AppendMarketDataType
The supported complex market data types which can be appended to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppendMarketDataType** | [**String**](.md) | **The supported complex market data types which can be appended to.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AppendMarketDataType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AppendMarketDataType:
AppendMarketDataType method = AppendMarketDataType.APPEND_FX_FORWARD_CURVE_BY_QUOTE_REFERENCE;
AppendMarketDataType method = AppendMarketDataType.APPEND_FX_FORWARD_CURVE_DATA;
AppendMarketDataType method = AppendMarketDataType.APPEND_FX_FORWARD_PIPS_CURVE_DATA;
AppendMarketDataType method = AppendMarketDataType.APPEND_FX_FORWARD_TENOR_CURVE_DATA;
AppendMarketDataType method = AppendMarketDataType.APPEND_FX_FORWARD_TENOR_PIPS_CURVE_DATA;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
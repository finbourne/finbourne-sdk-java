# com.finbourne.sdk.services.lusid.model.InstrumentSearchProperty
classname InstrumentSearchProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key of instrument property to search for. This will be from the &#39;Instrument&#39; domain and will take the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Isin&#39; or &#39;Instrument/MyScope/AssetClass&#39;. | [default to String]
**value** | **String** | The value of the property e.g. &#39;US0378331005&#39; or &#39;Equity&#39;. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentSearchProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String value = "example value";


InstrumentSearchProperty instrumentSearchPropertyInstance = new InstrumentSearchProperty()
    .key(key)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
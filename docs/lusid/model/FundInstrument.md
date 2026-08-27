# com.finbourne.sdk.services.lusid.model.FundInstrument
classname FundInstrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. Must only point to the same instrument | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.FundInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();


FundInstrument fundInstrumentInstance = new FundInstrument()
    .instrumentIdentifiers(instrumentIdentifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
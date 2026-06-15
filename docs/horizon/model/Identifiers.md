# com.finbourne.sdk.services.horizon.model.Identifiers
classname Identifiers
A list of lusid instrument ids

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentIds** | **List&lt;String&gt;** | The collection of LUSID instrument identifiers | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.Identifiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> lusidInstrumentIds = new List<String>();


Identifiers identifiersInstance = new Identifiers()
    .lusidInstrumentIds(lusidInstrumentIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
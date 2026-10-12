# com.finbourne.sdk.services.lusid.model.SwingSpreads
classname SwingSpreads
The stored spreads a Single fund swings by, one set for each direction of net cashflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflow** | [**DirectionSpreads**](DirectionSpreads.md) |  | [optional] [default to DirectionSpreads]
**outflow** | [**DirectionSpreads**](DirectionSpreads.md) |  | [optional] [default to DirectionSpreads]

```java
import com.finbourne.sdk.services.lusid.model.SwingSpreads;
import java.util.*;
import java.lang.System;
import java.net.URI;

DirectionSpreads inflow = new DirectionSpreads();
DirectionSpreads outflow = new DirectionSpreads();


SwingSpreads swingSpreadsInstance = new SwingSpreads()
    .inflow(inflow)
    .outflow(outflow);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
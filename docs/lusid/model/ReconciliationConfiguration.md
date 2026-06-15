# com.finbourne.sdk.services.lusid.model.ReconciliationConfiguration
classname ReconciliationConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ReconciliationSideConfiguration**](ReconciliationSideConfiguration.md) |  | [optional] [default to ReconciliationSideConfiguration]
**right** | [**ReconciliationSideConfiguration**](ReconciliationSideConfiguration.md) |  | [optional] [default to ReconciliationSideConfiguration]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReconciliationSideConfiguration left = new ReconciliationSideConfiguration();
ReconciliationSideConfiguration right = new ReconciliationSideConfiguration();
ResourceId mappingId = new ResourceId();


ReconciliationConfiguration reconciliationConfigurationInstance = new ReconciliationConfiguration()
    .left(left)
    .right(right)
    .mappingId(mappingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
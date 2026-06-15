# com.finbourne.sdk.services.lusid.model.RunCheckRequest
classname RunCheckRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidEntityDataset** | [**LusidEntityDataset**](LusidEntityDataset.md) |  | [optional] [default to LusidEntityDataset]
**limitIndividualBreachesPerRule** | **Integer** | The maximum number of individual breaches to return per rule. Defaults to 100 if not specified. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.RunCheckRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidEntityDataset lusidEntityDataset = new LusidEntityDataset();
Integer limitIndividualBreachesPerRule = new Integer("100.00");


RunCheckRequest runCheckRequestInstance = new RunCheckRequest()
    .lusidEntityDataset(lusidEntityDataset)
    .limitIndividualBreachesPerRule(limitIndividualBreachesPerRule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
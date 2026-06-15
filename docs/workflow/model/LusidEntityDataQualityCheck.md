# com.finbourne.sdk.services.workflow.model.LusidEntityDataQualityCheck
classname LusidEntityDataQualityCheck
Configuration for a Worker that calls runs a Lusid entity Data quality check in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.LusidEntityDataQualityCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


LusidEntityDataQualityCheck lusidEntityDataQualityCheckInstance = new LusidEntityDataQualityCheck()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
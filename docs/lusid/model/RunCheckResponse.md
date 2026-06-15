# com.finbourne.sdk.services.lusid.model.RunCheckResponse
classname RunCheckResponse
Response containing the results of running data quality checks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataQualityCheckResults** | [**List&lt;DataQualityCheckResult&gt;**](DataQualityCheckResult.md) | Collection of data quality check results | [optional] [default to List<DataQualityCheckResult>]

```java
import com.finbourne.sdk.services.lusid.model.RunCheckResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<DataQualityCheckResult> dataQualityCheckResults = new List<DataQualityCheckResult>();


RunCheckResponse runCheckResponseInstance = new RunCheckResponse()
    .dataQualityCheckResults(dataQualityCheckResults);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.workflow.model.ReRunConfiguration
classname ReRunConfiguration
Defines how re-run results for a given (child) TaskDefinitionId should be reconciled against existing (non-terminal) child tasks of the same parent Task instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**resultsRecurring** | [**ResultsRecurringConfiguration**](ResultsRecurringConfiguration.md) |  | [default to ResultsRecurringConfiguration]
**resultsNotRecurring** | [**ResultsNotRecurringConfiguration**](ResultsNotRecurringConfiguration.md) |  | [default to ResultsNotRecurringConfiguration]

```java
import com.finbourne.sdk.services.workflow.model.ReRunConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId taskDefinitionId = new ResourceId();
ResultsRecurringConfiguration resultsRecurring = new ResultsRecurringConfiguration();
ResultsNotRecurringConfiguration resultsNotRecurring = new ResultsNotRecurringConfiguration();


ReRunConfiguration reRunConfigurationInstance = new ReRunConfiguration()
    .taskDefinitionId(taskDefinitionId)
    .resultsRecurring(resultsRecurring)
    .resultsNotRecurring(resultsNotRecurring);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.luminesce.model.TableLineage
classname TableLineage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnLineage** | [**List&lt;Lineage&gt;**](Lineage.md) |  | [optional] [default to List<Lineage>]
**wholeTableLineage** | [**Lineage**](Lineage.md) |  | [optional] [default to Lineage]
**failureReason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.TableLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<Lineage> columnLineage = new List<Lineage>();
Lineage wholeTableLineage = new Lineage();
@javax.annotation.Nullable String failureReason = "example failureReason";


TableLineage tableLineageInstance = new TableLineage()
    .columnLineage(columnLineage)
    .wholeTableLineage(wholeTableLineage)
    .failureReason(failureReason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.lusid.model.GroupReconciliationResultStatuses
classname GroupReconciliationResultStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countNew** | **Integer** | The number of comparison results of resultStatus \&quot;New\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkNew** | [**Link**](Link.md) |  | [default to Link]
**countConfirmed** | **Integer** | The number of comparison results of resultStatus \&quot;Confirmed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkConfirmed** | [**Link**](Link.md) |  | [default to Link]
**countChanged** | **Integer** | The number of comparison results of resultStatus \&quot;Changed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkChanged** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationResultStatuses;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countNew = new Integer("100.00");
Link linkNew = new Link();
Integer countConfirmed = new Integer("100.00");
Link linkConfirmed = new Link();
Integer countChanged = new Integer("100.00");
Link linkChanged = new Link();


GroupReconciliationResultStatuses groupReconciliationResultStatusesInstance = new GroupReconciliationResultStatuses()
    .countNew(countNew)
    .linkNew(linkNew)
    .countConfirmed(countConfirmed)
    .linkConfirmed(linkConfirmed)
    .countChanged(countChanged)
    .linkChanged(linkChanged);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
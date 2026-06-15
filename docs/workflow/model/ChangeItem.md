# com.finbourne.sdk.services.workflow.model.ChangeItem
classname ChangeItem
Defines a change that occured to a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the change | [default to OffsetDateTime]
**userIdModified** | **String** | The User ID that performed the change | [default to String]
**requestIdModified** | **String** | The Request ID of the request that caused the change | [default to String]
**asAtVersionNumber** | **Integer** | The AsAt Version number | [default to Integer]
**action** | **String** | The Action that resulted in the change | [default to String]
**attributeName** | **String** | The name of the attribute that has been change | [default to String]
**previousValue** | **Object** | The value of the attribute prior to the change | [optional] [default to Object]
**newValue** | **Object** | The value of the attribute following the change | [default to Object]

```java
import com.finbourne.sdk.services.workflow.model.ChangeItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAtModified = OffsetDateTime.now();
String userIdModified = "example userIdModified";
String requestIdModified = "example requestIdModified";
Integer asAtVersionNumber = new Integer("100.00");
String action = "example action";
String attributeName = "example attributeName";
@javax.annotation.Nullable Object @javax.annotation.Nullable Object 

ChangeItem changeItemInstance = new ChangeItem()
    .asAtModified(asAtModified)
    .userIdModified(userIdModified)
    .requestIdModified(requestIdModified)
    .asAtVersionNumber(asAtVersionNumber)
    .action(action)
    .attributeName(attributeName)
    .previousValue(previousValue)
    .newValue(newValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
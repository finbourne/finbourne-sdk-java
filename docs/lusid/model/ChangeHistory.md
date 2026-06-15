# com.finbourne.sdk.services.lusid.model.ChangeHistory
classname ChangeHistory
A group of changes made by the same person at the same time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The unique identifier of the user that made the change. | [default to String]
**modifiedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date/time of the change. | [default to OffsetDateTime]
**requestId** | **String** | The unique identifier of the request that the changes were part of. | [default to String]
**action** | **String** | The action performed on the transaction. Available values: Create, Update, Delete. | [default to String]
**changes** | [**List&lt;ChangeItem&gt;**](ChangeItem.md) | The collection of changes that were made. | [default to List<ChangeItem>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ChangeHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

String userId = "example userId";
OffsetDateTime modifiedAsAt = OffsetDateTime.now();
String requestId = "example requestId";
String action = "example action";
List<ChangeItem> changes = new List<ChangeItem>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ChangeHistory changeHistoryInstance = new ChangeHistory()
    .userId(userId)
    .modifiedAsAt(modifiedAsAt)
    .requestId(requestId)
    .action(action)
    .changes(changes)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
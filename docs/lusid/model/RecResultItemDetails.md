# com.finbourne.sdk.services.lusid.model.RecResultItemDetails
classname RecResultItemDetails
The individual items that make up a rec result, split by side. Zero counts and empty arrays for  results that have cleared.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countLeft** | **Integer** | The number of items grouped on the left side. | [default to Integer]
**countRight** | **Integer** | The number of items grouped on the right side. | [default to Integer]
**left** | [**List&lt;RecResultItem&gt;**](RecResultItem.md) | The left-side items. | [optional] [default to List<RecResultItem>]
**right** | [**List&lt;RecResultItem&gt;**](RecResultItem.md) | The right-side items. | [optional] [default to List<RecResultItem>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultItemDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countLeft = new Integer("100.00");
Integer countRight = new Integer("100.00");
@javax.annotation.Nullable List<RecResultItem> left = new List<RecResultItem>();
@javax.annotation.Nullable List<RecResultItem> right = new List<RecResultItem>();


RecResultItemDetails recResultItemDetailsInstance = new RecResultItemDetails()
    .countLeft(countLeft)
    .countRight(countRight)
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
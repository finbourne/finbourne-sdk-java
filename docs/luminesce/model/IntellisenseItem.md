# com.finbourne.sdk.services.luminesce.model.IntellisenseItem
classname IntellisenseItem
Representation of an item in an Intellisense popup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **String** | The value to show the user in the popup | [default to String]
**value** | **String** | The value to substitute in | [default to String]
**meta** | **String** | The light-grey text shown to the right of the Caption in the popup | [optional] [default to String]
**score** | **Integer** | How important is this.  Bigger is more important. | [optional] [default to Integer]
**docHTML** | **String** | Popup further info (as in a whole documentation article!) | [optional] [default to String]
**type** | [**IntellisenseType**](IntellisenseType.md) |  | [optional] [default to IntellisenseType]

```java
import com.finbourne.sdk.services.luminesce.model.IntellisenseItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String caption = "example caption";
String value = "example value";
@javax.annotation.Nullable String meta = "example meta";
Integer score = new Integer("100.00");
@javax.annotation.Nullable String docHTML = "example docHTML";
IntellisenseType 

IntellisenseItem intellisenseItemInstance = new IntellisenseItem()
    .caption(caption)
    .value(value)
    .meta(meta)
    .score(score)
    .docHTML(docHTML)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
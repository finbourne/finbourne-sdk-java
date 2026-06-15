# com.finbourne.sdk.services.lusid.model.ChangeItem
classname ChangeItem
Information about a change to a field / property.  At least one of 'PreviousValue' or 'NewValue' will be set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the field or property that has been changed. | [default to String]
**previousValue** | **String** | The previous value for this field / property. | [optional] [default to String]
**newValue** | **String** | The new value for this field / property. | [optional] [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The market data time, i.e. the time to run the change from. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The market data time, i.e. the time to run the change until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ChangeItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String previousValue = "example previousValue";
@javax.annotation.Nullable String newValue = "example newValue";
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();


ChangeItem changeItemInstance = new ChangeItem()
    .fieldName(fieldName)
    .previousValue(previousValue)
    .newValue(newValue)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
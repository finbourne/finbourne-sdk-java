# com.finbourne.sdk.services.lusid.model.LifeCycleEventValue
classname LifeCycleEventValue
The instrument life cycle event result value type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | Available values: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset. | [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the event | [optional] [default to OffsetDateTime]
**eventValues** | [**ResultValueDictionary**](ResultValueDictionary.md) |  | [optional] [default to ResultValueDictionary]
**eventLineage** | [**LifeCycleEventLineage**](LifeCycleEventLineage.md) |  | [optional] [default to LifeCycleEventLineage]

```java
import com.finbourne.sdk.services.lusid.model.LifeCycleEventValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
ResultValueDictionary eventValues = new ResultValueDictionary();
LifeCycleEventLineage eventLineage = new LifeCycleEventLineage();


LifeCycleEventValue lifeCycleEventValueInstance = new LifeCycleEventValue()
    .effectiveDate(effectiveDate)
    .eventValues(eventValues)
    .eventLineage(eventLineage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
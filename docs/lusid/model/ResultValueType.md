# com.finbourne.sdk.services.lusid.model.ResultValueType
classname ResultValueType
Enum of possible result value type. Used discriminate the result values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResultValueType** | [**String**](.md) | **Enum of possible result value type. Used discriminate the result values** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultValueType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ResultValueType:
ResultValueType method = ResultValueType.RESULT_VALUE;
ResultValueType method = ResultValueType.RESULT_VALUE_DICTIONARY;
ResultValueType method = ResultValueType.RESULT_VALUE0_D;
ResultValueType method = ResultValueType.RESULT_VALUE_DECIMAL;
ResultValueType method = ResultValueType.RESULT_VALUE_INT;
ResultValueType method = ResultValueType.RESULT_VALUE_STRING;
ResultValueType method = ResultValueType.RESULT_VALUE_BOOL;
ResultValueType method = ResultValueType.RESULT_VALUE_CURRENCY;
ResultValueType method = ResultValueType.CASH_FLOW_VALUE;
ResultValueType method = ResultValueType.CASH_FLOW_VALUE_SET;
ResultValueType method = ResultValueType.RESULT_VALUE_LIFE_CYCLE_EVENT_VALUE;
ResultValueType method = ResultValueType.RESULT_VALUE_DATE_TIME_OFFSET;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
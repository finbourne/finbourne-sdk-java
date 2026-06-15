# com.finbourne.sdk.services.lusid.model.AddressKeyFilter
classname AddressKeyFilter
Class specifying a filtering operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Address for the value in the row | [optional] [default to String]
**operator** | **String** | What sort of comparison is the filter performing. Can be either \&quot;eq\&quot; for equals or \&quot;neq\&quot; for not equals. | [optional] [default to String]
**right** | [**ResultValue**](ResultValue.md) |  | [optional] [default to ResultValue]

```java
import com.finbourne.sdk.services.lusid.model.AddressKeyFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String left = "example left";
@javax.annotation.Nullable String operator = "example operator";
ResultValue right = new ResultValue();


AddressKeyFilter addressKeyFilterInstance = new AddressKeyFilter()
    .left(left)
    .operator(operator)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
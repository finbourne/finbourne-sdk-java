# com.finbourne.sdk.services.lusid.model.GroupedResultOfAddressKey
classname GroupedResultOfAddressKey
Holder class for a group of results. It consists of a list of columns and values for that column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List&lt;String&gt;** | The columns, or keys, for a particular group of results | [optional] [default to List<String>]
**values** | [**List&lt;ResultValue&gt;**](ResultValue.md) | The values for the list of results | [optional] [default to List<ResultValue>]

```java
import com.finbourne.sdk.services.lusid.model.GroupedResultOfAddressKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> columns = new List<String>();
@javax.annotation.Nullable List<ResultValue> values = new List<ResultValue>();


GroupedResultOfAddressKey groupedResultOfAddressKeyInstance = new GroupedResultOfAddressKey()
    .columns(columns)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
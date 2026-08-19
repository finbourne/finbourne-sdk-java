# com.finbourne.sdk.services.lusid.model.RecDefSideNames
classname RecDefSideNames

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The label for the left side of the reconciliation. | [default to String]
**right** | **String** | The label for the right side of the reconciliation. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecDefSideNames;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


RecDefSideNames recDefSideNamesInstance = new RecDefSideNames()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
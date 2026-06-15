# com.finbourne.sdk.services.lusid.model.LineageMember
classname LineageMember

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | Index to demonstrate position of lineage member in overall lineage | [default to Integer]
**label** | **String** | Label of the step corresponding to this lineage member | [default to String]
**subLabel** | **String** | SubLabel of the step corresponding to this lineage member | [default to String]
**infoType** | **String** | Optional. Type of Information | [optional] [default to String]
**information** | **String** | Optional. Information for the step corresponding to this lineage member, of type InfoType | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LineageMember;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer index = new Integer("100.00");
String label = "example label";
String subLabel = "example subLabel";
@javax.annotation.Nullable String infoType = "example infoType";
@javax.annotation.Nullable String information = "example information";


LineageMember lineageMemberInstance = new LineageMember()
    .index(index)
    .label(label)
    .subLabel(subLabel)
    .infoType(infoType)
    .information(information);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
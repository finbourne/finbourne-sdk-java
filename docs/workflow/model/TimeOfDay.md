# com.finbourne.sdk.services.workflow.model.TimeOfDay
classname TimeOfDay
A time of the day

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of Time of Day | [default to String]
**code** | **String** | Code of the Cut Label | [default to String]
**hours** | **Integer** | Hours | [default to Integer]
**minutes** | **Integer** | Minutes | [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.TimeOfDay;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with CutLabelReference TimeOfDay
CutLabelReference timeOfDay = new CutLabelReference();
timeOfDay.setType(CutLabelReference.TypeEnum.CUTLABELREFERENCE);
TimeOfDay config = new TimeOfDay(timeOfDay);

```
 See all compatible oneOf types with TimeOfDay
* [CutLabelReference](./CutLabelReference.md)

* [SpecifiedTime](./SpecifiedTime.md)


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
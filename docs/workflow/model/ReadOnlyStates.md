# com.finbourne.sdk.services.workflow.model.ReadOnlyStates
classname ReadOnlyStates
Information about which states the field can be edited in

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stateType** | **String** | The State Type (e.g. InitialState, AllStates, TerminalState, SelectedStates) | [default to String]
**selectedStates** | **List&lt;String&gt;** | Named states for which the field will be readonly - This field can only be populated if StateType &#x3D; SelectedStates | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.workflow.model.ReadOnlyStates;
import java.util.*;
import java.lang.System;
import java.net.URI;

String stateType = "example stateType";
@javax.annotation.Nullable List<String> selectedStates = new List<String>();


ReadOnlyStates readOnlyStatesInstance = new ReadOnlyStates()
    .stateType(stateType)
    .selectedStates(selectedStates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
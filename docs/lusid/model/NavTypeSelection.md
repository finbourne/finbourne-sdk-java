# com.finbourne.sdk.services.lusid.model.NavTypeSelection
classname NavTypeSelection
How a fund list's NAV type codes hint selects from a fund's matching NAV types: the first match  in hint priority order, or every match.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NavTypeSelection** | [**String**](.md) | **How a fund list&#39;s NAV type codes hint selects from a fund&#39;s matching NAV types: the first match  in hint priority order, or every match.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.NavTypeSelection;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of NavTypeSelection:
NavTypeSelection method = NavTypeSelection.FIRST;
NavTypeSelection method = NavTypeSelection.ALL;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
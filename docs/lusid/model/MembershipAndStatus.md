# com.finbourne.sdk.services.lusid.model.MembershipAndStatus
classname MembershipAndStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Describes whether the entity is still a valid member of the data model. | [default to String]
**scope** | **String** | The scope of the unique identifier associated with the Custom Data Model. | [default to String]
**code** | **String** | The code of the unique identifier associated with the Custom Data Model. | [default to String]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]
**validationFailures** | **List&lt;String&gt;** | A list of validation failures returned when the entity&#39;s status with respect to the current model is &#39;Invalid&#39; or &#39;Inadmissible&#39; | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.MembershipAndStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
String scope = "example scope";
String code = "example code";
String displayName = "example displayName";
List<String> validationFailures = new List<String>();


MembershipAndStatus membershipAndStatusInstance = new MembershipAndStatus()
    .status(status)
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .validationFailures(validationFailures);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
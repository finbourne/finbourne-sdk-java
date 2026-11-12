# com.finbourne.sdk.services.lusid.model.TaxClassificationException
classname TaxClassificationException
Why an instrument could not be classified, or a flip of the qualifying-investments test a reviewer must see.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | MissingInputs, ConflictingSetup, ConflictingOverride or QualifyingInvestmentsCrossing. Available values: MissingInputs, ConflictingSetup, ConflictingOverride, QualifyingInvestmentsCrossing. | [default to String]
**code** | **String** | The stable code of the exception, for filtering and routing. | [default to String]
**message** | **String** | A description of why the instrument could not be classified or why the crossing was raised. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String kind = "example kind";
String code = "example code";
String message = "example message";


TaxClassificationException taxClassificationExceptionInstance = new TaxClassificationException()
    .kind(kind)
    .code(code)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
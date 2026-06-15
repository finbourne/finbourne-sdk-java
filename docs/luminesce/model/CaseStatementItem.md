# com.finbourne.sdk.services.luminesce.model.CaseStatementItem
classname CaseStatementItem
Information about a case statement. A typical case statement would look like: CASE WHEN Field {Filter} Source THEN Target For example: CASE WHEN 'currency' = 'USD' THEN 'US' Here the Field is 'currency', the Source is 'USD', the Filter is '=', and the Target is 'US'

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** | The operator in the case statement SQL expression | [default to String]
**source** | **String** | The expression that is on the LHS of the operator A typical case statement would look like: CASE Field {Filter} Source THEN Target | [default to String]
**target** | **String** | The expression that is on the RHS of the operator A typical case statement would look like: CASE Field {Filter} Source THEN Target | [default to String]
**isTargetNonLiteral** | **Boolean** | The Target can be a literal value or a non literal (field) and hence will be interpreted differently. This can be determined from the UI and passed down as a true / false | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.CaseStatementItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filter = "example filter";
String source = "example source";
String target = "example target";
Boolean isTargetNonLiteral = true;


CaseStatementItem caseStatementItemInstance = new CaseStatementItem()
    .filter(filter)
    .source(source)
    .target(target)
    .isTargetNonLiteral(isTargetNonLiteral);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
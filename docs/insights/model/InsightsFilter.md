# com.finbourne.sdk.services.insights.model.InsightsFilter
classname InsightsFilter
A single filter applied to a queryable log field. Exactly one comparator (Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Text, Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Numeric, Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Date or Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Boolean) must be populated, and its type must match the data type of the field named by Finbourne.Insights.WebApi.Dtos.Querying.InsightsFilter.Field. The available comparator and operation for a field can be discovered via the queryable-fields metadata endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The name of the field to filter on (case-insensitive). Must be a filterable field of the queried log type. | [default to String]
**text** | [**TextComparator**](TextComparator.md) |  | [optional] [default to TextComparator]
**numeric** | [**NumericComparator**](NumericComparator.md) |  | [optional] [default to NumericComparator]
**date** | [**DateComparator**](DateComparator.md) |  | [optional] [default to DateComparator]
**_boolean** | [**BooleanComparator**](BooleanComparator.md) |  | [optional] [default to BooleanComparator]

```java
import com.finbourne.sdk.services.insights.model.InsightsFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String field = "example field";
TextComparator text = new TextComparator();
NumericComparator numeric = new NumericComparator();
DateComparator date = new DateComparator();
BooleanComparator boolean = new BooleanComparator();


InsightsFilter insightsFilterInstance = new InsightsFilter()
    .field(field)
    .text(text)
    .numeric(numeric)
    .date(date)
    .boolean(boolean);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
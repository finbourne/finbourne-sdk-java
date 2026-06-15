# com.finbourne.sdk.services.luminesce.model.BackgroundQueryProgressResponse
classname BackgroundQueryProgressResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasData** | **Boolean** | Is there currently data for this Query? | [optional] [default to Boolean]
**rowCount** | **Integer** | Number of rows of data held. -1 if none as yet. | [optional] [default to Integer]
**status** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**state** | [**BackgroundQueryState**](BackgroundQueryState.md) |  | [optional] [default to BackgroundQueryState]
**progress** | **String** | The full progress log (up to this point at least) | [optional] [default to String]
**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress).  A given message will be returned from only one call. | [optional] [default to List<FeedbackEventArgs>]
**query** | **String** | The LuminesceSql of the original request | [optional] [default to String]
**queryName** | **String** | The QueryName given in the original request | [optional] [default to String]
**columnsAvailable** | [**List&lt;Column&gt;**](Column.md) | When HasData is true this is the schema of columns that will be returned if the data is requested | [optional] [default to List<Column>]
**lineage** | [**TableLineage**](TableLineage.md) |  | [optional] [default to TableLineage]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundQueryProgressResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean hasData = true;
Integer rowCount = new Integer("100.00");
TaskStatus BackgroundQueryState @javax.annotation.Nullable String progress = "example progress";
@javax.annotation.Nullable List<FeedbackEventArgs> feedback = new List<FeedbackEventArgs>();
@javax.annotation.Nullable String query = "example query";
@javax.annotation.Nullable String queryName = "example queryName";
@javax.annotation.Nullable List<Column> columnsAvailable = new List<Column>();
TableLineage lineage = new TableLineage();


BackgroundQueryProgressResponse backgroundQueryProgressResponseInstance = new BackgroundQueryProgressResponse()
    .hasData(hasData)
    .rowCount(rowCount)
    .status(status)
    .state(state)
    .progress(progress)
    .feedback(feedback)
    .query(query)
    .queryName(queryName)
    .columnsAvailable(columnsAvailable)
    .lineage(lineage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
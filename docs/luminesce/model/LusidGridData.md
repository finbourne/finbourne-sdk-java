# com.finbourne.sdk.services.luminesce.model.LusidGridData
classname LusidGridData
Representation of the data we will get from the dashboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidGridDesign** | [**TableView**](TableView.md) |  | [default to TableView]
**resourceId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**dashboardType** | [**DashboardType**](DashboardType.md) |  | [optional] [default to DashboardType]
**useSettleDate** | **Boolean** | Whether to use the Settlement date or the Transaction date | [optional] [default to Boolean]
**dates** | [**DateParameters**](DateParameters.md) |  | [optional] [default to DateParameters]
**recipe** | **String** | The recipe to use for valuations | [optional] [default to String]
**currency** | **String** | The currency to use for valuations | [optional] [default to String]
**tenor** | **String** | The tenor to use for valuations | [optional] [default to String]
**orderFlow** | **String** | Type of order flow to include | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.LusidGridData;
import java.util.*;
import java.lang.System;
import java.net.URI;

TableView lusidGridDesign = new TableView();
ResourceId resourceId = new ResourceId();
DashboardType @javax.annotation.Nullable Boolean useSettleDate = true;
DateParameters dates = new DateParameters();
@javax.annotation.Nullable String recipe = "example recipe";
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String tenor = "example tenor";
@javax.annotation.Nullable String orderFlow = "example orderFlow";


LusidGridData lusidGridDataInstance = new LusidGridData()
    .lusidGridDesign(lusidGridDesign)
    .resourceId(resourceId)
    .dashboardType(dashboardType)
    .useSettleDate(useSettleDate)
    .dates(dates)
    .recipe(recipe)
    .currency(currency)
    .tenor(tenor)
    .orderFlow(orderFlow);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
# com.finbourne.sdk.services.luminesce.model.FileReaderBuilderDef
classname FileReaderBuilderDef
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoDetect** | [**AutoDetectType**](AutoDetectType.md) |  | [optional] [default to AutoDetectType]
**columns** | [**List&lt;ColumnInfo&gt;**](ColumnInfo.md) | Column information for the results | [optional] [default to List<ColumnInfo>]
**limit** | **Integer** | What limit be added to the load query?  Less than or equal to zero means none | [optional] [default to Integer]
**source** | [**Source**](Source.md) |  | [optional] [default to Source]
**availableSources** | [**List&lt;Source&gt;**](Source.md) | The source locations the user has access to.  The provider in essence. | [optional] [default to List<Source>]
**variableName** | **String** | The name of the variable for the &#x60;use&#x60; statement | [optional] [default to String]
**filePath** | **String** | The file (or folder) path | [optional] [default to String]
**folderFilter** | **String** | The filter to apply to a folder (all matching files then being read) a RegExp | [optional] [default to String]
**zipFilter** | **String** | The filter to apply to folder structures with zip archives (all matching files then being read) a RegExp | [optional] [default to String]
**addFileName** | **Boolean** | Should a file name column be added to the output? | [optional] [default to Boolean]
**csv** | [**OptionsCsv**](OptionsCsv.md) |  | [optional] [default to OptionsCsv]
**excel** | [**OptionsExcel**](OptionsExcel.md) |  | [optional] [default to OptionsExcel]
**sqLite** | [**OptionsSqLite**](OptionsSqLite.md) |  | [optional] [default to OptionsSqLite]
**xml** | [**OptionsXml**](OptionsXml.md) |  | [optional] [default to OptionsXml]
**parquet** | [**OptionsParquet**](OptionsParquet.md) |  | [optional] [default to OptionsParquet]

```java
import com.finbourne.sdk.services.luminesce.model.FileReaderBuilderDef;
import java.util.*;
import java.lang.System;
import java.net.URI;

AutoDetectType @javax.annotation.Nullable List<ColumnInfo> columns = new List<ColumnInfo>();
Integer limit = new Integer("100.00");
Source source = new Source();
@javax.annotation.Nullable List<Source> availableSources = new List<Source>();
@javax.annotation.Nullable String variableName = "example variableName";
@javax.annotation.Nullable String filePath = "example filePath";
@javax.annotation.Nullable String folderFilter = "example folderFilter";
@javax.annotation.Nullable String zipFilter = "example zipFilter";
Boolean addFileName = true;
OptionsCsv csv = new OptionsCsv();
OptionsExcel excel = new OptionsExcel();
OptionsSqLite sqLite = new OptionsSqLite();
OptionsXml xml = new OptionsXml();
OptionsParquet parquet = new OptionsParquet();


FileReaderBuilderDef fileReaderBuilderDefInstance = new FileReaderBuilderDef()
    .autoDetect(autoDetect)
    .columns(columns)
    .limit(limit)
    .source(source)
    .availableSources(availableSources)
    .variableName(variableName)
    .filePath(filePath)
    .folderFilter(folderFilter)
    .zipFilter(zipFilter)
    .addFileName(addFileName)
    .csv(csv)
    .excel(excel)
    .sqLite(sqLite)
    .xml(xml)
    .parquet(parquet);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
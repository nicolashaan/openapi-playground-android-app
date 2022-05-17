
# UrlEntityEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **kotlin.Int** | Index (zero-based) at which position this entity starts.  The index is inclusive. | 
**end** | **kotlin.Int** | Index (zero-based) at which position this entity ends.  The index is exclusive. | 
**url** | [**java.net.URI**](java.net.URI.md) | A validly formatted URL. | 
**expandedUrl** | [**java.net.URI**](java.net.URI.md) | A validly formatted URL. |  [optional]
**displayUrl** | **kotlin.String** | The URL as displayed in the Twitter client. |  [optional]
**unwoundUrl** | [**java.net.URI**](java.net.URI.md) | Fully resolved url |  [optional]
**status** | **kotlin.Int** | HTTP Status Code. |  [optional]
**title** | **kotlin.String** | Title of the page the URL points to. |  [optional]
**description** | **kotlin.String** | Description of the URL landing page. |  [optional]
**images** | [**kotlin.collections.List&lt;URLImageEntity&gt;**](URLImageEntity.md) |  |  [optional]
**mediaKey** | **kotlin.String** | The Media Key identifier for this attachment. |  [optional]




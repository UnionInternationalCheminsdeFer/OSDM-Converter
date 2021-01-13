# OSDM-Converter

Converter Tool to convert between old fare data according to UIC IRS 10108-1 (TAP-TSI B.1) into the OSDM offline data format. 

see online Application Guide on: https://unioninternationalcheminsdefer.github.io/OSDM-Converter/

latest Release: https://github.com/UnionInternationalCheminsdeFer/OSDM-Converter/releases

download binaries: https://github.com/UnionInternationalCheminsdeFer/OSDM-Converter/releases/download


## OSDM Specification IRS 90918-10:

see online content on: https://unioninternationalcheminsdefer.github.io/OSDM/

## editor and data conversion (GTM data converter):

* Data conversion and editing for data formats: UIC IRS 10108-1 (old) and IRS 90918-10 (new)
* Eclipse EMF generated RCP application
* eclipse version 2019

### GTM model:

* JSON schema
* generated java code for bulk data using jsonschema2pojo

### GTM data converter - conversion data model and resource implementation
* model:  ecore data model
* src: generated code

### GTM data converter.edit - editing support for the data model
* src: generated code
* img: generated images

### GTM data converter.editor - eclipse RCP application
* src/GTM/presentation - generated code (with a few changes)
* src/actions - user actions to be implemented (import/export, format conversions)
* html: - integrated help pages
* img: generated images

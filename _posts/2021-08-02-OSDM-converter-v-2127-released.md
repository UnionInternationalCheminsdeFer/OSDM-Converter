---
layout: post
title: "OSDM Converter V.2.1.27 Released"
author: Clemens Gantert
date: 2021-08-02 14:00:33 +0100
categories: osdm update
---
Converter version 2.1.27

New in this release:

Conversion of border stations missing in MERITS code list:

  - Conversion of virtual border "stations" missing in Merits has been added. In the conversion from 1908 to OSDM these border stations will disapear as only Merits stations are allowed, the border point code will survive in the connection point of regional constraint. In the conversion from OSDM back to 918 the virtual border station is rebuild from the local code in the border point list. The name is taken from the last station before the border and the border indication (default (GR) is added. The border indication can be edited in the conversion parameter.

automated unit test added:

 - converison of virtual border "stations" missing in Merits
 - conversion of fare station sets on a border (e.g. Salzburg)
 - conversion of routes with multiple and complex via stations (e.g. (AB)(CD)E , (ABC)(DE) )

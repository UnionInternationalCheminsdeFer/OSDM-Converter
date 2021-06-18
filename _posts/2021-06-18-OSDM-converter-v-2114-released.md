---
layout: post
title: "OSDM Converter V.2.1.11 Released"
author: Clemens Gantert
date: 2021-06-18 11:30:33 +0100
categories: osdm update
---

Converter version 2.1.14

features:
- rounding rules on 20 cent
- support for fare reference station sets containing border stations
   if a fare reference station set contains a station with a legacy border point code this code will be used to select the connection point.for OSDM
- additional error messages for OSDM import in case of missing references

fixes:
- handle old and new service class ids
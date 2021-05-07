---
layout: post
title: "OSDM Converter V.2.1.5 Released"
author: Clemens Gantert
date: 2021-05-07 11:30:33 +0100
categories: osdm update
---

Converter version 2.1.5

Includes: 

Features:
- priority for Station to serviceConstraint mappings. If a mapping of a station to a service constraint exists the service constraint will be used even if it is a valid station 
- text element in service constraint enabled in route text
- documentation on service constraint conversion
- additional rounding rules for 10 cents
- improved error messages (station names added)

bug fixes:
- rounding error of 1 cent fixed
- bug fix for automatically created ids of PassengerConstraints 
---
layout: post
title: "OSDM Converter V.2.1.13 Released"
author: Clemens Gantert
date: 2021-06-14 11:30:33 +0100
categories: osdm update
---

Converter version 2.1.13

Changed selection of the route direction in the conversion from OSDM to 108

The selection of the direction is now based on the alphabetical order of the departure 
and arrival station. Routes where the arrival station name is alphabetical smaller that 
the departure station name are not converted and exported).
For border series the border point is always the departure.


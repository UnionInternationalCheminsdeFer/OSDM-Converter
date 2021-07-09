---
layout: post
title: "OSDM Converter V.2.1.16 Released"
author: Clemens Gantert
date: 2021-07-09 14:30:33 +0100
categories: osdm update
---

Converter version 2.1.16

Changes:

- new error messages to avoid 108 fare tables split by classes (fare text must not depend on the class)
- enable multiple validity ranges in 108 price tables
- removing orphaned objects that might have been created in error cases when using both conversion directions with the same .gtm file.

Bug fixes:

- missing flag in TCVM file
- indication of TCVP,M,L in TCV file restored

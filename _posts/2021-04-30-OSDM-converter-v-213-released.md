---
layout: post
title: "OSDM Converter V.2.1.3 Released"
author: Clemens Gantert
date: 2021-04-30 11:30:33 +0100
categories: osdm update
---

Converter version 2.1.3

Includes: 
- new option to filter the fare templates by the type of series (border, transit, domestic) providing the posibility to have different fare templates for there types
- default character sets per country are defined to simplify the handling of special characters.  The conversion parameter for the character set now allows the use of the default per country.
- the legacy accounting tariff id was moved directly in the fare template to be more visible. In case there are already tariff ids in the data the migration is done automatically.

- bug fix on TCVL conversion
   
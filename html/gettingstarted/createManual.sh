#!/usr/bin/env bash

# Needs pandoc to be installed
  
pandoc -s --toc -o manual.docx *.html ../reference/*.html
#!/usr/bin/env bash

# Needs pandoc to be installed
  
pandoc -s --toc -o manual.docx --print-default-data-file reference.docx  *.html ../reference/*.html > bla.doc
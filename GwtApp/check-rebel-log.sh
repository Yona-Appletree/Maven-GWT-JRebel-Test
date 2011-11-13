#!/bin/sh

echo "Directory Watching Lines:"
grep -i "Directory .* will be monitored" rebel.log
echo
echo "Instrumenting Lines: "
grep -i "instrumented" rebel.log | grep --color "org\.hypher[^\']*" -
#!/bin/bash

# Specify the file name
file_name="myfile.txt"

# Check if the file exists in the current directory
if [ -f "$file_name" ]; then
    echo "File exists"
else
    echo "File not found"
fi
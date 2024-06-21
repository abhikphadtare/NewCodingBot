#!/bin/bash

# Function to count the number of lines in a file
count_lines() {
    local file_name=$1

    # Check if the file exists
    if [ -f "$file_name" ]; then
        local line_count=$(wc -l < "$file_name")
        echo "The file '$file_name' has $line_count lines."
    else
        echo "File '$file_name' not found."
    fi
}

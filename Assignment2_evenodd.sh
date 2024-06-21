#!/bin/bash

echo "Enter numbers (enter 0 to stop):"

while true; do
    read -p "Enter a number: " num

    # Check if the input is '0' to break out of the loop
    if [ "$num" -eq 0 ]; then
        echo "Exiting..."
        break
    fi

    # Check if the number is odd or even
    if [ $((num % 2)) -eq 0 ]; then
        echo "$num is even."
    else
        echo "$num is odd."
    fi
done

#!/bin/bash

echo "Numbers less than 10:"

num=1
while [ $num -lt 10 ]; do
    echo $num
    num=$((num + 1))
done
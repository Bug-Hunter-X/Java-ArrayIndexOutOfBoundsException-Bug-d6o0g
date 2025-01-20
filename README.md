# Java ArrayIndexOutOfBoundsException Bug
This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`.  The `Bug.java` file contains code that attempts to access an array element beyond its valid index range. The `Solution.java` file provides a corrected version.

## How to reproduce the bug
1. Compile `Bug.java`
2. Run the compiled class
3. Observe the `ArrayIndexOutOfBoundsException`

## Solution
The solution involves checking array bounds before accessing elements, or using techniques like ArrayLists which handle bounds checking automatically.
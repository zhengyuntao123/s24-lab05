# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation`.

Lab05 Handout can be found at: [https://github.com/CMU-17-214/s2024/blob/main/labs/lab05.md](https://github.com/CMU-17-214/s2024/blob/main/labs/lab05.md)

# Discussion
1. Inheritance is more dependent on the implementation of the `sortedIntList`, because most of function are not overrided.
2. InheritanceSortedIntList is more likely to break, because it relies on the implementation of super class
3. Composition can solve high coupling issues, while inheritance result in high coupling.
4. If we don't care much about safety problem and hope to write less code, it's appropriate to use inheritance. Otherwise, it's better to use composition, because it has more flexibilty and low coupling.
[![Build Status](https://travis-ci.org/samsch-wasp/pig-latin.svg?branch=master)](https://travis-ci.org/samsch-wasp/pig-latin)
# pig-latin

This repository contains code for a simple pig latin tool

* Some Java source code, see `src/main/java`
* Some JUnit tests, see `src/test/java`
* An Ant build file with targets for `build`, `test`, `jar`, `run` and `clean`. See `build.xml`.
* We don't use any dependencies to download libraries. Instead, all dependent libraries are in included in the project in the `lib` folder.

# Installation

To run this project, you need to have Java and Ant installed.

# Build

Do
* `ant build` to compile
* `ant test` to additionally run all tests
* `ant jar` to generate a `PigLatin.jar` file
* `ant clean` to clean away generated files.

# Run

To translate your sentence:
* `ant run -Dwords="this is my sentence"`

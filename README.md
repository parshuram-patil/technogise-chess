# Chess Board Simulator

## Prerequisites

- **Java 17 or above**. You can download and install it
  from [here](https://www.oracle.com/java/technologies/java-se-glance.html).
- **Git**. Download and install it using [this](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).

## Setup Instructions

1. Clone the repository `git clone https://github.com/parshuram-patil/technogise-chess.git`
2. Change directory `cd technogise-chess`
3. Run `./gradlew clean build` to build the project
4. Execute `java -jar .\build\libs\technogise-chess-0.0.1-SNAPSHOT.jar` to run the application

## Problem to solve

Simulate the movement of the following three pieces on an empty chessboard:

1. Pawn - It can only move 1 step at a time, in the vertical forward direction.
2. King - It can only move 1 step at a time, in all 8 directions (vertical, horizontal and diagonal)
3. Queen - It can move across the board in all 8 directions.

The Input and Output is illustrated in Usage section below.

## Usage

- Enter input in the format: `<Piece>, <Position>`
- Example: `King, D5`
- Output: Possible moves for the piece

## Testing

Run `./gradlew test` to execute unit tests.

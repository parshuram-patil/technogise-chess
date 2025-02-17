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
4. Horse - It moves in an "L" shape: 2 squares in one direction (either vertical or horizontal), followed by 1 square
   perpendicular to that direction. It can jump over other pieces.
5. Bishop - It can move any number of steps, but only in diagonal directions.
6. Rook - It can move any number of steps, but only in the vertical or horizontal direction.

When creating a new chess piece, an optional color parameter can be provided. If no color is specified, the default
color will be **white**.

Example:

```java
Piece king = new King(new Position('D',5)); // Defaults to WHITE
Piece blackQueen = new Queen(new Position('E',4),PieceColor.BLACK); // Explicitly setting BLACK color
```

The Input and Output is illustrated in Usage section below.

## Usage

- Input Format
  ```text
  <Piece>, <Position>[, <Color>] 
  ```
  where, Color is optional. If provided, it will be used; otherwise, the piece defaults to WHITE.

- Examples:
  ```text
    King, D5          // White King at D5
  ``` 

  ```text
    Queen, E4, BLACK  // Black Queen at E4
  ```
- Output: List of all possible moves

## Testing

Run `./gradlew test` to execute unit tests.

package com.technogise.technogise_chess;

import com.technogise.technogise_chess.model.PieceType;
import com.technogise.technogise_chess.model.Position;
import com.technogise.technogise_chess.piece.King;
import com.technogise.technogise_chess.piece.Pawn;
import com.technogise.technogise_chess.piece.Piece;
import com.technogise.technogise_chess.piece.Queen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TechnogiseChessApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnogiseChessApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input: ");
		String input = scanner.nextLine();
		try {
			System.out.println(getPossibleMoves(input));
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	private static List<Position> getPossibleMoves(String input) {
		String[] parts = input.split(", ");

		if (parts.length != 2) {
			throw new IllegalArgumentException("Invalid Input");
		}

		PieceType pieceType = PieceType.valueOf(parts[0].toUpperCase());
		Position position = new Position(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));
		Piece piece;
		switch (pieceType) {
			case PAWN -> piece = new Pawn(position);
			case KING -> piece = new King(position);
			case QUEEN -> piece = new Queen(position);
			default -> throw new IllegalArgumentException("Invalid Piece");
		}
		return piece.getPossibleMoves();
	}

}

package com.technogise.technogise_chess;

import com.technogise.technogise_chess.model.PieceColor;
import com.technogise.technogise_chess.model.PieceType;
import com.technogise.technogise_chess.model.Position;
import com.technogise.technogise_chess.piece.King;
import com.technogise.technogise_chess.piece.Pawn;
import com.technogise.technogise_chess.piece.Piece;
import com.technogise.technogise_chess.piece.Queen;

import java.util.List;
import java.util.Scanner;

public class TechnogiseChessApplication {

	public static void main(String[] args) {
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

		if (parts.length < 2) {
			throw new IllegalArgumentException("Invalid Input");
		}

		PieceColor color = PieceColor.WHITE;
		if (parts.length == 3)
			color = PieceColor.valueOf(parts[2]);


		PieceType pieceType = PieceType.valueOf(parts[0].toUpperCase());
		Position position = new Position(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));
		Piece piece;
		switch (pieceType) {
			case PAWN -> piece = new Pawn(position, color);
			case KING -> piece = new King(position, color);
			case QUEEN -> piece = new Queen(position, color);
			default -> throw new IllegalArgumentException("Invalid Piece");
		}
		return piece.getPossibleMoves();
	}

}

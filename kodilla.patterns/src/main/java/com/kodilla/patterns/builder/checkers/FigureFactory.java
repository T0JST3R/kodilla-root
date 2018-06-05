package com.kodilla.patterns.builder.checkers;

public class FigureFactory {
    public final static String PAWN = "PAWN";
    public final static String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType , String figureColor){
        if (figureType.equals(PAWN)){
            return new Pawn(figureColor);
        }
        else if (figureType.equals(QUEEN)){
            return new Queen(figureColor);
        }
        else throw new IllegalStateException("Figures should be only PAWN or QUEEN !");
    }
}

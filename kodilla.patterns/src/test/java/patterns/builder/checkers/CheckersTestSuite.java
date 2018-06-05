package patterns.builder.checkers;

import com.kodilla.patterns.builder.checkers.Checkers;
import com.kodilla.patterns.builder.checkers.Figure;
import com.kodilla.patterns.builder.checkers.FigureFactory;
import com.kodilla.patterns.builder.checkers.Pawn;
import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void checkersTestSuite(){
        //Given

        Checkers checkers = new Checkers.CheckersBuilder()
                .setPlayerOne("player1")
                .setPlayerTwo("Player2")
                .Figure(FigureFactory.PAWN , Figure.BLACK , 2 , 4)
                .Figure(FigureFactory.QUEEN , Figure.WHITE , 2 ,5)
                .Figure(FigureFactory.PAWN , Figure.WHITE , 1 , 1)
                .build();
        System.out.println(checkers.getBoard());

        //when

        Figure figureOne =  checkers.getBoard().getFigure(2 , 4);
        Figure figureTwo = checkers.getBoard().getFigure(2 , 5);
        Figure figureThree = checkers.getBoard().getFigure(1 , 1);
        Figure figureFour = checkers.getBoard().getFigure(7 , 7);

        //Then
        Assert.assertEquals(Figure.WHITE , figureTwo.getColor());
        Assert.assertEquals(Figure.BLACK , figureOne.getColor());
        Assert.assertEquals(Pawn.class, figureThree.getClass());
        Assert.assertNull(figureFour);
    }
}

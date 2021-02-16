package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        assertThat(bishopBlack.position(), is(expected));
    }

    @Test
    public void testCopy() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack = bishopBlack.copy(Cell.H6);
        Cell expected = Cell.H6;
        assertThat(bishopBlack.position(), is(expected));
    }

    @Test
    public void testWay() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4};
        assertThat(bishopBlack.way(Cell.G5), is(expected));
    }
}
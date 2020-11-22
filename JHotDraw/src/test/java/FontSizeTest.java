
import org.jhotdraw.draw.TextHolderFigure;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcu
 */
public class FontSizeTest {
    private TextHolderFigure tf;
    private TextHolderFigure ta;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tf = new SVGTextFigure();
        ta = new SVGTextAreaFigure();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testTextFontSize(){
        assertNotNull(tf.getFontSize());
        tf.setFontSize(25);
        assertTrue(tf.getFontSize() == 25);
        tf.setFontSize(-1);
        assertFalse(tf.getFontSize() == -1);
    }
    
    @Test
    public void testTextAreaFontSize(){
        
        assertNotNull(ta.getFontSize());
        ta.setFontSize(25);
        assertTrue(ta.getFontSize() == 25);
        ta.setFontSize(-1);
        assertFalse(ta.getFontSize() == -1);
    }

}

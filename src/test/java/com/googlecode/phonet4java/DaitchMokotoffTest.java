/**
 *
 */
package com.googlecode.phonet4java;

import com.googlecode.phonet4java.DaitchMokotoff;

import junit.framework.TestCase;


/**
 * @author Jesper Zedlitz &lt;jze@informatik.uni-kiel.de&gt;
 *
 */
public class DaitchMokotoffTest extends TestCase {
    private DaitchMokotoff phonet = new DaitchMokotoff();

    public void testEmpty() {
        assertEquals("000000", phonet.code(""));
    }

    public void testNull() {
        assertEquals("000000", phonet.code(null));
    }

    public void testUnkownCharacter() {
        assertEquals("000000", phonet.code("$"));
    }

    public void testAuerbach() {
        assertEquals("097500", phonet.code("Auerbach"));
    }

    public void testOhrbach() {
        assertEquals("097500", phonet.code("OHRBACH"));
    }

    public void testLipshitz() {
        assertEquals("874400", phonet.code("LIPSHITZ"));
    }

    public void testLewinsky() {
        assertEquals("876450", phonet.code("LEWINSKY"));
    }

    public void testLevinski() {
        assertEquals("876450", phonet.code("LEVINSKI"));
    }

    public void testSzlamawicz() {
        assertEquals("486740", phonet.code("SZLAMAWICZ"));
    }

    public void testShlamovitz() {
        assertEquals("486740", phonet.code("SHLAMOVITZ"));
    }
}

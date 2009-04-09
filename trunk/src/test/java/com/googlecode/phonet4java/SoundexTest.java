/**
 *
 */
package com.googlecode.phonet4java;

import com.googlecode.phonet4java.Soundex;

import junit.framework.TestCase;


/**
 * @author Jesper Zedlitz &lt;jze@informatik.uni-kiel.de&gt;
 *
 */
public class SoundexTest extends TestCase {
    Soundex soundex = new Soundex();

    public void testUppercase() throws Exception {
        assertEquals("Z343", soundex.code("Zedlitz"));
    }

    public void testLowercase() throws Exception {
        assertEquals("Z343", soundex.code("zedlitz"));
    }

    public void testEmpty() throws Exception {
        assertEquals("Z000", soundex.code(""));
    }

    public void testNull() throws Exception {
        assertEquals("Z000", soundex.code(null));
    }

    public void testUnknownCharacter() throws Exception {
        assertEquals("Z000", soundex.code("$"));
    }

    public void testUmlauts() {
        assertEquals("O200", soundex.code("ößüä"));
    }
}

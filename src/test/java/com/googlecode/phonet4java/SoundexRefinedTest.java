/**
 * 
 */
package com.googlecode.phonet4java;

import com.googlecode.phonet4java.SoundexRefined;

import junit.framework.TestCase;

/**
 * @author Jesper Zedlitz &lt;jze@informatik.uni-kiel.de&gt;
 *
 */
public class SoundexRefinedTest extends TestCase{
    
    SoundexRefined phonet = new SoundexRefined();
    
    public void testEmpty() {
	assertEquals("Z000", phonet.code(""));
    }
    
    public void testNull() {
	assertEquals("Z000", phonet.code(null));
    }

    public void testUnkownCharacter() {
	assertEquals("Z000", phonet.code("$"));
    }

    public void testZedlitz() {
	
    assertEquals("Z6765", phonet.code("Zedlitz"));
    }
}

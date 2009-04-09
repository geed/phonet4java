/**
 *
 */
package com.googlecode.phonet4java;


/**
 * @author Jesper Zedlitz &lt;jze@informatik.uni-kiel.de&gt;
 *
 */
public class Phonet1 extends Phonet implements Coder {
    /**
      * @see com.googlecode.phonet4java.Coder#code(java.lang.String)
      */
    @Override
    public String code(final String input) {
        return this.phonet(input, 1);
    }
}

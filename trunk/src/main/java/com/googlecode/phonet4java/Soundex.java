/**
 *
 */
package com.googlecode.phonet4java;


/**
 * @author Jesper Zedlitz &lt;jze@informatik.uni-kiel.de&gt;
 *
 */
public class Soundex implements Coder {
   

    /**
      * @see com.googlecode.phonet4java.Coder#code(java.lang.String)
      */
    public String code(final String input) {
        if ((input == null) || input.trim().isEmpty()) {

            return "Z000";
        }

        /* a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z */
        int[] code =
            {
                0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1,
                0, 2, 0, 2
            };
        char[] key = { 'Z', '0', '0', '0' };
        char ch;
        int last;
        int count;
        int scount;

        String in = input.toUpperCase().replace('Ä', 'A').replace('Ö', 'O')
        .replace('Ü', 'U').replace('ß', 's');

        try {
            key[0] = in.charAt(0);
            last = code[key[0] - 'A'];
            scount = 1;

            for (count = 1; (count < 4) && (scount < in.length()); ++scount) {
                ch = in.charAt(scount);

                if (last != code[ch - 'A']) {
                    last = code[ch - 'A'];

                    if (last != 0) {
                        key[count++] = (char) ('0' + last);
                    }
                }
            }
        } catch (final ArrayIndexOutOfBoundsException e) {
            // if we hit an unknown character return Z000
            return ("Z000");
        }

        return new String(key);
    }
}

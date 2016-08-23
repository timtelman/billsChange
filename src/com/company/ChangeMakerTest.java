package com.company;

import junit.framework.TestCase;


/**
 * Created by aaronrhodes on 8/18/16.
 */
public class ChangeMakerTest extends TestCase {
    private ChangeMaker changeMaker = new ChangeMaker();

    public void testMakeChange(){
        assertEquals(4, changeMaker.makeChange(ChangeMaker.Denomination.ONE));
        assertEquals(20, changeMaker.makeChange(ChangeMaker.Denomination.FIVE));
        assertEquals(40, changeMaker.makeChange(ChangeMaker.Denomination.TEN));
        assertEquals(80, changeMaker.makeChange(ChangeMaker.Denomination.TWENTY));
    }

}
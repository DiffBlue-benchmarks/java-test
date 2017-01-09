package com.diffblue.java_test;

import org.junit.*;
import static org.junit.Assert.*;
import com.diffblue.java_testcase.*;

/**
 * Created by jamesw on 09/01/2017.
 */
public class AdditionsTest {

    /* This test case reaches the following goals:
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 1
 *  com/diffblue/java_test/Additions.java:20
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 3
 *  com/diffblue/java_test/Additions.java:24
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 4
 *  com/diffblue/java_test/Additions.java:25
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 5
 *  com/diffblue/java_test/Additions.java:25
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 6
 *  com/diffblue/java_test/Additions.java:26
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 7
 *  com/diffblue/java_test/Additions.java:27
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 8
 *  com/diffblue/java_test/Additions.java:28
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 9
 *  com/diffblue/java_test/Additions.java:29
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 12
 *  com/diffblue/java_test/Additions.java:25
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 13
 *  com/diffblue/java_test/Additions.java:34
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 14
 *  com/diffblue/java_test/Additions.java:34
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 17
 *  com/diffblue/java_test/Additions.java:40
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 18
 *  com/diffblue/java_test/Additions.java:40
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 19
 *  com/diffblue/java_test/Additions.java:40
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 20
 *  com/diffblue/java_test/Additions.java:41
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 21
 *  com/diffblue/java_test/Additions.java:41
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 26
 *  com/diffblue/java_test/Additions.java:48
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 27
 *  com/diffblue/java_test/Additions.java:48
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 32
 *  com/diffblue/java_test/Additions.java:40
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 33
 *  com/diffblue/java_test/Additions.java:57
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 39
 *  com/diffblue/java_test/Additions.java:65
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 40
 *  com/diffblue/java_test/Additions.java:65
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 41
 *  com/diffblue/java_test/Additions.java:66
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 43
 *  com/diffblue/java_test/Additions.java:68
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 44
 *  com/diffblue/java_test/Additions.java:69
 * function java::com.diffblue.java_test.Additions.checkTicTacToePosition:([B)B block 46
 *  com/diffblue/java_test/Additions.java:73
 */

    @org.junit.Test
    public void com_diffblue_java_test_Additions_checkTicTacToePosition_100504ff5d66aea9_001() throws Exception {
    /* initialize test parameters */
        com.diffblue.java_test.Additions tmp_object_factory$9=(com.diffblue.java_test.Additions) Reflector.forceInstance("com.diffblue.java_test.Additions");
        byte [] dynamic_2_array=new byte []{ (byte)1, (byte)1, (byte)2, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1 };
        byte [] dynamic_object1=(byte [])dynamic_2_array;
        byte [] a=(byte [])dynamic_object1;

    /* call function under test */
        byte retval;
        retval = tmp_object_factory$9.checkTicTacToePosition(a);

    /* check return value */
        assertEquals(retval, (byte)2);
    }

}

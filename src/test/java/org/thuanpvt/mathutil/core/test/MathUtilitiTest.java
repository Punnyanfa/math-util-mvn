/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thuanpvt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.thuanpvt.mathutil.core.MathUlitili;

/**
 *
 * @author ASUS
 */
public class MathUtilitiTest {
    
   @Test
   public void testFactorialGivenRightArgumentReturnsWell(){
       assertEquals(1, MathUlitili.getFactorial(0));
       assertEquals(1, MathUlitili.getFactorial(1));
       assertEquals(2, MathUlitili.getFactorial(2));
       assertEquals(6, MathUlitili.getFactorial(3));
       assertEquals(120, MathUlitili.getFactorial(5));
       
        
   }
}
//TDD : TEST DRIVEN DEVELOPMENT

//DDT: DATA DRIVEN TESTING 



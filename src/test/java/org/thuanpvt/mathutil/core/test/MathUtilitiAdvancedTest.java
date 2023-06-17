/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thuanpvt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thuanpvt.mathutil.core.MathUlitili;

/**
 *
 * @author ASUS
 */
public class MathUtilitiAdvancedTest {
    
    //CHUẨN BỊ SÃN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM 
    //hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/
    public static Object[][] initTestData(){
        Object[][] testData = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {5, 120},
                               {6, 720}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
   public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
                    //tham số hóa việc đưa test data vào hàm assertE()
                    //biến đổi dữ liệu thành tham số cho tổng quát 
                    //Parameterized
       assertEquals(expected, MathUlitili.getFactorial(n));
      
       
        
   }
    
}

//TDD vs. DDT
/* TDD - TESS DRIVEN DEVELOPMENT
kĩ thuật viết code chính đan xen, xen kẽ ccùng với viết TEST CASE 
TEST SCRIPT, tức là quá trình viết code làm app ta viết luôn những đoạn code 
(dùng thư viện Unit Tét, TESTNG, xUNIT....)dùng để test hàm ta vừa viết
- Viết code và viết code test với nhau thì goij là kĩ thuật lập trình hướng về kiểm thử - TDD

DDT - DATA DRIVEN TESTING 
là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD
là kĩ thuật viết test code mà ta tách riêng những bộ dâta test ra 1 chỗ , câu lệnh so sánh ra 1 chỗ 
kết nối map/fill test data vào hàm test thông qua các tham số {6,720} ->full vào 2 biến n 
expected và lát hồi 2 biến này được fill vào tiếp cái hàm assertEquals(expected, getF(n))

DAta đc tách riêng 
*/
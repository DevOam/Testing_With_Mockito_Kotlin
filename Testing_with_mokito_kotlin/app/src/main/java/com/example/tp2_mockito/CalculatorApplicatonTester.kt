package ma.projet.android.calculapplication

import com.example.tp2_mockito.CalculatorApplication
import com.example.tp2_mockito.CalculatorService
import org.junit.Assert.assertEquals

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.junit.Assert.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class CalculatorApplicationTester {
    @InjectMocks
    var calculatorApplication = CalculatorApplication()

    @Mock
   lateinit var calcService: CalculatorService
    @Test
    fun testAdd() {
        `when`(calcService.add(10.0, 20.0)).thenReturn(30.00)
        assertEquals(calculatorApplication.add(10.0, 20.0), 30.0, 0)
    }
}
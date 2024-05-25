package controllers;

import java.util.ArrayList;
import models.Vehicle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReceiptControllerTest {
    
    public ReceiptControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCreateReceipt() {
        System.out.println("createReceipt");
        TableController tableController = new TableController();
        ArrayList<Vehicle> purchasedVehicleList = tableController.getVehicleTable();
        ReceiptController instance = new ReceiptController();
        instance.createReceipt(purchasedVehicleList);
    }

    @Test
    public void testIVACalculator() {
        System.out.println("IVACalculator");
        float value = 1234.12F;
        ReceiptController instance = new ReceiptController();
        float expResult = 234.48280F;
        float result = instance.IVACalculator(value);
        assertEquals(expResult, result, 0);
    }    
}

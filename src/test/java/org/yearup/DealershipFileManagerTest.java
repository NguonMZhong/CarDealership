package org.yearup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.converter.DefaultArgumentConverter;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest
{

    @Test
    public void loadInventorys_should_loadAllInventoryFromFIle()
    {
        // arrang
        String testFile = "data/test_inventory.csv";
        DealershipFileManager fileManager = new DealershipFileManager(testFile);
        Dealership dealership1 = new Dealership("D & B Used Cars", "111 Old Benbrook Rd", "817-555-5555");

        ArrayList<Dealership> expectedList = new ArrayList<>();
        expectedList.add(dealership1);

        // act
        Dealership actualList = fileManager.getDealership();

        // assert
        assertEquals(expectedList.size(), actualList.size(), "Because the test file only has 1 inventorys");
        for (Dealership expected : expectedList)
        {

            assertEquals(expected.getName(), actualList.getName(), "because the name should match");
            assertEquals(expected.getAddress(), actualList.getAddress(), "because the address should match");
            assertEquals(expected.getPhone(), actualList.getPhone(), "because the phone number should match");
        }

    }

}
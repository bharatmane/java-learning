package io.github.bharatmane.banking.services;

import io.github.bharatmane.banking.entity.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankingServiceTest {

    @Test
    @DisplayName("Should have valid list of customers when initialized")
    void  shouldHaveValidListOfCustomersWhenInitialized(){
        List<Customer> customers = new ArrayList<Customer>(Arrays.asList(
                new Customer("jack","jack@123"),
                new Customer("jill","jill@123")
        ));

        //Given
        BankingService bankingService = new BankingService(customers);

        //When

        //Then
        assertThat(bankingService.getCustomerCount()).isEqualTo(2);
    }

}

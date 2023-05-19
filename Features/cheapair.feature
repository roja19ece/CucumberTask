
Feature: CheapAir FlightBooking Details

  Scenario: FlightBooking Scenario 
    Given launch the Application
   When enter the credential details
    Then  find the list of flights
    And Enter the details of passengers
    | AthiRam  | S | Male   | March    | 04 | 1991 |
      | palani    | V | Male   | December | 13 | 1997 |
      | vijay  | C | Male   | July     | 13 | 1972 |
      | Radha        | V | Female | March    | 06 | 1982 |
      | Vicky| V | Male   | December | 13 | 2000 |
      | Nivetha      | V | Female | June     | 06 | 2003 |
      | jeevana      | S | Female | August   | 24 | 2015 |
      | Athiksha     | A | Female | February | 21 | 2017 |
    
    When Enter the cerdit card details

   | 1234567891234567 | 04 - April| 2023 | 0606 | Roja | India | Bangalore,tamilnadu | Bangalore | 1234567891 |
    Then Click on purchase button
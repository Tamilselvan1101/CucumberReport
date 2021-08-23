  Feature: Verifying Adactin details

  Scenario Outline: Verifying Adactin login with valid credentials
    When Am enter the "<userName>", "<password>" and enter the login button
    And I search the Hotel "<location>","<hotel>","<roomType>","<noOfRooms>","<adult>","<child>" and select the Hotel
    And I enter the details "<firstName>","<lastName>","<address>","<cardNo>","<cardType>","<month>","<year>","<cvv>" and order the Hotel
    Then I should get the order Id

    Examples: 
      | userName        | password   | location    | hotel          | roomType     | noOfRooms | adult   | child    | firstName | lastName | address | cardNo           | cardType         | month    | year | cvv |
      | Tamilselvan1101 | Tamil@1101 | Melbourne   | Hotel Creek    | Standard     | 1 - One   | 1 - One | 1 - One  | Tamil     | Antony   | Chennai | 9876567876543345 | American Express | January  | 2021 | 255 |
      #| Tamilselvan1101 | Tamil@1101 | Brisbane    | Hotel Sunshine | Double       | 2 - Two   | 2 - Two | 0 - None | Pratheep  | Partha   | vellore | 4534567876543219 | VISA             | February | 2022 | 234 |
      #| Tamilselvan1101 | Tamil@1101 | Adelaide    | Hotel Hervey   | Deluxe       | 1 - One   | 2 - Two | 1 - One  | Tamil     | Antony   | Japan   | 8765456543218765 | Master Card      | January  | 2021 | 765 |
      #| Tamilselvan1101 | Tamil@1101 | London      | Hotel Cornice  | Double       | 2 - Two   | 1 - One | 0 - None | Krish     | tic      | vellore | 4353543543454356 | Master Card      | February | 2022 | 567 |
      #| Tamilselvan1101 | Tamil@1101 | New York    | Hotel Sunshine | Super Deluxe | 1 - One   | 2 - Two | 0 - None | Krish     | tic      | Japan   | 9876567876543345 | VISA             | February | 2021 | 234 |
      #| Tamilselvan1101 | Tamil@1101 | Los Angeles | Hotel Hervey   | Standard     | 2 - Two   | 1 - One | 1 - One  | Pratheep  | Partha   | Chennai | 4534567876543219 | American Express | January  | 2021 | 987 |
      #| Tamilselvan1101 | Tamil@1101 | Paris       | Hotel Cornice  | Super Deluxe | 1 - One   | 2 - Two | 0 - None | Krish     | tic      | vellore | 8765456543218765 | Master Card      | February | 2021 | 234 |
      #| Tamilselvan1101 | Tamil@1101 | Los Angeles | Hotel Sunshine | Standard     | 2 - Two   | 1 - One | 1 - One  | Tamil     | Antony   | Japan   | 9876567876543345 | American Express | January  | 2022 | 567 |
      #| Tamilselvan1101 | Tamil@1101 | Brisbane    | Hotel Creek    | Super Deluxe | 2 - Two   | 2 - Two | 0 - None | Krish     | tic      | vellore | 4353543543454356 | VISA             | February | 2022 | 345 |
      #| Tamilselvan1101 | Tamil@1101 | Paris       | Hotel Cornice  | Double       | 1 - One   | 1 - One | 1 - One  | Pratheep  | Partha   | Chennai | 8765456543218765 | Master Card      | January  | 2021 | 123 |

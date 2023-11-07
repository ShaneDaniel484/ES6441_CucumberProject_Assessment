Feature: registering in democart

  Scenario Outline: registering using datatables
    Given launching the website DemoShop
    When click the register in webpage
    And given the gender in register page
    And given the first name in register page
      | firstname |
      | shane     |
    And given the last name in register page
      | lastname |
      | daniel   |
    And given the email in register page
      | Email               |
      | algaehean151@gmail.com |
    And given the password in register page
      | password |
      | test1234 |
    And click the confirm password for agree
      | cpassword |
      | test1234  |
    And At end click the register
    Then checking the register was successfull

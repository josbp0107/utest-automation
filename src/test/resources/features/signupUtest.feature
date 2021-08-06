
@stories
  Feature: Sign up Utest
    As a user, I want to automate the process to signup at the Utest web site
    @scenario1
    Scenario Outline: Fill out all step of registration
      Given than juan wants to register at Utest
      When he enters each data in the different inputs
      | firstName   | lastName   | email   | language    | city   | password     | confirmPassword    | zipCode   |
      | <firstName> | <lastName> | <email> |  <language> | <city> | <password>   | <confirmPassword>  |<zipCode>  |
      Then he fill all fields and completes the registration and redirects to the home page
      | welcome   |
      | <welcome> |

      Examples:
        | firstName   | lastName    | email            | language    | city      | zipCode     | password         | confirmPassword  | welcome   |
        | Jose        | Ballesteros | cvb@cvb.com |  Spanish    | Sincelejo | 700001      | M`(YxK6*4Hs(KPp2 | M`(YxK6*4Hs(KPp2 |Welcome to the world's largest community of freelance software testers! |


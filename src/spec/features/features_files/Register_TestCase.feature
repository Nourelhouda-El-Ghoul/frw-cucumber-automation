
Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire a fin de mon register

  @modulereg
  Scenario Outline: Verifier le module register
    Given Je me connecte sur la application Mercury
    When je suis clique sur le navigation registre
   

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

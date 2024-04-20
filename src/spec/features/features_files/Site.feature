
Feature: Je Souhaite verifier les widgets de site bouletcorp

  @boul
  Scenario: Je Souhaite verifier les widgets de site bouletcorp
    Given Je me rends sur le site bouletcorp
    When Je clique sur l onglet Apropos
    Then la page a change
    And les widgets facebook,twitter et instagram sont affiches
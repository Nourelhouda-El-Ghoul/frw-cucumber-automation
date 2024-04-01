
Feature: Je fait le inscription au site
 En tant que nouvel utilisateur je souhaite créer un compte au site mercury

  @register
  Scenario: Je verifier le page de inscription
    Given je suis sur la page de login
    When je suis clique sur le navigation registre 
    And Je saisie le first name "Nour"
    And Je saisie le last name "gh"
    And Je saisie le Phone "789456123"
    And Je saisie le Email "nour@gmail.com"
    And Je saisie le Address "medenine"
    And Je saisie le City "medenine sud"
    And Je saisie le State "medenine"
    And Je saisie le Code "4100"
    And Je saisie le Country "TUNISIA"
    And Je saisie le Username "nour"
    And Je saisie le Password "123"
    And Je saisie le Confirmpasword "123"
    And Je clique sur le bouton soumettre     
    Then Je me redirige vers la page registre succes "Note: Your user name is ."



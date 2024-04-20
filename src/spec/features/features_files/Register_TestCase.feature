
Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire a fin de mon register

  @modulereg
  Scenario Outline: Verifier le module register
    Given Je me connecte sur la application Mercury
    When je suis clique sur le bouton registre 
    And Je saisie le firstname "<firstname>"
    And Je saisie le lastname "<lastname>"
    And Je saisie le Phone "<Phone>"
    And Je saisie le Email "<Email>"
    And Je saisie le Address "<Address>"
    And Je saisie le City "<City>"
    And Je saisie le State "<State>"
    And Je saisie le Code "<Code>"
    And Je saisie le Country "<Country>"
    And Je saisie le Username "<Username>"
    And Je saisie le Password "<Password>"
    And Je saisie le Confirmpasword "<Confirmpasword>"
    And Je clique sur le bouton soumettre     
    Then Je me redirige vers la page registre succes "<Message>"
   

    Examples: 
      | firstname  | lastname | Phone       | Email        | Address | City         | State  | Code | Country | Username | Password | Confirmpasword | Message|
      | Nour       |     gh   | 78945612223 |nour@gmail.com|medenine |medenine sud  |medenine|4100  |TUNISIA  |nour      |123       |123             |Note: Your user name is nour@gmail.com.|
      | ali        |     da   | 789456122   |ali@gmail.com |pais     |Paris         |Paris   |70123 |FRANCE   |ali       |123       |123             |Note: Your user name is ali@gmail.com.|
      

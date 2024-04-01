

Feature: Je verifie la page de authentification
 En tant que utilisateur je souhaite me connecte au site mercury
  @connexion
  Scenario: Je verifie la page de authentification
   Given Je me connecte sur la application Mercury
   When Je saisie le username "Test"
   And Je saisie le password  "Test"
   And Je clique sur le bouton submit 
   Then Je me redirige vers la page home "Login Successfully"
  

# FragmentsLab – LAB 4
Application Android permettant de manipuler des fragments dynamiques afin de créer une interface interactive et moderne.

## Objectif:
Le but de ce laboratoire est de :
- Comprendre le fonctionnement des fragments
- Naviguer entre plusieurs écrans dynamiques
- Gérer les interactions utilisateur (clics, sliders…)
- Manipuler le cycle de vie des fragments
  
## Description de l’application:
L’application contient :
- Une barre de navigation (Accueil / Valeur)
- Un conteneur dynamique (FrameLayout)
- Deux fragments :
    - Fragment d’accueil (message interactif)
    - Fragment de contrôle (SeekBar)
  
## Fonctionnalités:
- Navigation entre fragments avec boutons
- Affichage dynamique du contenu
- Interaction utilisateur :
    - Bouton → affiche un message
    - SeekBar → modifie une valeur en temps réel
- Sauvegarde de l’état (rotation écran)

## Technologies utilisées:
- Android Studio
- Java
- XML (interface utilisateur)
- API minimum : 24 (Android 7.0)

## Aperçu de l’application:

<p align="center">
  <img width="244" src="https://github.com/user-attachments/assets/ffa0f64b-5158-486c-b763-e3f7a4417a75" />
  <img width="244" src="https://github.com/user-attachments/assets/83edb769-bac6-47e4-97a7-97de7f1e07a6" />
</p>

<p align="center">
  <img width="244" src="https://github.com/user-attachments/assets/1d27efee-4a18-4072-ada2-6c455159584a" />
  <img width="244" src="https://github.com/user-attachments/assets/c05360c6-8af3-4a2e-a297-dc95030bf0c8" />
</p>

## Structure du projet:

### **res/layout/activity_main.xml** – Interface principale

Ce fichier contient la structure globale de l’application.

- Structure générale:
   - Un LinearLayout vertical
   - Une barre de navigation en haut
   - Un conteneur dynamique (FrameLayout)
     
- Barre de navigation:
   - Deux boutons stylisés (orange / vert)
   - Permettent de changer de fragment
     
- Conteneur dynamique:
   - FrameLayout (dynamicFragmentZone)
   - Sert à afficher les fragments dynamiquement

### **res/layout/fragment_welcome.xml** – Fragment Accueil

- Contenu:
  - Texte principal
  - Bouton interactif

- Fonction:
  - Affiche un message après clic
  - Interface centrée avec carte stylisée
 
### **res/layout/fragment_mood.xml** – Fragment Valeur

- Contenu:
  - TextView affichant une valeur
  - SeekBar (0 → 100)

- Fonction:
  - Met à jour la valeur en temps réel
  - Sauvegarde l’état lors de la rotation


 ### **res/drawable/** – Design personnalisé
 Les fichiers drawable définissent l’apparence graphique de l’application.
 
- **bg_app.xml**:
  
      -- Fond global avec gradient coloré
      -- Donne une identité visuelle moderne
  
- **bg_card.xml**:
  
      -- Carte principale (coins arrondis + ombre)
      -- Conteneur des fragments
  
- **bg_button_left.xml**:
  
      -- Bouton orange (navigation accueil)
  
- **bg_button_right.xml**:
  
      -- Bouton vert (navigation valeur)
  
- **bg_small_button.xml**:
  
      -- Bouton interne stylisé (fragment accueil)

### **res/values/** – Ressources globales

- **colors.xml**:
  
      -- Centralise toutes les couleurs
      -- Permet cohérence visuelle
  
- **themes.xml / themes-night.xml**:
  
      -- Définit le thème global
  
      -- Personnalise les couleurs principales

### **java/ma/ens/fragmentslab/MainActivity.java** – Contrôleur

- **Initialisation**:
  
      -- setContentView(activity_main)
  
- **Navigation**:
  
      -- replace() → change le fragment affiché
      -- addToBackStack() → permet retour arrière

- **Gestion**:
  
      -- Utilise FragmentManager et FragmentTransaction
  
### **java/ma/ens/fragmentslab/WelcomeFragment.java**

- **Fonction**:

      -- Gère l’affichage du message
      -- Réagit au clic utilisateur

- **Méthode clé**:

      -- onViewCreated() → initialise les composants

### **java/ma/ens/fragmentslab/MoodFragment.java**

- **Fonction**:

      -- Gère la SeekBar et l’affichage de la valeur

- **Particularité**:

      -- Sauvegarde de l’état avec onSaveInstanceState()


## Conclusion:
Ce laboratoire introduit une architecture plus avancée que les interfaces classiques en séparant :
   - la navigation (Activity)
   - les vues dynamiques (Fragments)
   - le design (XML + drawable)
     
Il constitue une base essentielle pour développer des applications Android modernes avec interfaces modulaires et interactives.





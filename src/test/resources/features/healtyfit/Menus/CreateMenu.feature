Feature: Create Menu

  @CreateMenu
  Scenario: Create Menu By Admin
    When Admin input menu category "breakfast" and  food ikan salmon panggang id "ad8r9dpWNLz7VQ4boC7g2M" dan food id apel "oEwQ5TSptqqWuypQPeuwG"
    Then The menu created

  Scenario: Create Menu By Admin
    When Admin input menu category "dinner" and  food almon id "PR4ydN9Hf2vvTZAkoG7RG8" dan food id Bajigur "g2SHfZjUzXnp7yaMNWJyDK"
    Then The menu created
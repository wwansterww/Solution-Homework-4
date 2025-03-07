Hello! I Iken Ansar, have completed this task.
--------------------------------------------------

This project demonstrates two key design patterns implemented in Java:
Singleton Pattern:
-------------------------
Implemented by the ConfigurationManager class, responsible for managing predefined configuration settings.
Adapter Pattern:
-------------------------
Demonstrates how a legacy chat system (LegacyChatService) can be adapted to the new ChatService interface via the ChatServiceAdapter.

Project Structure:
-------------------------
src/
├── ConfigurationManager.java      
├── ConfigManagerDemo.java         
├── ChatService.java               
├── ChatServiceAdapter.java        
└── LegacyChatService.java 

Compilation Instructions:
-------------------------
1. Ensure you have Java installed (JDK 8 or higher).
2. Open a terminal/command prompt in the project directory.
3. Compile all Java files:
   javac *.java

Execution Instructions:
-----------------------
1. To run the Configuration Manager demo:
   java ConfigManagerDemo

   Expected output:
   maxPlayers: 100
   Configuration Settings:
   maxPlayers → 100
   defaultLanguage → en
   gameDifficulty → medium

2. To run the Chat Service Adapter demo:
   java ChatAdapterDemo

   Expected output:
   Legacy Chat: Hello world!

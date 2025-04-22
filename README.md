# Masterclass: Interaction of IDEs with AIs

This project contains the labs for the Masterclass on how AI tools (DeepSeek, Grok, Copilot, Tabnine, Codeium, ChatGPT, Claude, Screenshot2Code, Lovable, Aider, Devin, Replit) interact with IDEs like VS Code and Cursor. In the labs you'll find several scenarios where AI integrarion could be used.
 
 - To fix
 - To explain
 - To correct
 - To interact

Beyond of that, you'll learn what the limits of AI are, which engine is better for what and how to ask them for help. And have a good laugh on the way, of course

May the source be with you!



## Requirements
- **IDE:** Visual Studio Code or Cursor
- **Java:** JDK 17+
- **Maven:** For dependencies
- **VS Code/Cursor Extensions:**
  - GitHub Copilot (`github.copilot`)
  - Tabnine (`tabnine.tabnine-vscode`)
  - Codeium (`codeium.codeium`)
  - Java Extension Pack (`vscjava.vscode-java-pack`)
  - Spring Boot Extension Pack (`pivotal.vscode-spring-boot`)
  - Pact-JVM (`pact-jvm`)

## Setup
1. Clone the repository: `git clone <repository-url>`
2. Open in VS Code/Cursor: `File > Open Folder`
3. Install dependencies: `mvn clean install`
4. Configure AI tools:
   - **Copilot/Tabnine/Codeium:** Activate the extensions.
   - **DeepSeek/Grok:** Use deepseek.com/grok.com or APIs.
   - **Screenshot2Code:** Configure locally (see GitHub).
   - **ChatGPT/Claude/Lovable/Aider/Devin/Replit:** Follow their official guides.

## Labs
1. **Lab 1:** QuickSort generation (DeepSeek, Grok, Copilot).
2. **Lab 2:** Unit tests for `sumArray` (JUnit).
3. **Lab 3:** Contract tests for REST API (Pact).
4. **Lab 4:** Debugging binary search.
5. **Lab 5:** Palindrome optimization.
6. **Lab 6:** HTML from mockup (Screenshot2Code).

## Execution
- Compile: `mvn compile`
- Run tests: `mvn test`
- Run main: `mvn exec:java -Dmain.class=<ClassName>`

## Notes
- Check the `README.md` of each lab for specific instructions.
- Reflect on the limitations of AIs in each task.
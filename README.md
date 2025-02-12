# SQ-LLM-TestGeneration
This repository accompanies the project work of the group 'NullPointerExceptionals' for the course 'Software Quality' in the winter semester 2024/25 at the University of Cologne. It contains documentation of the llm-based test case generation. With it presents examplary source code and the respective tests generated by two frameworks that have been used for test generation. A GPT3-5 turbo was used to generate the test. As tools we used Qodo Cover (as Link Please https://github.com/qodo-ai/qodo-cover) and Chatunitest (as link please https://github.com/ZJU-ACES-ISE/chatunitest-maven-plugin) as the maven plug in. As source code we used some small projects/skripts due to financial and token wise restrictions. Please check out the tests that were generated by the llm! For further information and the respective report conduct the creators of this repository.

## Table of Contents

- [Course Task](#course-task)
- [Project Structure](#project-structure)
- [Qodo Cover](#qodo-cover)
- [ChatUniTest](#chatunitest)
- [Contact Information](#contact-information)

## Course Task

The task for this university project was to investigate and implement LLM-based test case generation for software testing. The primary goal was to assess how LLMs can help automate the process of generating valid and efficient test cases to improve software quality assurance. The project involved using Qodo Cover for this purpose and testing various approaches to achieve optimal results.

## Project Structure

- **`src/`**  
  This folder contains the source code responsible for generating the test cases. The main script `test_case_gen.py` leverages the power of LLMs to create tests based on predefined inputs and scenarios.

- **`test/`**  
  The test folder contains unit tests used to validate the generated test cases. It ensures that the generated tests meet the expected criteria and that the functionality works as intended.

- **`report/`**  
  This folder includes the generated reports and related documentation. It contains a PDF report summarizing the results of the test case generation process and a markdown file with detailed documentation on the project, including setup instructions and findings.

## Qodo Cover

For the task of test case generation, we used **Qodo Cover**, a tool designed to assist with the automated generation of high-quality test cases. Qodo Cover integrates with Large Language Models to streamline the process of creating test cases based on given inputs, allowing us to evaluate different strategies for generating valid test cases and improving software quality.

## ChatUniTest

For the task of test case generation, we used **Qodo Cover**, a tool designed to assist with the automated generation of high-quality test cases. Qodo Cover integrates with Large Language Models to streamline the process of creating test cases based on given inputs, allowing us to evaluate different strategies for generating valid test cases and improving software quality.

## Contact Information

For questions or collaboration inquiries, feel free to reach out:

- **Name**: [Kevin Schomaker]
- **Email**: [kschomak@smail.uni-koeln.de]
- **GitHub**: [KevSch96]

__________________________________________________________________

- **Name**: [Nils Hornstein]
- **Email**: [nhornste@smail.uni-koeln.de]
- **GitHub**: [Hornston3]

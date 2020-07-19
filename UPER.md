<h1>The Problem Solving Framework : 'UPER'</h1>

* U = "Understand"
* P = "Plan"
* E = "Execute"
* R = "Reflect" / "Refactor"

<h2>1. Understanding the Problem</h2>
*
<h3>Assigment Description</h3>
*
Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.
*
When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.
*
Write an application that prints out the receipt details for these shopping baskets...
*
*
<h2>2. Planning the Solution</h2>
*
Your focus should be on these elements of code quality:
*
Code easy to read and maintain code (i.e. Clean code)
Use object-oriented design patterns (OOD)
Use object-oriented design principles (SOLID) (Expandable Design)
Create Unit testing (TDD)
*
<h2>3. Executing the Plan</h2>
*
Develop a strategy pattern
*
Create classes for each unique tax rule
- Books
- Food
- Goods
- Imports (Interface)
- Medical Products
*
Create separate package for product classes
*
Configure JUnit5 Test package to test primary tax methods
*
<h2>4. Reflection / Refactor</h2>
*
Creating a strategy pattern based on requirements and unique tax rules, helped me use OOP effectively to write clean, expandable code. 
*

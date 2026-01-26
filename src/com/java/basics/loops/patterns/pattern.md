**🧩 Pattern Printing – Rulebook (Java)**

This document defines reusable rules and mental models for solving pattern-printing problems using loops.

1. **Core Principle (Read This First)**

Every pattern is a grid of rows and columns.
Even if it doesn’t look like one at first.

2. The Golden Rules (Non-Negotiable)
   🥇 Golden Rule 1: One loop = one responsibility
Outer loop → controls rows
Inner loop → controls columns / printing inside a row
If a problem has rows → it needs nested loops.

🥈 Golden Rule 2: Never modify loop control variables manually
❌ Don’t do this:
i = 1;
Inside a loop that already controls i.
✔ Let loops manage their own variables.

🥉 Golden Rule 3: Inner loop limit depends on the outer loop
Most patterns follow this form:
innerLoop <= outerLoop
That is the pattern link.
Examples:
Triangle → columns = row number
Pyramid → spaces + stars depend on row
Number pattern → values reset each row

🏅 Golden Rule 4: New line belongs to the outer loop
print() → inside inner loop
println() → after inner loop
Never the other way around.

3. Mandatory Questions to Ask Before Coding
Before writing code, answer these on paper or in your head:
How many rows are there?

What changes row by row?
What repeats inside a row?
When does printing reset?
What decides the inner loop limit?
If you can answer these, the code writes itself.

4. Standard Loop Skeleton (Template)
Use this structure for almost every pattern:
for (int row = 1; row <= n; row++) {

    for (int col = 1; col <= /* depends on row */; col++) {
        // print something
    }

    System.out.println();
}

Only the inner loop condition and print content change.

5. Variable Naming Rules (Clarity matters)
Preferred:
row, col
i, j (only if simple)
Avoid:
Reusing same variable for different roles
Meaningless resets
Good naming helps visualize the pattern.

6. Reset Rule (Very Important)
Any value that must restart each row
must be inside the outer loop
Example:
Numbers starting from 1 each row
Character counters
Never reset such values outside.

7. Pattern Debugging Checklist
If output is wrong, check in this order:
Is the outer loop correct?
Is the inner loop limit tied to the row?
Is println() in the right place?
Are you modifying loop variables manually?
Did you mix print and println incorrectly?

8. Common Mistakes (Avoid These)
❌ Resetting loop variables
❌ Hardcoding limits
❌ Printing new lines too early
❌ Using single loop for multi-row patterns
❌ Guessing instead of simulating one row

9. Mental Simulation Rule (Mandatory)
Before running code, simulate:
Row 1
Row 2
Row 3
If you can’t simulate it, don’t run it yet.

10. Universal Truth About Pattern Problems
Pattern problems are not about syntax.
They are about control flow and discipline.
Once logic is clear, Java is trivial.

11. When You’re Stuck (Recovery Strategy)
Stop coding
Draw the pattern
Label rows and columns
Apply Golden Rules
Rewrite with the standard skeleton


Final Note
If you master this rulebook, you can solve:
Number patterns
Star patterns
Character patterns
Half / full pyramids
Inverted patterns
With zero memorization.

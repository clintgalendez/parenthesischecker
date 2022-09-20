A Stack implementation of the "Equal Parenthesis" problem.

The problem is to check if the parenthesis in a string are balanced.
The string is considered balanced if the parenthesis are balanced.
The parenthesis are balanced if the parenthesis are closed in the reverse order of opening.
For example, the string "((()))" is balanced, but "(()))" is not balanced.
The solution is to use a stack to push the opening parenthesis and pop the closing parenthesis.
If the stack is empty at the end of the string, then the parenthesis are balanced.
If the stack is not empty, then the parenthesis are not balanced.

#Single Line Comment Using Hash Symbol

'''
 - Multi-line Comments Using Triple Quotes
 - This File Demonstrates the use of Variables in Python
'''
# Simple assignment
user_name = "Rishi"         # string assignment
user_age = 21               # integer assignment
is_active = True            # boolean assignment

# Multiple assignment - Destructuring Format
x, y, z = 10, 20, 30

# Reassigning variables
x = "Now, This is a string"

# Swapping values using tuple unpacking
a = 5
b = 10
print(f"Before swap: a={a}, b={b}") 
a, b = b, a
print(f"After swap:  a={a}, b={b}\n")

# Using variables in expressions
length = 7
width = 3
area = length * width  
print(f"Rectangle of {length}x{width} has area = {area}\n")

# Naming conventions
# using snake_case
total_cost = 99.99
# Do Not Use : camelCase or too short
TC = 50                # Avoid
camelCaseExample = 30  # Avoid in Python

# Variable deletion
del total_cost

# Inspecting variable type
print(f"Type of user_age: {type(user_age)}")
print(f"Type of x: {type(x)}")

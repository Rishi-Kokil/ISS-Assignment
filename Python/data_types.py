# Integers
counter = 10
negative_value = -5
sum_result = counter + negative_value
print(f"Sum of {counter} and {negative_value} = {sum_result}")

# Strings (including f-strings)
first_name = "Rishi"
last_name = "Kokil"
full_name = f"{first_name} {last_name}"
print(f"User full name: {full_name}")
print("Uppercase: " + full_name.upper())

# Booleans
is_active = True
is_admin = False
print(f"Active: {is_active}, Admin: {is_admin}")

# Lists
fruits = ["apple", "banana", 2, False, 24.5]
fruits.append("date")
print(f"Fruits list: {fruits}")
print(f"First fruit: {fruits[0]}")

# List comprehension
squared_numbers = [x**2 for x in range(5)]
print(f"Squared numbers: {squared_numbers}")

# Tuples (immutable sequences)
coordinate = (10.0, 20.0)
x_coord, y_coord = coordinate          # unpacking
print(f"Coordinate: x={x_coord}, y={y_coord}")

# Sets (unordered, unique values)
primes = {2, 3, 5, 7, 11}
primes.add(13)
print(f"Prime set: {primes}")

# Set Operations
evens = {2, 4, 6, 8}
common = primes.intersection(evens)
print(f"Common numbers: {common}")

# Dictionaries (key-value pairs)
user_profile = {
    "username": "rkokil",
    "email": "rishi@example.com",
    "age": 21
}

# Access and update
print(f"Username: {user_profile['username']}")
user_profile['age'] += 1
print(f"Updated age: {user_profile['age']}")



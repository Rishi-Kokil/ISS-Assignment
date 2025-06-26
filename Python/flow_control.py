
# If-elif-else
score = 75
if score >= 90:
    print("Grade: A")
elif score >= 75:
    print("Grade: B")
else:
    print("Grade: C or below")

# For loop
print("For loop over list:")
items = ['apple', 'banana', 'cherry']
for fruit in items:
    print(f"- {fruit}")

for i in range(0, len(items)):
    print(f"Data on index {i} : {items[i]}")

# While loop
print("While loop countdown:")
count = 3
while count > 0:
    print(count)
    count -= 1
else:
    print("Lift off!\n")  # loop-else executed when while condition is False

# Break and continue
print("Numbers until skip or break:")
for num in range(1, 10):
    if num == 5:
        print("-- Skipping 5 --")
        continue  # skip the rest of the loop for num=5
    if num == 8:
        print("-- Breaking at 8 --")
        break     # exit loop when num=8
    print(num)
print()


# Loop-else combined
print("Searching for a prime:")
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

for candidate in range(10, 15):
    if is_prime(candidate):
        print(f"Found prime: {candidate}")
        break
else:
    print("No prime found in range.")

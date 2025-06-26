# Parameters and Arguments
def greet_user(name: str) -> None:
    print(f"Hello, {name}!")


# Return Statements
def add_numbers(a: int, b: int) -> int:
    return a + b


def factorial(n: int) -> int:
    if n < 0:
        raise ValueError("n must be non-negative")
    if n in (0, 1):
        return 1
    return n * factorial(n - 1)


def main() -> None:
    greet_user("Rishi")
    x, y = 5, 7
    print(f"{x} + {y} = {add_numbers(x, y)}")
    print(f"Factorial of 5: {factorial(5)}")


if __name__ == "__main__":
    main()
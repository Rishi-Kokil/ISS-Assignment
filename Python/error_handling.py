import logging

# Configure basic logging
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
)
logger = logging.getLogger(__name__)

# Custom exception
class DataValidationError(Exception):
    def __init__(self, message: str):
        super().__init__(message)
        self.message = message


def divide_numbers(a: float, b: float) -> float:
    try:
        result = a / b
    except ZeroDivisionError as e:
        logger.error(f"Division error: cannot divide {a} by zero.")
        raise
    else:
        logger.info(f"Division successful: {a} / {b} = {result}")
        return result


def validate_user_age(age: int) -> None:
    if not (0 <= age <= 120):
        raise DataValidationError(f"Age {age} is out of valid range.")
    logger.info(f"Age {age} is valid.")


def read_file_lines(path: str) -> list:
    try:
        with open(path, 'r') as file:
            lines = file.readlines()
    except FileNotFoundError as e:
        logger.error(f"File not found: {path}")
        raise
    except IOError as e:
        logger.error(f"I/O error reading file {path}: {e}")
        raise
    else:
        logger.info(f"Successfully read {len(lines)} lines from {path}")
        return lines


def main() -> None:
    # Division
    try:
        divide_numbers(10, 0)
    except ZeroDivisionError:
        print("Caught division by zero in main.")

    # Data validation
    try:
        validate_user_age(150)
    except DataValidationError as e:
        print(f"Validation failed: {e}")

    # File reading
    try:
        lines = read_file_lines('nonexistent.txt')
    except Exception:
        print("Failed to read file.")

if __name__ == '__main__':
    main()

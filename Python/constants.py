
# Constants definition
PI = 3.141592653589793  # Mathematical constant Pi
dEFAULT_TIMEOUT = 30     # Default timeout duration in seconds
MAX_RETRIES = 5          # Maximum number of retry attempts
API_ENDPOINT = "https://api.example.com/v1/"  # Base URL for API requests


def calculate_circumference(radius) :
     return 2*PI*radius

print(calculate_circumference(2))
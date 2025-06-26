# Converting to int
import json


txt_number = "42"
try:
    number_int = int(txt_number)
    print(f"String '{txt_number}' converted to int: {number_int}")
except ValueError as e:
    print(f"Conversion error: {e}")


# Converting to float
txt_decimal = "3.1415"
try:
    number_float = float(txt_decimal)
    print(f"String '{txt_decimal}' converted to float: {number_float}")
except ValueError as e:
    print(f"Conversion error: {e}")


# Converting to str
value = 100
value_str = str(value)
print(f"Integer {value} converted to string: '{value_str}'")


# Converting to list from various types
tuple_data = (1, 2, 3)
list_from_tuple = list(tuple_data)
print(f"Tuple {tuple_data} to list: {list_from_tuple}")
string_data = "hello"
list_from_string = list(string_data)
print(f"String '{string_data}' to list of chars: {list_from_string}")


# Converting to tuple
list_data = [4, 5, 6]
tuple_from_list = tuple(list_data)
print(f"List {list_data} to tuple: {tuple_from_list}")


# Converting to set
dupe_list = [1, 2, 2, 3, 3, 3]
set_from_list = set(dupe_list)
print(f"List {dupe_list} to set (duplicates removed): {set_from_list}")


# Using json for complex conversions\import json
dict_data = {"a": 1, "b": 2}
json_str = json.dumps(dict_data)  # dict to JSON string
back_to_dict = json.loads(json_str)  # JSON string to dict
print(f"Dict to JSON: {json_str}")
print(f"JSON back to dict: {back_to_dict}")

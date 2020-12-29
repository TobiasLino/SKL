import json

JSON_PATH: str = 'data/jsons'
READ: str = 'r'


def assert_equals(expected, actual):
    expected_value = load_json(expected)
    actual_value = json.loads(actual)
    assert expected_value == actual_value


def load_json(file_name) -> dict:
    with open(f'{JSON_PATH}/{file_name}', READ) as json_file:
        return json.load(json_file)


def simple_application():
    pass

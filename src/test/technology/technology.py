import unittest
from test.common.commons import assert_equals


def checks_if_technologies_match(client):
    response = client.get('/tech/0001')
    assert_equals('expected-application-technologies.json', response.data)


if __name__ == '__main__':
    unittest.main()

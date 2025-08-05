import pytest

@pytest.mark.activity
def test_sum(num_list):
    #INitialize a sum variable
    sum = 0
    #Calculate sum of numbers in thelist
    for num in num_list:
        sum +=num

    #Assertion
    assert sum == 55

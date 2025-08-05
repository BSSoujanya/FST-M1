import pytest

@pytest.mark.parametrize("earned,spent,expected", [(30,10,20), (20,2,18)])
def test_balance(wallet,earned,spent,expected):
    #Add the earned amount to wallet
    wallet +=earned

    #subtract the spent amount from the wallet
    wallet -=spent

    #Assert the remianing balance
    assert wallet ==expected
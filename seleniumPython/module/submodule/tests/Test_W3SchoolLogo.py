import os
os.path.abspath(os.path.join('/virtusaPython/module/submodule', os.pardir))

from .W3SchoolsSelenium import W3SchoolsSelenium
from selenium import webdriver
import pytest
import time


# os.path.abspath(os.path.join('virtusaPython/module/submodule/', os.pardir))

class Test_W3SchoolLogo():
    
    @pytest.fixture
    def grabObject(self):
        return W3SchoolsSelenium(webdriver.Chrome())
    
    @pytest.fixture
    def prerequiteLogoFetch(self, grabObject):
        grabObject.maximizeWindow()
        grabObject.visitPage()
        grabObject.grabLogo()
        time.sleep(5)
        elementFound = grabObject.isLogoPresent()
        grabObject.quitSession()
        print(elementFound)
        return elementFound
        
         
    
    def test_logoPresence(self, prerequiteLogoFetch):
    
        assert prerequiteLogoFetch is True
       
       


    


        






from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import pytest
import time




class W3SchoolsSelenium:

    def __init__(self, driverReceived: webdriver.Chrome) -> None:
        self.driver : webdriver.Chrome = driverReceived
        self.w3schoolLogo: webdriver.Chrome._web_element_cls = None
       

        
    def visitPage(self) -> None:
        self.driver.get('https://www.w3schools.com/')
        time.sleep(5)

    def maximizeWindow(self) -> None:
        self.driver.maximize_window()
       
    def grabLogo(self) -> None:
        self.w3schoolLogo = WebDriverWait(self.driver, 5, .5).until(EC.presence_of_element_located( (By.XPATH, "//div[@id='pagetop' and contains(@class, 'w3-bar')]/a[1]" ) ))
        # //div[@id='pagetop' and contains(@class, 'w3-bar')]/a[1]
        # self.w3schoolLogo = WebDriverWait(self.driver, 5, .5).until(EC.presence_of_element_located( (By.XPATH, "//div[@id='pagetop' and contains(@class, 'w3-bar')]/a/i[contains(@class, 'fa-logo')]" )) )
        # self.w3schoolLogo = self.driver.find_element(By.XPATH, "//div[@id='pagetop' and contains(@class, 'w3-bar')]/a/i[contains(@class, 'fa-logo')]")
        #print(self.w3schoolLogo)
        print("HELLO HELLO")
       
    
    def isLogoPresent(self) -> bool:
        print("Inside main logoPresent")
        print(self.w3schoolLogo)
        return self.w3schoolLogo.is_displayed()
        
    
    def quitSession(self) -> None:
        self.driver.quit()


    






        
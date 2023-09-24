import time
from lib2to3.pgen2 import driver

import pytest
import self
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

def launching_browser():
    driver = webdriver.Chrome()
    driver.get("https://www.automationanywhere.com/")
    driver.maximize_window()
    print(driver.current_url)

#MouseOver and click Action
try:
    driver.find_element(By.XPATH, "//button[text()='Accept All Cookies']").click()
except Exception as e:
    print("An error occurred:", str(e))

def mouseOver_Action():
    actions = ActionChains(driver)
    product=driver.find_element(By.XPATH,"//a[text()='Products']")
    processDiscovery=driver.find_element(By.XPATH,"//a[text()='Process Discovery']")
    actions.move_to_element(product).move_to_element(processDiscovery).click().perform()
    time.sleep(40)

#comparing the current url with execepted url
def comparing_url():
    current_url=driver.current_url
    Exp_url='https://www.automationanywhere.com/products/process-discovery'self.assertEqual(current_url, Exp_url, 'url missmatched')
driver.quit()








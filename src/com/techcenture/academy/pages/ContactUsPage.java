package com.techcenture.academy.pages;

public class ContactUsPage  extends BasePage{

    public ContactUsPage() {
    }

    public void contactUs(String message){
        System.out.println("contacting with " + message);
    }


    public void verifyContactUsBtn(){
        System.out.println("verifying contact us button");
    }

}

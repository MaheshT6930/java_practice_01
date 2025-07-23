package org.example.anonymousClass;

public class Chase implements CheckClearence{
    @Override
    public void checkFrom() {
        System.out.println("Check From Chase ");
    }

    @Override
    public void clearenceAmount() {
        System.out.println("Amount drafted on the check 1200$");
    }

    public void passedDate(){
        System.out.println("Checked Passed Date: 01/01/2025 ");
    }
}

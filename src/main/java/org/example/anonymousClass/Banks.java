package org.example.anonymousClass;

public class Banks {
    public static void main(String[] args){

        Chase chase= new Chase(){
            @Override
            public void checkFrom() {
                System.out.println("This check is from Chase" );
            }
        };
        chase.clearenceAmount();
        chase.checkFrom();

        CheckClearence clearenceHouse = new CheckClearence() {
            @Override
            public void checkFrom() {
                System.out.println("Check from :?");
            }

            @Override
            public void clearenceAmount() {
                System.out.println("Clearence amount: $.......");

            }
        };
        clearenceHouse.clearenceAmount();
        clearenceHouse.checkFrom();

        Pnc pnc = new Pnc();
        pnc.branchesInfo();

    }

}

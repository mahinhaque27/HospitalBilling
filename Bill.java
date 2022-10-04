public class Bill {
    int pharCharge;
    int roomCharge;
    int docFee;

    Bill(){

    }

    public void setBill(int p, int r, int d){
        pharCharge = p;
        roomCharge = r;
        docFee = d;
    }

    Bill(int p, int r, int d){
        setBill(p, r, d);
    }

    public void printBill(){
        System.out.println("Pharmacy Charges: $" + pharCharge);
        System.out.println("Room Charges: $" + roomCharge);
        System.out.println("Doctor's Fees: $" + docFee);
    }
}
